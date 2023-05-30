<p align="center"><img src="resources/header.png"></p>

# What is this?
**Draw**Script is a simple scripting library that allows for the generation of basic geometric drawings
using Java's Swing library.

This scripting language was developed as the final project for a [Programming Language Engineering](https://fenix.iscte-iul.pt/disciplinas/elp/2022-2023/2-semestre/pagina-inicial)
course as part of elective coursework for the [Bachelor's in Computer Engineering](https://www.iscte-iul.pt/curso/3/licenciatura-engenharia-informatica) at 
[Iscte-IUL](https://www.iscte-iul.pt/).

<br>

## Features
- [x] **Manual creation of Abstract Syntax Tree**
- [ ] **Semantic Validation**
  - [x] Window dimension must be a (x,y) point
  - [x] Window background colour must be an (r,g,b) colour
  - [x] Conditional branches must use Boolean-expression guards
  - [x] Constant references must reference previously-defined constant
  - [x] Colour RGB values must be numeric and in \[0..255]
  - [x] Point x,y coordinates must be numeric
  - [x] Interval bounds must be numeric
    - [x] Bounds must be in ascending order
  - [x] Binary expressions follow operand-operator context-sensitive restrictions (e.g. can only add together numbers, cannot add a number to an interval, etc.)
  - [x] Set-colour instructions must take values of type Colour
  - [ ] Variables can only be referenced in the scope of their definition (inside declaring loop)
- [x] **Parsing**
- [x] **Interpretation**
  - [x] Visualisation window instantiated correctly
  - [x] Figures drawn correctly

# Scripting
A **Draw**Script script is composed by three sections:
- **Constant** definitions;
- Display window **parameters**;
- **Instructions**.

Each of these can make use of script **expressions**, which represent the several data types supported by the language.

## Expressions
An expression is a part of the script that represents a value, as opposed to an instruction telling the script what to
do. For example, you can represent the number 2 using a **Number** expression.
Currently, **Draw**Script supports the following types of expressions:

| **Expression Type** | **Examples**                                |
|---------------------|---------------------------------------------|
| Number              | 2 ; 3 ; 10, ...                             |
| Bool                | true ; false                                |
| Colour              | (255, 255, 255) ; (255,0,0) ; ...           |
| Point               | (0, 0) ; (3, 5) ; (2, 8) ; ...              |
| Interval            | \[0, 3] ; \[2, 7\[ ; \]3, 8] ; ]3, 5[ ; ... |
| Constant Reference  | N ; M ; C ; ...                             |
| Variable Reference  | i ; j ; k ; ...                             |
| Binary Expression   | 2 + 3 ; 10 - i ; 5 <= j ; ...               |

## Constant definitions
A constant can be defined by associating an alphabetical identifier to any valid expression at the start of your script.
For example:
- `N: 256`
- `GRAY: |128|128|128|`
- `MYINTERVAL: [2, 8[`
- ...

## Display window parameters
Each script can take two parameters that specify the dimensions of the display window and its background
colour. These are defined after the constant definitions. For example:
- `dimension: (512, 512)`
- `background: |128|0|128|`

If your script does not define these parameters, they default to (100, 100) and White, respectively.

## Instructions
An instruction specifies some action that the script must take. For example, loops and conditional branches.
Currently, **Draw**Script supports the following types of instructions:

| **Instruction**                                    | **Description**                                                                                                                    |
|----------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|
| `line $start, $end`                                | Draws a line between two points.                                                                                                   |
| `rectangle $start, $width, $height`                | Draws a rectangle from its top-left point with the given width and height.                                                         |
| `square $start, $width`                            | Draws a square from its top-left point with the given side length.                                                                 |
| `ellipse $center, $width, $height`                 | Draws an ellipse from its given center point with the given width and height.                                                      |
| `circle $center, $radius`                          | Draws a circle from its given center point with the given radius.                                                                  |
| `polyline $start, $points`                         | Draws a polyline starting at a given point and following a list of points.                                                         |
| `setlinecolor $color`                              | Sets the colour used to draw (out)lines.                                                                                           |
| `setfillcolor $color`                              | Sets the colour to fill objects.                                                                                                   |
| `if ($guard) then { $body } else { $alternative }` | If the guard is true, executes the instructions in **body**, which is a list of instructions. Otherwise, executes **alternative**. |
| `for $var_id in $interval { $body }`               | Loops over every integer in the given interval and executes the instructions in **body**.                                          |

<br>

# Examples
## Generating a simple grid pattern
<p align="center"><img src="resources/example.png"></p>

```
N: 8
SIDE: 40
MARGIN: 5
BLACK: |0|
WHITE: |255|
GRAY: |128|
---
dimension: (N * SIDE + MARGIN * 2,N * SIDE + MARGIN * 2)
background: GRAY
---
setlinecolor BLACK
for l in [0, N[ {
  for c in [0, N[ {
    if ((l + c) % 2 == 0) {
      setfillcolor WHITE
    } else {
      setfillcolor BLACK
    }
    square (c * SIDE + MARGIN,l * SIDE + MARGIN), SIDE
  }
}
setlinecolor |0|0|255|
square (MARGIN,MARGIN), N * SIDE
```

# Class Diagram
The UML class diagram for this project can be found [here](resources/classdiagram.png).

<br>

# Credit
Full credit for the basic specification of the library's requirements goes to Professor
[André L. Santos](https://andre-santos-pt.github.io/), Assistant Professor at Iscte-IUL and coordinator of the course
this library was developed for. The original project specification can be found 
[here](https://docs.google.com/document/d/1Mq4h8Qpt2mXEpzDeE_hkuN5z8W_jS7jiWlUc2JjTUak/edit#heading=h.ribe56dmk07m).

Credit for all the code present in this repository goes to
[Afonso Caniço](https://ciencia.iscte-iul.pt/authors/afonso-canico/cv) and 
[João Pereira](https://www.linkedin.com/in/jo%C3%A3o-vilares-pereira-180223227/), authors and sole contributors to the 
project and this repository, unless otherwise explicitly stated.