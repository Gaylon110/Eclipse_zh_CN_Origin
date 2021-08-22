
/*
* generated by Xtext
*/
lexer grammar InternalDotStyleLexer;


@header {
package org.eclipse.gef.dot.internal.ui.language.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




Diagonals : ('D'|'d')('I'|'i')('A'|'a')('G'|'g')('O'|'o')('N'|'n')('A'|'a')('L'|'l')('S'|'s');

Rounded : ('R'|'r')('O'|'o')('U'|'u')('N'|'n')('D'|'d')('E'|'e')('D'|'d');

Striped : ('S'|'s')('T'|'t')('R'|'r')('I'|'i')('P'|'p')('E'|'e')('D'|'d');

Tapered : ('T'|'t')('A'|'a')('P'|'p')('E'|'e')('R'|'r')('E'|'e')('D'|'d');

Dashed : ('D'|'d')('A'|'a')('S'|'s')('H'|'h')('E'|'e')('D'|'d');

Dotted : ('D'|'d')('O'|'o')('T'|'t')('T'|'t')('E'|'e')('D'|'d');

Filled : ('F'|'f')('I'|'i')('L'|'l')('L'|'l')('E'|'e')('D'|'d');

Radial : ('R'|'r')('A'|'a')('D'|'d')('I'|'i')('A'|'a')('L'|'l');

Wedged : ('W'|'w')('E'|'e')('D'|'d')('G'|'g')('E'|'e')('D'|'d');

Invis : ('I'|'i')('N'|'n')('V'|'v')('I'|'i')('S'|'s');

Solid : ('S'|'s')('O'|'o')('L'|'l')('I'|'i')('D'|'d');

Bold : ('B'|'b')('O'|'o')('L'|'l')('D'|'d');

LeftParenthesis : '(';

RightParenthesis : ')';

Comma : ',';



RULE_WS : (' '|'\t'|'\r'|'\n');

RULE_NAME : ~((RULE_WS|'('|')'|','))*;


