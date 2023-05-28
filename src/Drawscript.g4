grammar Drawscript;

script: (constants NEWLINE)? '---' parameters NEWLINE '---' sequence? EOF;

constants: definition (NEWLINE definition)* NEWLINE*;

parameters: (NEWLINE 'dimension:' (dimPoint=point | dimRef=reference))? (NEWLINE 'background:' (bgColor=colour | bgRef=reference))? NEWLINE*;

definition: IDENTIFIER ':' expression;

sequence: (NEWLINE instruction)+ NEWLINE*;

instruction:
     'line' start=point ', ' end=point #line
     | 'rectangle' start=point ', ' width=expression'x'height=expression #rectangle
     | 'square' start=point ', ' length=expression #square
     | 'ellipse' center=point ', ' width=expression'x'height=expression #ellipse
     | 'circle' center=point ', ' radius=expression #circle
     | 'polyline' start=point (', ' points+=point)* #polyline
     | 'setlinecolor' (colour | reference) #setLineColour
     | 'setfillcolor' (colour | reference) #setFillColour
     | 'if (' guard=expression ') {' NEWLINE? then=sequence? NEWLINE? '}' NEWLINE? (' else {' NEWLINE? else=sequence? NEWLINE? '}' NEWLINE?)? #branch
     | 'for ' IDENTIFIER ' in ' interval ' {' NEWLINE? body=sequence? NEWLINE? '}' #iteration;

expression:
    number #numberExpression
    | boolean # booleanExpression
    | colour #colourExpression
    | point #pointExpression
    | interval # intervalExpression
    | reference # referenceExpression
    | left=expression operator=BINARY_OPERATOR right=expression #binaryExpression;

number: value=INTEGER;

boolean: value=BOOL;

point: '(' x=expression ',' y=expression ')';

colour: ('|' red=expression '|' green=expression '|' blue=expression '|') | '|' rgb=expression '|';

interval: ('[' | ']') start=expression ', ' end=expression ('[' | ']');

reference: id=IDENTIFIER;

BINARY_OPERATOR: OPERATOR_ARITHMETIC | OPERATOR_LOGIC;
    OPERATOR_ARITHMETIC: OP_MUL | OP_DIV | OP_MOD | OP_ADD | OP_SUB; // Order by operator precedence
    OPERATOR_LOGIC: OP_GT | OP_LT | OP_GEQ | OP_LEQ | OP_EQ;
        OP_ADD: '+';
        OP_SUB: '-';
        OP_MUL: '*';
        OP_DIV: '/';
        OP_MOD: '%';
        OP_GT: '>';
        OP_LT: '<';
        OP_GEQ: '>=';
        OP_LEQ: '<=';
        OP_EQ: '==';

INTEGER: ('-')?[0-9]+;

BOOL: 'true' | 'false';

IDENTIFIER: [a-zA-Z_]+;

NEWLINE: '\n' | '\r' | '\r\n';

SPACE: ' '+ -> skip; // Ignore whitespaces

TABS: '\t'+ -> skip; // Ignore indentation