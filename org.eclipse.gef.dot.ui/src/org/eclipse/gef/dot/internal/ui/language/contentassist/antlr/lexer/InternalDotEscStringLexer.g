
/*
* generated by Xtext
*/
lexer grammar InternalDotEscStringLexer;


@header {
package org.eclipse.gef.dot.internal.ui.language.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




L : '\\l';

N : '\\n';

R : '\\r';



RULE_CHAR : .;



