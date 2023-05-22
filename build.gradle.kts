plugins {
    kotlin("jvm") version "1.8.20"
}

group = "iscte.ambco-jarcv.elp.drawscript"
version = "0.1-SNAPSHOT"

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

kotlin {
    jvmToolchain(11)
}