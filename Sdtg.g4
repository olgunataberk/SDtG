/**
 * Lexer Rules
 */

grammar Sdtg;

Whitespace: [ \t\n]+ -> skip ;

String: '"' ~["]* '"';

DeclarationStart: 'initialize' ;
End: 'end' ;
ScriptStart: 'script' ;

Identifier: [a-zA-Z] [a-zA-Z0-9]* ;

ChoiceStart: '[' ;
ChoiceEnd: ']' ;

Operator: '+' | '-' | '/' | '*' ;
RelationalOperator: '<=' | '>=' | '<' | '>' | '==' | '!=' ;

Integer: [1-9] [0-9]* ;

Or: '|' ;
And: '&' ;
Not: '!' ;

LP: '(' ;
RP: ')' ;

/**
 *Parser Rules
 */
 
game:
	declarationSection scriptSection ;
	
declarationSection:
	DeclarationStart LP identifierList RP End ;

identifierList:
	Identifier ',' identifierList
	| Identifier
	;
	
scriptSection:
	ScriptStart textLineList End ;
	
textLineList:
	textLine textLineList
	| textLine
	;
	
textLine:
	LP karmaExpression RP Identifier ':' line
	| Identifier ':' line
	;
	
line:
	choicePrompt
	| String
	;
	
choicePrompt:
	ChoiceStart String choiceList ChoiceEnd;

choiceList:
	choiceExpression ',' choiceList
	| choiceExpression
	;
	
choiceExpression:
	String ':' karmaOperationList 
	| String
	;

karmaOperationList:
	karmaOperation karmaOperationList
	| karmaOperation
	;
	
karmaOperation:
	LP Identifier Operator Integer RP ;
	
karmaExpression:
	karmaTerm
	| karmaExpression Or karmaTerm
	;
	
karmaTerm:
	karmaFactor
	| karmaTerm And karmaFactor
	;
	
karmaFactor:
	karmaPrimary
	| Not karmaPrimary
	;
	
karmaPrimary:
	karmaPredicate
	| LP karmaExpression RP
	;

karmaPredicate:
	Identifier RelationalOperator Integer ;
