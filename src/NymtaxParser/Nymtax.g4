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
BOOL    : 'BOOLEAN';

// STRING SEQUENCES --------

STRING
    :   QUOTE (LETTER_NUMBER+)? QUOTE
    ;
//
//fragment
//StringCharacters
//    :   StringCharacter+
//    ;
//
//fragment
//StringCharacter
//    :   ~["\\]
//    |   EscapeSequence
//    ;
//
//fragment
//EscapeSequence
//    :   '\\' [btnfr"'\\] ;

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

ASSIGN          : '=';
NEW       : 'NEW';

data_type : INT | FLO | CHR | STRNG | BOOL;

	//**** Lexer ****//

 // ** expressions ** //

 // ** declarations ** //

INTEGER			: SIGN NUMBER;
SIGN			: ADD | SUB;
FLOAT			: NUMBER DOT NUMBER;
CHAR			: CARET ASCII CARET;
				  // ^ as '

IDENTIFIER		: LETTER | LETTER LETTER_NUMBER+;

// ** usual ** *//

NUMBER 			: [0-9] ;
LETTER			: [a-z] | [A-Z] ;
LETTER_NUMBER	: NUMBER|LETTER;
ASCII			: LETTER_NUMBER |
 				 '\u0021'..'\u002f' |
 				 '\u003a'..'\u0040' |
 				 '\u005b'..'\u0060' |
 				 '\u007b'..'\u007f' ;
ASCII_CHARS		: ASCII+ ;
WS  :  [ \t\r\n\u000C]+ -> skip ;


// VARIABLE DECLARATION //

var_declaration	: data_type  IDENTIFIER op=(ASSIGN|ADD_ASSIGN|SUB_ASSIGN|MUL_ASSIGN|DIV_ASSIGN) IDENTIFIER              #var_dec_ident
                    | data_type IDENTIFIER op=(ASSIGN|ADD_ASSIGN|SUB_ASSIGN|MUL_ASSIGN|DIV_ASSIGN) expression           #var_dec_expr
                    | data_type IDENTIFIER                           #var_dec_var
                    | const_declaration                             #var_dec_const
                    | array_initialization                          #var_array_init;

list_var		: data_type LBRACK RBRACK
                    | data_type;
// ~ as =

// CONSTANT DECLARATION //
list_constants      : (const_declaration SEMI )+;
const_declaration 	: data_type IDENTIFIER ASSIGN constant;
constant			: op=(ADD|SUB) NUMBER
                        | FLOAT
                        | CHAR
                        | STRING
                        | bool=(TRUE|FALSE);

// ARRAY INITIALIZARION //
array_initialization    :   data_type IDENTIFIER LBRACK RBRACK ASSIGN NEW data_type LBRACK NUMBER RBRACK ;
array_call              :   IDENTIFIER LBRACK NUMBER RBRACK ;
array_length            :   IDENTIFIER DOT 'length' ;
array_assign            :   array_call ASSIGN expression ;

// STATEMENT //
list_statement	: LBRACE list_statement RBRACE
                    | ( statement SEMI )+;
statement		: var_declaration                       #statement_var_dec
                    | assign                            #statement_assign
                    | array_assign                      #statement_arrAssign
                    | function_call_stat                #statement_func_call
                    | when_statement                    #statement_when
                    | condition_statement               #statement_condition
                    | loop_every_statement              #statement_loop_every
				    | loop_throughout_statement         #statement_loop_throughout
				    | loop_do_throughout_statement      #statement_loop_doThroughout
				    | send_statement                    #statement_send
				    | write_statement                   #statement_write
				    | read_statement                    #statement_read
				    | array_length                      #statement_getArrLen
				    | STOP                              #statement_stop
				    | PROCEED                           #statement_proceed;

function_call_stat	:   IDENTIFIER LPAREN list_parameter? RPAREN;
list_parameter		:   list_var IDENTIFIER ((COMMA list_var IDENTIFIER)+)?;


send_statement		: SEND constant                 #send_const
                        | SEND IDENTIFIER           #send_variable
                        | SEND expression           #send_expr;

expression			: string_expression                             #visit_stringexpr
                    | numerical_expression                          #visit_numexpr
                    | boolean_expression                            #visit_boolexpr
                    | function_call_stat                            #visit_func_call
                    | array_call                                    #visit_array_call;

string_expression	: string_expression ADD string_expression   #string_add
                    | IDENTIFIER                                #string_var
                    | STRING                                    #string_const;

numerical_expression: numerical_expression op=(MUL|DIV|MOD) numerical_expression # numerical_MDM
                    | numerical_expression op=(ADD|SUB) numerical_expression     # numerical_AS
                    | value=(INTEGER|FLOAT|IDENTIFIER)                           # numerical_val
                    | '('numerical_expression')'                                 # numerical_paren
                    | SUB '('numerical_expression')'                             # numerical_negparen
                    | array_call                                                 # numerical_array;


boolean_expression		: boolean_expression OR boolean_expression      #boolean_or
                        | boolean_expression AND boolean_expression         #boolean_and
                        | boolean_logic                                     #boolean_log
                        | array_call                                        #boolean_array
                        | function_call_stat                                #boolean_call;

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
assign			: IDENTIFIER  op=(ASSIGN|ADD_ASSIGN|SUB_ASSIGN|MUL_ASSIGN|DIV_ASSIGN) IDENTIFIER              #assign_variable
                | IDENTIFIER  op=(ASSIGN|ADD_ASSIGN|SUB_ASSIGN|MUL_ASSIGN|DIV_ASSIGN) expression              #assign_expression
                | IDENTIFIER  op=(ASSIGN|ADD_ASSIGN|SUB_ASSIGN|MUL_ASSIGN|DIV_ASSIGN) constant                #assign_constant;

// INPUT OUTPUT //
write_statement	: WRITE LPAREN write_list RPAREN ;
write_list		: IDENTIFIER + write_list
                | STRING + write_list
                | STRING
                | IDENTIFIER
                | expression + write_list
                | expression;

read_statement	: READ LPAREN input=(INT|FLO|STRNG) AT_SIGN IDENTIFIER RPAREN;

// CONDITIONAL STATEMENTS //
when_statement	: WHEN LPAREN boolean_expression RPAREN LBRACE list_statement? RBRACE                                           #conditional_if
                |  WHEN LPAREN boolean_expression RPAREN LBRACE list_statement? RBRACE otherwise_when_statement                 #conditional_ifelse;

otherwise_when_statement:   OTHERWISE WHEN LPAREN boolean_expression RPAREN LBRACE list_statement? RBRACE                           #otherwise_when
	                    |   OTHERWISE WHEN LPAREN boolean_expression RPAREN LBRACE list_statement? RBRACE otherwise_when_statement  #otherwise_when_mult
                        |   OTHERWISE LBRACE list_statement? RBRACE                                                                 #otherwise;

condition_statement	: CONDITION LPAREN expression RPAREN LBRACE list_event? base_statement RBRACE  #conditional_switch_expr
                    | CONDITION LPAREN IDENTIFIER RPAREN LBRACE list_event? base_statement RBRACE  #conditional_switch_variable;

list_event	: (EVENT expression COLON (list_statement)?)+ ;

base_statement : BASE COLON list_statement? ;

// LOOP STATEMENTS //
loop_every_statement : EVERY LPAREN assign COMMA boolean_expression COMMA assign RPAREN LBRACE list_statement? RBRACE  #loop_for;
loop_throughout_statement : THROUGHOUT LPAREN boolean_expression RPAREN LBRACE list_statement? RBRACE #loop_while;
loop_do_throughout_statement : DO LBRACE list_statement? RBRACE THROUGHOUT LPAREN boolean_expression RPAREN #loop_dowhile ;

// FUNCTIONS //
list_func_declaration	: func_declaration+;
func_declaration		: func_with_send            #func_dec_send
                            | func_without_send     #func_dec_none;
func_with_send			: data_type function_call_stat func_body;
func_without_send		: VOID function_call_stat func_body;
func_body				: LBRACE list_statement? RBRACE;
func_main				: RUN_MAIN func_body;


