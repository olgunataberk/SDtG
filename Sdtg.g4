/**
 * Lexer Rules
 */

grammar Sdtg;

Whitespace: [ \t]+ -> skip ;

DeclarationStart: 'initialize' '\n' ;
DeclarationEnd: 'end' ;

Identifier: [a-zA-Z]+ ;

ScriptStart: 'script' '\n' ;
ScriptEnd: 'end' ;

ChoiceStart: '<' ;
ChoiceEnd: '>' ;

Operator: [+-*/] ;
RelationalOperator: '<=' | '>=' | '<' | '>' | '==' | '!=' ;

Integer: [1-9] [0-9]* ;
String: '\"' . '\"' ;

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
	DeclarationStart LP identifierList RP DeclarationEnd ;

identifierList:
	Identifier ',' identifierList
	| Identifier
	;
	
scriptSection:
	ScriptStart textLineList ScriptEnd ;
	
textLineList:
	textLine '\n' textLineList
	| textLine
	;
	
textLine:
	LP karmaExpression RP Identifier ':' line ;
	
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
	LP Identifier Operator Identifier RP ;
	
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
