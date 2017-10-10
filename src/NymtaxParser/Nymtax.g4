grammar Nymtax;

/**
 *	Syntax for making keywords functional:
 * 	(keyword) returns [(datatype) value]
 * 		: grammar {
 * 			possible output
 * 		}; 
 */

program   		: const_declaration list_func_declaration func_main;
          
          
	//**** Parser ****//
	
// VARIABLE DECLARATION //

var_declaration	: list_var; 		
list_var		: DATA_TYPE '[]' |
				  DATA_TYPE '*'  |
				  DATA_TYPE;
list_var_name 	: VAR_NAME '~' list_var_name |
				  // ~ as =   	
				  VAR_NAME;

// CONSTANT DECLARATION //
const_declaration 	: DATA_TYPE VAR_NAME '=' constant;
constant			: INTEGER | FLOAT | CHAR | STRING;

	
// STATEMENT //
list_statement	: '{' list_statement '}'|
				  list_statement list_var list_statement |
				  statement ';' list_statement |
				  statement ';' ;
statement		: list_assign |
				  function_call_stat |
				  when_statement |
				  otherwise_when_statement |
				  condition_statement |
				  list_event |
				  base_statement |
				  loop_every_statement |
				  loop_throughout_statement |
				  loop_do_throughout_statement |
				  send_statement |
				  'STOP' ';' |
				  'PROCEED' ';' ;
				  
function_call_stat	: FUNCTION_NAME '(' list_parameter ')' ;
list_parameter		: PARAMETER;


send_statement		: 'SEND' expression;

expression			: string_expression |
					  numerical_expression |
					  boolean_expression |
					  func_with_send '(' list_parameter ')';
string_expression	: '+' string_expression |
					  '!' string_expression |
					  '-' string_expression |
					  VAR_NAME |
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

boolean_logic		: BTERM '||' boolean_logic | BTERM;
relation_ops		: '~~' | '!~' | '>~' | '<~' | '>>' | '<<' ;


// ASSIGNMENT STATEMENTS //
list_assign 	: assign ';' list_assign | assign ';';
assign			: VAR_NAME '~' VAR_NAME |
				  VAR_NAME '~' constant;
			
// INPUT OUTPUT //
write_statement	: 'WRITE' '(' write_list ')' ;
write_list		: VAR_NAME + write_list |
				  '"' STRING '"' + write_list |
				  '"' STRING '"' |
				  VAR_NAME;
read_statement	: 'READ' '(' input_data_type '~' input_var_name ')';
input_data_type : '%' DATA_TYPE;
input_var_name	: '@' VAR_NAME;

// CONDITIONAL STATEMENTS //
when_statement	: 'WHEN' '(' boolean_expression ')' '{' statement '}' |
				  'WHEN' '(' boolean_expression ')' '{' statement '}'
				  'OTHERWISE' '(' boolean_expression ')' '{' statement '}' |
				  'WHEN' '(' boolean_expression ')' '{' statement '}'
				  'OTHERWISE' '(' boolean_expression ')' '{' statement '}'
				  otherwise_when_statement;

otherwise_when_statement:	'OTHERWISE WHEN' '(' boolean_expression ')' '{' statement '}' 
							otherwise_when_statement |
							otherwise_when_statement '{' statement '}' ;

condition_statement	: 'CONDITION' '(' expression ')' '{' list_event base_statement '}' ;

list_event	: 'EVENT' expression ':' list_statement list_event |
			  'EVENT' expression ':' list_statement;

base_statement : 'BASE' ':' list_statement;

// LOOP STATEMENTS //
loop_every_statement : 'EVERY' '(' assign ';' boolean_expression ';' assign';' ')' '{' statement '}' ;
loop_throughout_statement : 'THROUGHOUT' '(' boolean_expression ')' '{' statement '}';
loop_do_throughout_statement : 'DO' '{' statement '}' 'THROUGHOUT' '(' boolean_expression ')' ;

// FUNCTIONS //
list_func_declaration	: func_declaration list_func_declaration | '\n' ;
func_declaration		: func_with_send | func_without_send;
func_with_send			: DATA_TYPE FUNC_NAME '(' list_parameter ')' func_body;
func_without_send		: 'VOID' FUNC_NAME	'(' list_parameter ')' func_body;
func_body				: '{' list_var list_statement '}';
func_main				: 'RUN MAIN' func_body;
					   
			


	//**** Lexer ****//
	
// ** usual ** //
LETTER			: [a-z]+ | [A-Z]+ ;
NUMBER 			: [0-9]+ ;
LETTER_NUMBER	: [NUMBER|LETTER];
WS     			: [\n | \r | \b | \t | \f | ' ']+ -> skip;
ASCII			: VAR_NAME | WS |
 				 '\u0021'..'\u002f' |
 				 '\u003a'..'\u0040' |
 				 '\u005b'..'\u0060' |
 				 '\u007b'..'\u007f' ;
ASCII_CHARS		: ASCII+ | ASCII;
EPSILON			: '';

 // ** declarations ** //
ID_CHARS		: [LETTER_NUMBER] | '_';
VAR_NAME		: ID_CHARS+ | ID_CHARS;
DATA_TYPE		:['INT'|'FLOAT'|'STRING'|'CHAR'];
INTEGER			: SIGN NUMBER;
SIGN			: '+' | '-';
FLOAT			: NUMBER '.' NUMBER;
CHAR			: '^' ASCII '^';
				  // ^ as '
STRING			: '"' ASCII_CHARS '"';
 
FUNCTION_NAME		: [LETTER_NUMBER]+;						// why is there func name and function name?
FUNC_NAME				: VAR_NAME;
PARAMETER			: VAR_NAME ';' PARAMETER | VAR_NAME;
 
 // ** expressions ** //

NTERM				: NFACTOR '*' NTERM | NFACTOR '/' NTERM | NFACTOR '%' NTERM | NFACTOR;				//added NFACTOR before the *
NFACTOR				: CHAR | INTEGER | FLOAT | VAR_NAME;												//removed NTERM
					  
BTERM				: BFACTOR '&&' BTERM | BFACTOR;
BFACTOR				: '(' BTERM ')' |
					  '!' BTERM |
					  VAR_NAME;
					  

					  
					  