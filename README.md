# DrawScript

## What is this?
**Drawscript** is a simple scripting library that allows for the generation of basic geometric drawings
using Java's Swing library.

This scripting language was developed as the final project for a [Programming Language Engineering](https://fenix.iscte-iul.pt/disciplinas/elp/2022-2023/2-semestre/pagina-inicial)
course as part of elective coursework for the [Bachelor's in Computer Engineering](https://www.iscte-iul.pt/curso/3/licenciatura-engenharia-informatica) at 
[Iscte-IUL](https://www.iscte-iul.pt/).

## Examples
### Generating a simple grid pattern
```
N: 8
SIDE: 40
MARGIN: 5
BLACK: |0|
WHITE: |255|
GRAY: |128|
---
dimension: N*SIDE + MARGIN*2 ~ N*SIDE + MARGIN*2
background: GRAY
---
line BLACK
for l in [0,N[
  for c in [0,N[
    if (l + c) % 2 = 0
      fill WHITE
    else
      fill BLACK
    endif
    square c * SIDE + MARGIN,l * SIDE + MARGIN SIDE
  endfor
endfor
line 0|0|255
square MARGIN,MARGIN N*SIDE ~ N*SID
```

## Credit
Full credit for the basic specification of the library's requirements goes to Professor
[André L. Santos](https://andre-santos-pt.github.io/), Assistant Professor at Iscte-IUL and coordinator of the course
this library was developed for. The original project specification can be found 
[here](https://docs.google.com/document/d/1Mq4h8Qpt2mXEpzDeE_hkuN5z8W_jS7jiWlUc2JjTUak/edit#heading=h.ribe56dmk07m).

Credit for all the code present in this repository goes to
[Afonso Caniço](https://ciencia.iscte-iul.pt/authors/afonso-canico/cv) and 
[João Pereira](https://www.linkedin.com/in/jo%C3%A3o-vilares-pereira-180223227/), authors and sole contributors to the 
project and this repository, unless otherwise explicitly stated.