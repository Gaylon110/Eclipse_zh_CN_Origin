
/*
* generated by Xtext
*/
lexer grammar InternalDotLexer;


@header {
package org.eclipse.gef.dot.internal.ui.language.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




Subgraph : ('S'|'s')('U'|'u')('B'|'b')('G'|'g')('R'|'r')('A'|'a')('P'|'p')('H'|'h');

Digraph : ('D'|'d')('I'|'i')('G'|'g')('R'|'r')('A'|'a')('P'|'p')('H'|'h');

Strict : ('S'|'s')('T'|'t')('R'|'r')('I'|'i')('C'|'c')('T'|'t');

Graph : ('G'|'g')('R'|'r')('A'|'a')('P'|'p')('H'|'h');

Edge : ('E'|'e')('D'|'d')('G'|'g')('E'|'e');

Node : ('N'|'n')('O'|'o')('D'|'d')('E'|'e');

HyphenMinusHyphenMinus : '-''-';

HyphenMinusGreaterThanSign : '-''>';

Comma : ',';

Colon : ':';

Semicolon : ';';

EqualsSign : '=';

LeftSquareBracket : '[';

RightSquareBracket : ']';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';



RULE_NUMERAL : ('-'? '.' ('0'..'9')+|('0'..'9')+ ('.' ('0'..'9')*)?);

RULE_COMPASS_PT : ('n'|'ne'|'e'|'se'|'s'|'sw'|'w'|'nw'|'c'|'_');

RULE_STRING : ('a'..'z'|'A'..'Z'|'\u0080'..'\u00FF'|'_') ('a'..'z'|'A'..'Z'|'\u0080'..'\u00FF'|'_'|'0'..'9')*;

RULE_QUOTED_STRING : '"' ('\\' '"'|~('"'))* '"';

RULE_HTML_STRING : '<' (RULE_HTML_TAG_OPEN|RULE_HTML_TAG_CLOSE|RULE_HTML_CHARS)* '>';

fragment RULE_HTML_TAG_OPEN : '<';

fragment RULE_HTML_TAG_CLOSE : '>';

fragment RULE_HTML_CHARS : ~(('<'|'>'))+;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : ('//'|'#') ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n'|'\f')+;

RULE_ANY_OTHER : .;


