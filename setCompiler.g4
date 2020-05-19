grammar setCompiler;

SET : 'set';
ELEMENT : 'element';
ADD:'add';
REMOVE:'remove';
PRINT: 'print';
INT : 'int';
WHILE: 'while';
FOR: 'for';
CONST: 'const';
IF : 'if';
ELSE : 'else';
CALL : 'call';
RETURN : 'return';
SEPARATOR : ';';
DELIMITER : '.';
COLON : ':';
GLOBAL: 'global';

ADDS: '+';
SUB: '-';
MUL: '*';
DIV: '/';

NEGATION : '!';
EQUAL: '==';
NON_EQUAL: '!=';
LESS: '<';
LESS_OR_EQUALS: '<=';
GREATER: '>';
GREATER_OR_EQUALS: '>=';

O_BRACKET : '(';
C_BRACKET : ')';

K_O_BRACKET : '{';
K_C_BRACKET : '}';

global_program
    : (global_assign_set|global_assign_var)*(subprogram_non_return|subprogram_return)*program{1}(subprogram_non_return|subprogram_return)*
    ;

program
    : 'program' block
    ;

block
    :K_O_BRACKET statement* K_C_BRACKET
    ;

statement :
assign_var |
assign_set |
operations |
assign_var_method_invocation |
while_cicle |
if_else |
method_invokation |
print |
operarions_with_set |
for_each;


digit_expression
    :	digit_expression (MUL|DIV) digit_expression
    |	digit_expression (ADDS|SUB) digit_expression
    |	ID
    |	O_BRACKET digit_expression C_BRACKET
    | NUMBER
    ;

intialize_set
    : (K_C_BRACKET K_O_BRACKET)
    |(K_O_BRACKET (ID ',')* (ID) K_C_BRACKET)
    |(ID(MUL|DIV|ADDS|SUB)ID)
    ;

intialize_element
    : STRING
    ;

assign_var_method_invocation
    : type CONST? ID '=' method_invokation
    ;

assign_set
    : SET CONST? ID '=' (intialize_set) SEPARATOR
    ;

assign_var
    : type_1 CONST? ID '=' (digit_expression|intialize_element) SEPARATOR
    ;

print
    : PRINT O_BRACKET (ID|NUMBER|STRING) C_BRACKET SEPARATOR
    ;

operations
    : ID '=' digit_expression SEPARATOR
    ;

operarions_with_set
    : ID DELIMITER (ADD|REMOVE) (O_BRACKET ID C_BRACKET) SEPARATOR
    ;

simple_compare
    : (digit_expression) (EQUAL|NON_EQUAL|LESS|GREATER|LESS_OR_EQUALS|GREATER_OR_EQUALS) (digit_expression)
    ;

hard_compare
    : NEGATION? O_BRACKET simple_compare C_BRACKET
    ;

while_cicle
    : WHILE O_BRACKET (simple_compare|hard_compare) C_BRACKET block
    ;

if_else
    : IF O_BRACKET (simple_compare|hard_compare) C_BRACKET block ELSE block
    ;

for_each
    : FOR O_BRACKET ELEMENT ID COLON ID C_BRACKET block
    ;

global_assign_set
    : GLOBAL assign_set
    ;

global_assign_var
    : GLOBAL assign_var
    ;

type
    : INT|ELEMENT|SET
    ;

type_1
    : INT|ELEMENT
    ;

subprogram_return
    : 'func' type ID (signature|(O_BRACKET C_BRACKET)) block_return
    ;

signature
    : (O_BRACKET (type ID ',')* (type ID) C_BRACKET)
    ;

subprogram_non_return
    : 'func' ID (signature|(O_BRACKET C_BRACKET)) (block_non_return|block)
    ;

block_return
    : K_O_BRACKET statement* RETURN ID SEPARATOR K_C_BRACKET
    ;

block_non_return
    : K_O_BRACKET statement* RETURN SEPARATOR K_C_BRACKET
    ;

signature_method_invokation
    : (O_BRACKET (ID ',')* (ID) C_BRACKET)
    ;

method_invokation
    : CALL ID (signature_method_invokation
    |(O_BRACKET C_BRACKET)) SEPARATOR
    ;


ID : [a-zA-Z_][a-zA-Z_0-9]*;
STRING : '"'(.)+?'"';
NUMBER : [0-9]+;
WS     : [ \n\t\r]+ -> skip;
COMMENTS : '//' ~[\r\n]* ->skip;