parser grammar ReactParser;

options{tokenVocab=ReactLexer;}

///////////////////// ahmad part
    start: statment*  EOF;
    statment :      statmentElement SemiColon* IgSemiColon *;
    statmentElement:
                      variableDeclarationList
                    | hooks
                    | if
                    | forElement
                    | function
                    | comments
                    | while
                    | do_while
                    | callfunction
                    | switch
                    | block
                    | break
                    | tryCatch
                    | importt
                    | ifShort
                    | suquence
                    | export
                    | jsxElement
                    | expression
                    | arrowFunction
                    ;
    if : If OpenParen  conditions CloseParen  ( block | statment ) else_if* else? ;
    forElement :  For OpenParen forLoopParts CloseParen ( block | statment );
    function :Function_? id OpenParen arguments? CloseParen OpenBrace   (statment|returnstatment )*  CloseBrace;
    comments : SINGLE_LINE_COMMENT |MULTI_LINE_COMMENT;
    while : While  OpenParen conditions CloseParen ( block | statment ) ;
    do_while : Do ( block | statment )  While OpenParen conditions CloseParen;
    callfunction :
               (
               (
                simpleCallfunction
               |callIdentifier
               )
               (
               (Dot|DotModeCall)(simpleCallfunction|callIdentifier)
               )*?
               ) simpleCallfunction?;
    switch: Switch OpenParen expression CloseParen OpenBrace  ( Case expression Colon ( block | (statment)*))* ( Default Colon (block | (statment )*))?  CloseBrace ;

    tryCatch: Try block (Catch OpenParen id? id CloseParen block)* (Finally block)?;
    importt: Import ((OpenBrace (id | hook) (Comma (id | hook))* CloseBrace| (id | hook) ))? From? String ;

    ifShort: callIdentifier (operation expression)? (QuestionMark|QuestionMarkModeCall) (openParen statment closeParen|openParen jsxElement closeParen | statment | jsxElement ) (Colon|ColonModeCall) (openParen statment closeParen|openParen jsxElement closeParen | statment | jsxElement );

    jsxElement:jsxElementNonSelfClosing|jsxElementSelfClosing;
    jsxElementNonSelfClosing: (JSX_TAG|JSX_TAGModeCall) (id ( AssignIn (blockIn|StringIn))?)* MoreThanIn ( OpenBraceInIn (ifShort|Id((Dot|DotModeCall) Id)*?) CloseBraceCall |LETTERR| jsxElementIn |blockOfarguments)*? CLOSE_TAGIn  (MoreThan|MoreThanModeCall) ;
    jsxElementSelfClosing:jsx_tag (id ( AssignIn (blockIn|StringIn))?)* Self_CLOSE_TAG;

    jsxElementIn:  (
    (JSX_TAGIn|JSX_TAGInIn) (id ( AssignIn (blockIn|StringIn))?)* MoreThanIn (  OpenBraceInIn Id((Dot|DotModeCall) Id (PlussPlussModeCall|MinusMinusModeCall)?)*?CloseBraceCall  |jsxElementIn | LETTERR |blockOfarguments )*?  CLOSE_TAGIn  MoreThanInIn |jsxElementSelfClosing
    );
    blockIn:OpenBraceIn (jsxArguments )* CloseBraceIn;
    jsxArguments:jsxParameters(CommaIn jsxParameters)*;
    jsxParameters:
      jsxArrowFunction
    | jsxCallfunction
    | jsxArgument
    | jsxCallIdentifier
    | jsxExpression
    ;
    ////// islam part
    jsxArrowFunction:(OpenParenIn jsxArguments? CloseParenIn | jsxArgument ) ARROWIn (jsxExpression? | OpenBraceIn jsxExpression* CloseBraceIn );
    jsxCallfunction :(id ( DotIn id | DotIn jsxSimpleCallfunction)+ | jsxSimpleCallfunction) ;
    jsxSimpleCallfunction : id OpenParenIn jsxArguments? CloseParenIn ;
    jsxArgument : (id (AssignIn (jsxExpression|jsxArrowFunction))?);
    jsxExpression:
                     OpenParenIn jsxExpression (MultiplyIn | DivideIn) jsxExpression CloseParenIn
                   | OpenParenIn jsxExpression( PlusIn | MinusIn) jsxExpression CloseParenIn
                   | jsxExpression (MultiplyIn | DivideIn) jsxExpression
                   | jsxExpression( PlusIn | MinusIn) jsxExpression
                   | NUMBERIn
                   | StringIn
                   | BooleanLiteralIn
                   | id
                   ;
    jsxCallIdentifier: id (DotIn id)*;
    jsxBlock:
    (
    (openParen (jsxElement) closeParen)
    |jsxElement
    ) (SemiColon|SemiColonModeCall)* (IgSemiColon|IgSemiColonModeCall) *;





    block:OpenBrace (statment )* CloseBrace;

    else_if : Else If OpenParen conditions CloseParen  ( block | statment ) ;
    else :  Else ( block | statment) ;
    forLoopParts : (kind? variableDeclaration SemiColon conditions SemiColon ( variableDeclaration | id (PlusPlus|MinusMinus))| id id Colon callIdentifier ) ;
    conditions : data operation  data
                   | BooleanLiteral
                   | Not* id
                   ;
    arguments : parameters((Comma|CommaModeCall) parameters)*;

    blockOfarguments :OpenBrace arguments CloseBrace;
    variableDeclaration : kind? (id) (( Assign (expression | callfunction | callIdentifier | arrowFunction) )? )  ;
    variableDeclarationList : variableDeclaration ( Comma variableDeclaration )* ;

    arrowFunction: Async?(openParen arguments? closeParen | id )(ARROW|ARROWModeCall)
                  (
                    expression?
                  | openBrace statment* returnstatment? closeBrace
                  | jsxElement
                  | returnstatment
                  )
                  ;
    returnstatment : Return (expression|jsxBlock)? ;
    simpleCallfunction : id openParen arguments? closeParen ;
    //simpleCallfunctionModeCall : id openParen (callIdentifier|arrowFunction)? closeParen ;
    argument : (callIdentifier (assign (expression|arrowFunction))?);
    hooks:
            useEffect
          | useMemo
          | useRef
          | useState
          ;
    hook:
           UseEffect
         | UseMemo
         | UseRef
         | UseState
         ;

    useState: kind? OpenBracket id Comma id CloseBracket Assign UseState? OpenParen (id | NullLiteral) CloseParen;
    useEffect: OpenParen arrowFunction Comma array CloseParen ;
    useRef: kind? id Assign UseRef OpenParen (id | NullLiteral) CloseParen ;
    useMemo :  kind? id Assign UseMemo OpenParen arrowFunction Comma array CloseParen;
    ////////////////rana part
    parameters :
                 arrowFunction
               | callIdentifier
               | argument
               | callfunction
               | expression
               | NullLiteral
               | NullLiteralModeCall
               | blockOfarguments
               ;


    callIdentifier: id ((Dot|DotModeCall) id  )*;
    expression:  openParen expression ((Multiply|MultiplyModeCall) | (Divide|DivideModeCall)) expression closeParen
               | openParen expression( (Plus|PlusModeCall) | (Minus|MinusModeCall)) expression closeParen
               | expression ((Multiply|MultiplyModeCall) | (Divide|DivideModeCall)) expression
               | expression( (Plus|PlusModeCall) | (Minus|MinusModeCall)) expression
               | callIdentifier (PlusPlus|MinusMinus)
               | data
               ;
    export:Export Default callIdentifier SemiColon* IgSemiColon *;

    data :
          array
        | (NUMBER|NUMBERModeCall)
        | (String|StringModeCall)
        | id
        | map
        |(BooleanLiteral|BooleanLiteralModeCall)
        ;

         array : OpenBracket suquence? CloseBracket  ;
    map :OpenBrace (mapElementList)* CloseBrace ;
    mapElementList: mapElement (Comma mapElement)*;
    mapElement:IDENTIFIER Colon ( callfunction | callIdentifier | expression );



    suquence : data(Comma data )* ;
    kind:    Const
           | Let
           | Var;
    operation :
                     LessThan
                   | LessThanModeCall
                   | MoreThan
                   | MoreThanModeCall
                   | (Equals_|Equals_ModeCall)
                   | GreaterThanEquals
                   | GreaterThanEqualsModeCall
                   | LessThanEqualsModeCall
                   | LessThanEquals
                   | NotEquals
                   | NotEqualsModeCall
                   | IdentityEquals
                   | IdentityEqualsModeCall
                   | IdentityNotEquals
                   | IdentityNotEqualsModeCall
                   ;
                   
    id:IDENTIFIER|Id|IDENTIFIERIn;
    openParen:OpenParen|OpenParenModeCall;
    closeParen:CloseParen|CloseParenModeCall;
    assign:Assign|AssignModeCall;
    closeBrace:CloseBrace|CloseBraceModeCall;
    openBrace:OpenBrace|OpenBraceModeCall;
    jsx_tag:JSX_TAGIn|JSX_TAGInIn|JSX_TAG;
                   
    break:Break;
