import org.jetbrains.dokka.base.DokkaBase
import org.jetbrains.dokka.base.DokkaBaseConfiguration
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.com.intellij.openapi.vfs.StandardFileSystems.jar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.20"
    id("org.jetbrains.dokka") version "1.8.10"
    application
}

group = "iscte.ambco-jarcv.elp.drawscript"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.antlr:antlr4:4.12.0")
    implementation("com.github.javaparser:javaparser-symbol-solver-core:3.25.1")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.20")
    implementation("org.ow2.asm:asm:9.4")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

kotlin {
    jvmToolchain(11)
}

buildscript {
    dependencies {
        classpath("org.jetbrains.dokka:dokka-base:1.8.10")
    }
}

tasks.withType<DokkaTask>().configureEach {
    pluginConfiguration<DokkaBase, DokkaBaseConfiguration> {
        footerMessage = "Afonso Caniço & João Pereira, 2023"
        customStyleSheets = listOf(file("resources/logo-styles.css"))
        customAssets = listOf(file("resources/icon.png"))
    }

    // Suppress ANTLR-generated Java files
    dokkaSourceSets.configureEach {
        perPackageOption {
            matchingRegex.set("antlr")
            suppress.set(true)
        }
    }
}

tasks.dokkaHtml {
    outputDirectory.set(projectDir.resolve("docs"))
    moduleName.set("DrawScript")
}

application {
    mainClass.set("MainKt")
}