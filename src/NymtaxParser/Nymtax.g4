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

// VARIABLE DECLARATION //

var_declaration	: list_var  IDENTIFIER ('~' IDENTIFIER)? | const_declaration;
list_var		: DATA_TYPE '[]' |
				  DATA_TYPE '*'  |
				  DATA_TYPE;
// ~ as =

// CONSTANT DECLARATION //
list_constants      : const_declaration+;
const_declaration 	: list_var IDENTIFIER '~' constant;
constant			: INTEGER | FLOAT | CHAR | STRING;


// STATEMENT //
list_statement	: '{' list_statement '}'|
				  ( statement ';' )+;
statement		: var_declaration |
                  assign |
				  function_call_stat |
				  when_statement |
				  condition_statement |
				  loop_every_statement |
				  loop_throughout_statement |
				  loop_do_throughout_statement |
				  send_statement |
				  'STOP' |
				  'PROCEED' ;

function_call_stat	:   IDENTIFIER '(' list_parameter? ')'  ;
list_parameter		:   IDENTIFIER ((';' IDENTIFIER)+)?;


send_statement		: 'SEND' expression;

expression			: string_expression |
					  numerical_expression |
					  boolean_expression |
					  func_with_send '(' list_parameter ')';
string_expression	: '+' string_expression |
					  '!' string_expression |
					  '-' string_expression |
					  IDENTIFIER |
					  STRING;
numerical_expression : '+' numerical_expression |
					  '-' numerical_expression |
					  NTERM;
boolean_expression	: numerical_expression relation_ops numerical_expression |
					  string_expression '~~' string_expression |
					  string_expression '!~' string_expression |
					  boolean_logic '~~' boolean_expression |
					  boolean_logic '!~' boolean_expression |
					  boolean_logic;

boolean_logic		: bool_term ('||' boolean_logic)? | bool_term ('&&' boolean_logic)?;

bool_term			: '(' boolean_logic ')' |
					  '!' boolean_logic |
					  IDENTIFIER;
relation_ops		: '~~' | '!~' | '>~' | '<~' | '>>' | '<<' ;


// ASSIGNMENT STATEMENTS //
assign			: IDENTIFIER '~' IDENTIFIER |
				  IDENTIFIER '~' constant;

// INPUT OUTPUT //
write_statement	: 'WRITE' '(' write_list ')' ;
write_list		: IDENTIFIER + write_list |
				  '"' STRING '"' + write_list |
				  '"' STRING '"' |
				  IDENTIFIER;
read_statement	: 'READ' '(' input_data_type '~' input_IDENTIFIER ')';
input_data_type : '%' DATA_TYPE;
input_IDENTIFIER	: '@' IDENTIFIER;

// CONDITIONAL STATEMENTS //
when_statement	: 'WHEN' '(' boolean_expression ')' '{' list_statement? '}' (otherwise_when_statement+)? ('OTHERWISE' '{' list_statement? '}')?;
otherwise_when_statement:	'OTHERWISE WHEN' '(' boolean_expression ')' '{' list_statement? '}' ;

condition_statement	: 'CONDITION' '(' expression ')' '{' list_event? base_statement '}' ;

list_event	: ('EVENT' expression ':' list_statement?)+;

base_statement : 'BASE' ':' list_statement?;

// LOOP STATEMENTS //
loop_every_statement : 'EVERY' '(' assign ';' boolean_expression ';' assign';' ')' '{' list_statement? '}' ;
loop_throughout_statement : 'THROUGHOUT' '(' boolean_expression ')' '{' list_statement? '}';
loop_do_throughout_statement : 'DO' '{' list_statement? '}' 'THROUGHOUT' '(' boolean_expression ')' ;

// FUNCTIONS //
list_func_declaration	: func_declaration+;
func_declaration		: func_with_send | func_without_send;
func_with_send			: DATA_TYPE function_call_stat func_body;
func_without_send		: 'VOID' function_call_stat func_body;
func_body				: '{' list_statement? '}';
func_main				: 'RUN MAIN' func_body;


	//**** Lexer ****//

 // ** declarations ** //

DATA_TYPE		:'INT'|'FLOAT'|'STRING'|'CHAR';
IDENTIFIER		: LETTER | LETTER LETTER_NUMBER+;
INTEGER			: SIGN NUMBER;
SIGN			: '+' | '-';
FLOAT			: NUMBER '.' NUMBER;
CHAR			: '^' ASCII '^';
				  // ^ as '
STRING			: '"' ASCII_CHARS '"';



 // ** expressions ** //

NTERM				: NFACTOR '*' NTERM | NFACTOR '/' NTERM | NFACTOR '%' NTERM | NFACTOR;				//added NFACTOR before the *
NFACTOR				: CHAR | INTEGER | FLOAT | IDENTIFIER;												//removed NTERM





// ** usual ** *//

ASCII			: LETTER_NUMBER |
 				 '\u0021'..'\u002f' |
 				 '\u003a'..'\u0040' |
 				 '\u005b'..'\u0060' |
 				 '\u007b'..'\u007f' ;
ASCII_CHARS		: ASCII+ | ASCII;
WS     			: [\n\r\b\t\f ]+  -> skip;
LETTER_NUMBER	: NUMBER|LETTER;
LETTER			: [a-z] | [A-Z] ;
NUMBER 			: [0-9] ;
