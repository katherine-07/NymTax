grammar Nymtax;

/**
 *	Syntax for making keywords functional:
 * 	(keyword) returns [(datatype) value]
 * 		: grammar {
 * 			possible output
 * 		}; 
 */

//**** Parser ****//

program   		: list_constants? list_func_declaration? func_main;

// CONSTANTS and COMMON TOKENS //
RUN_MAIN    : 'RUN MAIN';
WHEN        : 'WHEN';
OTHERWISE   : 'OTHERWISE';
EVERY       : 'EVERY';
THROUGHOUT  : 'THROUGHOUT';
CONDITION   : 'CONDITION';
EVENT   : 'EVENT';
BASE    : 'BASE';
DO      : 'DO';
SEND    : 'SEND';
WRITE   : 'WRITE';
READ    : 'READ';
STOP    : 'STOP';
PROCEED : 'PROCEED';

INT     : 'INTEGER';
FLO     : 'FLOAT';
CHR     : 'CHAR';
STRNG   : 'STRING';

// STRING SEQUENCES --------

STRING
    :   QUOTE StringCharacters? QUOTE
    ;

fragment
StringCharacters
    :   StringCharacter+
    ;

fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;

fragment
EscapeSequence
    :   '\\' [btnfr"'\\] ;

// STRING SEQUENCES -------------


VOID    : 'VOID';

// §3.10.7 The Null Literal

NULL
    :   'null'
    ;

// §3.11 Separators

LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';
QUOTE           : '"';

// §3.12 Operators

ASSIGN          : '=';
GT              : '>';
LT              : '<';
NOT             : '!';
TILDE           : '~';
QUESTION        : '?';
COLON           : ':';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : '||';
INC             : '++';
DEC             : '--';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';
MOD             : '%';
AT_SIGN         : '@';

TRUE            : 'true';
FALSE           : 'false';

ADD_ASSIGN      : '+=';
SUB_ASSIGN      : '-=';
MUL_ASSIGN      : '*=';
DIV_ASSIGN      : '/=';
AND_ASSIGN      : '&=';
OR_ASSIGN       : '|=';
XOR_ASSIGN      : '^=';
MOD_ASSIGN      : '%=';
LSHIFT          : '<<';
LSHIFT_ASSIGN   : '<<=';
RSHIFT          : '>>';
RSHIFT_ASSIGN   : '>>=';
URSHIFT_ASSIGN  : '>>>=';

NEW       : 'NEW';

data_type : INT | FLO | CHR | STRNG;

// VARIABLE DECLARATION //

var_declaration	: list_var  IDENTIFIER (ASSIGN IDENTIFIER)?         #var_dec_var
                    | const_declaration                             #var_dec_const
                    | array_initialization                          #var_array_init;

list_var		: data_type LBRACK RBRACK
                    | data_type MUL
                    | data_type;
// ~ as =

// CONSTANT DECLARATION //
list_constants      : (const_declaration SEMI )+;
const_declaration 	: list_var IDENTIFIER ASSIGN constant ;
constant			: INTEGER
                        | FLOAT
                        | CHAR | STRING;

// ARRAY INITIALIZARION //
array_initialization    :   data_type IDENTIFIER LBRACK RBRACK ASSIGN NEW data_type LBRACK NUMBER RBRACK SEMI
                            | data_type IDENTIFIER LBRACK RBRACK ASSIGN LBRACE (NUMBER)+ (COMMA)+ RBRACE SEMI;

// STATEMENT //
list_statement	: LBRACE list_statement RBRACE
                    | ( statement SEMI )+;
statement		: var_declaration                       #statement_var_dec
                    | assign                            #statement_assign
                    | function_call_stat                #statement_func_call
                    | when_statement                    #statement_when
                    | condition_statement               #statement_condition
                    | loop_every_statement              #statement_loop_every
				    | loop_throughout_statement         #statement_loop_throughout
				    | loop_do_throughout_statement      #statement_loop_doThroughout
				    | send_statement                    #statement_send
				    | write_statement                   #statement_write
				    | read_statement                    #statement_read
				    | STOP                              #statement_stop
				    | PROCEED                           #statement_proceed;

function_call_stat	:   IDENTIFIER LPAREN list_parameter? RPAREN;
list_parameter		:   list_var IDENTIFIER ((COMMA list_var IDENTIFIER)+)?;


send_statement		: SEND expression;

expression			: string_expression
                    | numerical_expression
                    | boolean_expression
                    | func_with_send LPAREN list_parameter RPAREN;

string_expression	: ADD string_expression
                    | NOT string_expression
                    | SUB string_expression
                    | IDENTIFIER
                    | STRING;

numerical_expression :  LPAREN numerical_expression RPAREN |
                        NFACTOR ADD numerical_expression |
                        NFACTOR SUB numerical_expression |
                        NFACTOR MUL numerical_expression |
                        NFACTOR DIV numerical_expression |
                        NFACTOR MOD numerical_expression |
                        NFACTOR;


boolean_expression		: boolean_expression OR boolean_expression    #boolean_or
                    | boolean_expression AND boolean_expression   #boolean_and
                    | boolean_logic                                   #boolean_log;

boolean_logic 	: LPAREN boolean_expression RPAREN      #boolean_paren
                    | NOT boolean_expression            #boolean_not
                    | bool_term                         #boolean_term;


bool_term			: numerical_expression op=( EQUAL | NOTEQUAL | LE | GE | GT | LT ) numerical_expression     #boolean_numerical
                    | string_expression op=(EQUAL|NOTEQUAL) string_expression                                   #boolean_string
                    | bool_term op=(EQUAL|NOTEQUAL) bool_term                                   #boolean_equality
                    | IDENTIFIER                                                                #boolean_variable
                    | TRUE                                                                      #boolean_true
                    | FALSE                                                                     #boolean_false;
// ASSIGNMENT STATEMENTS //
assign			: IDENTIFIER ASSIGN IDENTIFIER              #assign_variable
                | IDENTIFIER ASSIGN constant                #assign_constant
                | IDENTIFIER ASSIGN function_call_stat      #assign_function;

// INPUT OUTPUT //
write_statement	: WRITE LPAREN write_list RPAREN ;
write_list		: IDENTIFIER + write_list
                | STRING + write_list
                | STRING
                | IDENTIFIER;

read_statement	: READ LPAREN input_data_type COMMA input_IDENTIFIER RPAREN;
input_data_type : MOD data_type;
input_IDENTIFIER	: AT_SIGN IDENTIFIER;

// CONDITIONAL STATEMENTS //
when_statement	: WHEN LPAREN boolean_expression RPAREN LBRACE list_statement? RBRACE (otherwise_when_statement+)? (OTHERWISE LPAREN list_statement? RPAREN)?;
otherwise_when_statement:	OTHERWISE WHEN LPAREN boolean_expression RPAREN LBRACE list_statement? RBRACE ;

condition_statement	: CONDITION LPAREN expression RPAREN LBRACE list_event? base_statement RBRACE ;

list_event	: (EVENT expression COLON (list_statement)?)+;

base_statement : BASE COLON list_statement?;

// LOOP STATEMENTS //
loop_every_statement : EVERY LPAREN assign COMMA boolean_expression COMMA assign RPAREN LBRACE list_statement? RBRACE ;
loop_throughout_statement : THROUGHOUT LPAREN boolean_expression RPAREN LBRACE list_statement? RBRACE;
loop_do_throughout_statement : DO LBRACE list_statement? RBRACE THROUGHOUT LPAREN boolean_expression RPAREN ;

// FUNCTIONS //
list_func_declaration	: func_declaration+;
func_declaration		: func_with_send            #func_dec_send
                            | func_without_send     #func_dec_none;
func_with_send			: data_type function_call_stat func_body;
func_without_send		: VOID function_call_stat func_body;
func_body				: LBRACE list_statement? RBRACE;
func_main				: RUN_MAIN func_body;


	//**** Lexer ****//

 // ** expressions ** //

NFACTOR				: CHAR | INTEGER | FLOAT | IDENTIFIER ;												//removed

 // ** declarations ** //

IDENTIFIER		: LETTER | LETTER LETTER_NUMBER+;
INTEGER			: SIGN NUMBER;
SIGN			: ADD | SUB;
FLOAT			: NUMBER DOT NUMBER;
CHAR			: CARET ASCII CARET;
				  // ^ as '

// ** usual ** *//

ASCII			: LETTER_NUMBER |
 				 '\u0021'..'\u002f' |
 				 '\u003a'..'\u0040' |
 				 '\u005b'..'\u0060' |
 				 '\u007b'..'\u007f' ;
ASCII_CHARS		: ASCII+ ;
WS  :  [ \t\r\n\u000C]+ -> skip ;
LETTER_NUMBER	: NUMBER|LETTER;
LETTER			: [a-z] | [A-Z] ;
NUMBER 			: [0-9] ;
