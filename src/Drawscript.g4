grammar Drawscript;

script: (constants NEWLINE)? '---' parameters NEWLINE '---' sequence? EOF;

constants: definition (NEWLINE definition)* NEWLINE*;

parameters: (NEWLINE 'dimension:' dim=dimension)? (NEWLINE 'background:' bg=background)? NEWLINE*;

dimension: point | reference;

background: colour | reference;

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
    '(' expression ')' #enclosedExpression
    | number #numberExpression
    | boolean # booleanExpression
    | colour #colourExpression
    | point #pointExpression
    | interval # intervalExpression
    | reference # referenceExpression
    | left=expression operator=OP_POW right=expression #binaryExpressionPow
    | left=expression operator=OP_MUL_DIV_MOD right=expression #binaryExpressionMulDivMod
    | left=expression operator=OP_ADD_SUB right=expression #binaryExpressionAddSub
    | left=expression operator=OPERATOR_RELATIONAL right=expression #binaryExpressionRelational;

number: value=INTEGER;

boolean: value=BOOL;

point: '(' x=expression ',' y=expression ')';

colour: ('|' red=expression '|' green=expression '|' blue=expression '|') | '|' rgb=expression '|';

interval:
    '[' start=expression ', ' end=expression ']' #closedInterval
    | ']' start=expression ', ' end=expression '[' #openInterval
    | ']' start=expression ', ' end=expression ']' #leftOpenInterval
    | '[' start=expression ', ' end=expression '[' #rightOpenInterval;

reference: id=IDENTIFIER;

OP_POW: '^';
OP_ADD_SUB: '+' | '-';
OP_MUL_DIV_MOD: '*' | '/' | '%';

OPERATOR_RELATIONAL: OP_GT | OP_LT | OP_GEQ | OP_LEQ | OP_EQ;
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