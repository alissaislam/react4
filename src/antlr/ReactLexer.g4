lexer grammar ReactLexer;
DoubleQuote :'"';
SingleQuote :'\'';
Break      : 'break';
Do         : 'do';
Instanceof : 'instanceof';
Typeof     : 'typeof';
Case       : 'case';
Else       : 'else';
New        : 'new';
Var        : 'var';
Catch      : 'catch';
Finally    : 'finally';
Return     : 'return';
Void       : 'void';
Continue   : 'continue';
For        : 'for';
Switch     : 'switch';
While      : 'while';
Debugger   : 'debugger';
Function_  : 'function';
This       : 'this';
With       : 'with';
Default    : 'default';
If         : 'if';
Throw      : 'throw';
Delete     : 'delete';
In         : 'in';
Try        : 'try';
As         : 'as';
From       : 'from';
Class   : 'class';
Enum    : 'enum';
Extends : 'extends';
Super   : 'super';
Const   : 'const';
Export  : 'export';
Import  : 'import';

Async : 'async';
Await : 'await';
IgSemiColon                : ';;' -> skip ;
OpenBracket                : '[';
CloseBracket               : ']';
OpenParen                  : '(';
CloseParen                 : ')';
OpenBrace                  : '{';
CloseBrace                 : '}';
SemiColon                  : ';';
Comma                      : ',';
Assign                     : '=';
QuestionMark               : '?' |QuestionMarkModeCall;
Colon                      : ':' | ColonModeCall;
Ellipsis                   : '...';
Dot                        : Dott | DotModeCall;
PlusPlus                   : '++';
MinusMinus                 : '--';
Plus                       : '+';
Minus                      : '-';
BitNot                     : '~';
Not                        : '!';
Multiply                   : '*';
Divide                     : '/';
Modulus                    : '%';
Power                      : '**';
NullCoalesce               : '??';
Hashtag                    : '#';
RightShiftArithmetic       : '>>';
LeftShiftArithmetic        : '<<';
RightShiftLogical          : '>>>';
LessThan                   : '<';
MoreThan                   : '>'|MoreThanModeCall ;
LessThanEquals             : '<=';
GreaterThanEquals          : '>=';
Equals_                    : '==';
NotEquals                  : '!=';
IdentityEquals             : '===';
IdentityNotEquals          : '!==';
BitAnd                     : '&';
BitXOr                     : '^';
BitOr                      : '|';
And                        : '&&';
Or                         : '||';
MultiplyAssign             : '*=';
DivideAssign               : '/=';
ModulusAssign              : '%=';
PlusAssign                 : '+=';
MinusAssign                : '-=';
LeftShiftArithmeticAssign  : '<<=';
RightShiftArithmeticAssign : '>>=';
RightShiftLogicalAssign    : '>>>=';
BitAndAssign               : '&=';
BitXorAssign               : '^=';
BitOrAssign                : '|=';
PowerAssign                : '**=';
ARROW                      : '=>';
//hooks
UseState:'useState';
UseEffect:'useEffect';
//UseContext:'useContext';
UseRef:'useRef';
//UseReducer:'useReducer';
UseMemo:'useMemo';
/// Null Literals
NullLiteral: 'null';
/// Boolean Literals
BooleanLiteral: 'true' | 'false';
/// The following tokens are also considered to be FutureReservedWords
/// when parsing strict mode
Implements   : 'implements';
Let    : 'let'       ;
Private      : 'private'   ;
Public       : 'public'    ;
Interface    : 'interface' ;
Package      : 'package'   ;
Protected    : 'protected' ;
Static       : 'static'    ;
Yield        : 'yield'     ;

//Id
IDENTIFIER : IDENTIFIER_START IDENTIFIER_PART* |Id ;

JSX_TAG: LessThan WS* IDENTIFIER  -> pushMode(INSIDE_TAG);

//ws
WS: [ \t\n\r]+ ->skip;
NEWLINE: [\n\r ]+ ->skip;

//comment
SINGLE_LINE_COMMENT : '//' ~[\r\n]* -> skip ;
MULTI_LINE_COMMENT : '/*'. *? '*/'  -> skip ;



NUMBER : DIGIT+ ( '.' DIGIT+ )?;
//string
String : StringDQ | StringSQ ;
StringDQ : '"' StringContentDQ*? '"' ;



mode INSIDE_TAG;
CLOSE_TAG:  '</' WS_INSIDE* IDENTIFIERIn WS_INSIDE* ->popMode;
Self_CLOSE_TAG: '/>'->popMode;
//Attribute : IDENTIFIER WS_INSIDE* Assign;
MoreThanIn                   : '>' ->pushMode(L);
LessThanIn                   : '<';
JSX_TAGIn: JSX_TAG -> pushMode(INSIDE_TAG);
WS_INSIDE: WS+ -> skip;
NewIn:NEWLINE -> skip;
StringIn :String;
CloseBraceIn:CloseBrace;
OpenBraceIn:OpenBrace;
IDENTIFIERIn:IDENTIFIER;
AssignIn:Assign;
CommaIn:Comma;
OpenParenIn:OpenParen;
CloseParenIn:CloseParen;
ARROWIn:ARROW;
DotIn:Dott;
MultiplyIn:Multiply;
DivideIn:Divide;
PlusIn:Plus;
MinusIn:Minus;
NUMBERIn:NUMBER;
BooleanLiteralIn:BooleanLiteral;


mode L;
CLOSE_TAGIn                   :'</' WS_INSIDE* IDENTIFIERIn WS_INSIDE*-> popMode ,popMode;
MoreThanInIn: '>';
JSX_TAGInIn: JSX_TAG -> pushMode(INSIDE_TAG);
WS_INSIDEIN: WS+ -> skip;
NewInIN:NEWLINE -> skip;
OpenBraceInIn:OpenBrace -> pushMode(CallId);
LETTERR: ~[><{}]+;

mode CallId;
Id:IDENTIFIER_START IDENTIFIER_PART*;
JSX_TAGModeCall: JSX_TAG -> pushMode(INSIDE_TAG);
CloseBraceCall:CloseBrace -> popMode;
NullLiteralModeCall:NullLiteral;
StringModeCall :String;
CloseBraceModeCall:CloseBrace;
OpenBraceModeCall:OpenBrace;
AssignModeCall:Assign;
CommaModeCall:Comma;
OpenParenModeCall:OpenParen;
CloseParenModeCall:CloseParen;
ARROWModeCall:ARROW;
DotModeCall:Dott;
MultiplyModeCall:Multiply;
DivideModeCall:Divide;
PlusModeCall:Plus;
MinusModeCall:Minus;
NUMBERModeCall:NUMBER;
BooleanLiteralModeCall:BooleanLiteral;
MoreThanModeCall                   : '>' ;
LessThanModeCall                   : '<';
QuestionMarkModeCall:'?';
ColonModeCall: ':';
ReturnModeCall:Return;
Equals_ModeCall                    : '==';
IdentityNotEqualsModeCall:IdentityNotEquals;
IdentityEqualsModeCall:IdentityEquals;
NotEqualsModeCall:NotEquals;
LessThanEqualsModeCall:LessThanEquals;
GreaterThanEqualsModeCall:GreaterThanEquals;
IgSemiColonModeCall:IgSemiColon ->skip;
SemiColonModeCall:SemiColon;
PlussPlussModeCall:PlusPlus;
MinusMinusModeCall:MinusMinus;
WS_INSIDECall: WS+ -> skip;
NewInCall:NEWLINE -> skip;



fragment Dott :'.';
fragment StringSQ : ['] StringContentSQ*? ['] ;
fragment DIGIT : '0' .. '9' ;
fragment StringContentDQ : ~('\\' | '"' | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringDQ | '${' StringContentDQ*? '}';
fragment StringContentSQ : ~('\\' | ['] | '\n' | '\r' | '$') | '\\' ~('\n' | '\r') | StringSQ | '${' StringContentSQ*? '}';
fragment IDENTIFIER_NO_DOLLAR : (LETTER | '_') IDENTIFIER_PART_NO_DOLLAR* ;
fragment IDENTIFIER_PART_NO_DOLLAR : LETTER | '_' | DIGIT ;
fragment IDENTIFIER_START : LETTER | '_' | '$' ;
fragment IDENTIFIER_PART : IDENTIFIER_START | DIGIT ;
fragment LETTER : 'a' .. 'z' | 'A' .. 'Z' ;