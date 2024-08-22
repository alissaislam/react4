package visitors;


import SymbolTable.SymbolTable;
import SymbolTable.StRow;
import antlr.ReactParser;
import SymbolTable.Scope;
import SymbolTable.CustomStack;
import antlr.ReactParserBaseVisitor;
import ast.Models.*;
import ast.Models.Number;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;


public class

BaseVisitor extends ReactParserBaseVisitor {
  static   SymbolTable  symbolTable = new SymbolTable();
  static CustomStack scopes = new CustomStack ();

    public static SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public static void setSymbolTable(SymbolTable symbolTable) {
        BaseVisitor.symbolTable = symbolTable;
    }

    @Override
    public Start visitStart(ReactParser.StartContext ctx) {
        Start start = new Start();
        start.setNode_type("Start");
        start.setNode_name("Start");
        start.setCount_child(ctx.getChildCount());
        start.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.statment()!=null){
            for (int i=0;i<ctx.statment().size();i++){
                start.getStatement_list().add((Statement) visitStatment(ctx.statment(i)));
                start.getChild().add(start.getStatement_list().get(i));
            }
        }








        //start.setChild (start.getStatement_list ());
//        StRow stRow = new StRow ();
//        stRow.setType(start.getNode_type());
//        strow.setName(start.getNode_name());
//        symbolTable.getRows().add(stRow);
        return start;
    }


    @Override
    public Statement visitStatment(ReactParser.StatmentContext ctx) {

        Statement statement = new Statement();
        statement.setNode_type("Statement");
        statement.setNode_name("Statement");
        statement.setCount_child(ctx.getChildCount());
        statement.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.statmentElement()!=null) {
            statement.setStatementElement ((StatementElement) visitStatmentElement (ctx.statmentElement ()));
            statement.getChild ().add (statement.getStatementElement ());
        }
//        StRow stRow = new StRow();
//        stRow.setType(statement.getNode_type());
//        strow.setName(statement.getNode_name());
//        symbolTable.getRows().add(stRow);
        return statement;
    }
//
//    @Override
//    public VariableDeclarationList visitLabelvarDecList(ReactParser.LabelvarDecListContext ctx) {
//        if (ctx.variableDeclarationList()!=null)
//            return ((VariableDeclarationList) visitVariableDeclarationList(ctx.variableDeclarationList()));
//
//        else
//            return null;
//    }
//
//    @Override
//    public If visitLabelif(ReactParser.LabelifContext ctx) {
//        if (ctx.if_()!=null)
//            return ((If) visitIf(ctx.if_()));
//        else
//            return null;
//    }
//
//    @Override
//    public For visitLabelforElement(ReactParser.LabelforElementContext ctx) {
//        if (ctx.forElement()!=null)
//            return ((For) visitForElement(ctx.forElement()));
//        else
//            return null;
//    }
//
//    @Override
//    public Function visitLabelFunction(ReactParser.LabelFunctionContext ctx) {
//        if (ctx.function()!=null)
//            return ((Function) visitFunction(ctx.function()));
//        else
//            return null;
//    }
//
//    @Override
//    public Comment visitLabelComments(ReactParser.LabelCommentsContext ctx) {
//        if (ctx.comments()!=null)
//            return ((Comment) visitComments(ctx.comments()));
//        else
//            return null;
//    }
//
//    @Override
//    public While visitLabelWhile(ReactParser.LabelWhileContext ctx) {
//        if (ctx.while_()!=null)
//            return ((While) visitWhile(ctx.while_()));
//        else
//            return null;
//    }
//
//    @Override
//    public DoWhile visitLabelDoWhile(ReactParser.LabelDoWhileContext ctx) {
//        if (ctx.do_while()!=null)
//            return ((DoWhile) visitDo_while(ctx.do_while()));
//        else
//            return null;
//    }
//
//    @Override
//    public CallFunction visitLabelCallFunction(ReactParser.LabelCallFunctionContext ctx) {
//        if (ctx.callfunction()!=null)
//            return ((CallFunction) visitCallfunction(ctx.callfunction()));
//        else
//            return null;
//    }
//
//    @Override
//    public Switch visitLabelSwitch(ReactParser.LabelSwitchContext ctx) {
//        if (ctx.switch_()!=null)
//            return ((Switch) visitSwitch(ctx.switch_()));
//        else
//            return null;
//    }
//
//    @Override
//    public Block visitLabelBlock(ReactParser.LabelBlockContext ctx) {
//        if (ctx.block()!=null)
//            return ((Block) visitBlock(ctx.block()));
//        else
//            return null;
//    }
//
//    @Override
//    public Break visitLabelBreak(ReactParser.LabelBreakContext ctx) {
//        if (ctx.break_()!=null)
//            return ((Break) visitBreak(ctx.break_()));
//        else
//            return null;    }
//
//    @Override
//    public TryCatch visitLabelTryCatch(ReactParser.LabelTryCatchContext ctx) {
//        if (ctx.tryCatch()!=null)
//            return ((TryCatch) visitTryCatch(ctx.tryCatch()));
//        else
//            return null;
//    }
//
//    @Override
//    public Import visitLabelImport(ReactParser.LabelImportContext ctx) {
//        if (ctx.importt()!=null)
//            return ((Import) visitImportt(ctx.importt()));
//        else
//            return null;
//    }
//
//    @Override
//    public IfShort visitLabelIfShort(ReactParser.LabelIfShortContext ctx) {
//        if (ctx.ifShort()!=null)
//            return ((IfShort) visitIfShort(ctx.ifShort()));
//        else
//            return null;
//    }
//
//    @Override
//    public Sequence visitLabelSequence(ReactParser.LabelSequenceContext ctx) {
//        if (ctx.suquence()!=null)
//            return ((Sequence) visitSuquence(ctx.suquence()));
//        else
//            return null;
//    }
//
//    @Override
//    public Export visitLabelExport(ReactParser.LabelExportContext ctx) {
//        if (ctx.export()!=null)
//            return ((Export) visitExport(ctx.export()));
//        else
//            return null;
//    }
//
//    @Override
//    public JsxElement visitLabelJsxElement(ReactParser.LabelJsxElementContext ctx) {
//        if (ctx.jsxElement()!=null)
//            return ((JsxElement) visitJsxElement(ctx.jsxElement()));
//        else
//            return null;
//    }
//
//    @Override
//    public Expression visitLabelExpression(ReactParser.LabelExpressionContext ctx) {
//        if (ctx.expression()!=null)
//            return ((Expression) visit(ctx.expression()));
//        else
//            return null;
//    }
//
//    @Override
//    public ArrowFunction visitLabelArrowFunction(ReactParser.LabelArrowFunctionContext ctx) {
//        if (ctx.arrowFunction()!=null)
//            return ((ArrowFunction) visitArrowFunction(ctx.arrowFunction()));
//        else
//            return null;
//    }

//    @Override
//    public Object visitStatmentElement(ReactParser.StatmentElementContext ctx) {
//
//    }

    @Override
    public StatementElement visitStatmentElement(ReactParser.StatmentElementContext ctx) {
        StatementElement statementElement = new StatementElement();
        statementElement.setNode_type("StatementElement");
        statementElement.setCount_child(ctx.getChildCount());
        statementElement.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.variableDeclarationList()!=null) {
            statementElement.setVariableDeclarationList((VariableDeclarationList) visitVariableDeclarationList(ctx.variableDeclarationList()));
            statementElement.getChild().add(statementElement.getVariableDeclarationList());
        }
        else if (ctx.if_()!=null) {
            statementElement.setForelement((For) visitForElement(ctx.forElement()));
            statementElement.getChild().add(statementElement.getForelement());
        }
        else if (ctx.function()!=null) {
            statementElement.setFunctionElement((Function) visitFunction(ctx.function()));
            statementElement.getChild().add(statementElement.getFunctionElement());
        }
        else if (ctx.comments()!=null) {
            statementElement.setComment((Comment) visitComments(ctx.comments()));
            statementElement.getChild().add(statementElement.getComment());
        }
        else if (ctx.while_()!=null) {
            statementElement.setWhileElement((While) visitWhile(ctx.while_()));
            statementElement.getChild().add(statementElement.getWhileElement());
        }
        else if (ctx.do_while()!=null) {
            statementElement.setDoWhileElement((DoWhile) visitDo_while(ctx.do_while()));
            statementElement.getChild().add(statementElement.getDoWhileElement());
        }
        else if (ctx.callfunction()!=null) {
            statementElement.setCallFunction((CallFunction) visitCallfunction(ctx.callfunction()));
            statementElement.getChild().add(statementElement.getCallFunction());
        }
        else if (ctx.switch_()!=null) {
            statementElement.setSwitchElement((Switch) visitSwitch(ctx.switch_()));
            statementElement.getChild().add(statementElement.getSwitchElement());
        }
        else if (ctx.block()!=null) {
            statementElement.setBlock((Block) visitBlock(ctx.block()));
            statementElement.getChild().add(statementElement.getBlock());
        }
        else if (ctx.break_()!=null) {
            statementElement.setBreakElement((Break) visitBreak(ctx.break_()));
            statementElement.getChild().add(statementElement.getBreakElement());
        }
        else if (ctx.tryCatch()!=null) {
            statementElement.setTryCatch((TryCatch) visitTryCatch(ctx.tryCatch()));
            statementElement.getChild().add(statementElement.getTryCatch());
        }
        else if (ctx.importt()!=null) {
            statementElement.setImportElement((Import) visitImportt(ctx.importt()));
            statementElement.getChild().add(statementElement.getImportElement());
        }
        else if (ctx.ifShort()!=null) {
            statementElement.setIfShort((IfShort) visitIfShort(ctx.ifShort()));
            statementElement.getChild().add(statementElement.getIfShort());
        }
        else if (ctx.suquence()!=null) {
            statementElement.setSequence((Sequence) visitSuquence(ctx.suquence()));
            statementElement.getChild().add(statementElement.getSequence());
        }
        else if (ctx.export()!=null) {
            statementElement.setExportElement((Export) visitExport(ctx.export()));
            statementElement.getChild().add(statementElement.getExportElement());
        }
        else if (ctx.jsxElement()!=null) {
            statementElement.setJsxElement((JsxElement) visitJsxElement(ctx.jsxElement()));
            statementElement.getChild().add(statementElement.getJsxElement());
        }
        else if (ctx.expression()!=null) {
            statementElement.setExpression((Expression) visitExpression(ctx.expression()));
            statementElement.getChild().add(statementElement.getExpression());
        }
        else if (ctx.arrowFunction()!=null) {
            statementElement.setArrowFunction((ArrowFunction) visitArrowFunction(ctx.arrowFunction()));
            statementElement.getChild().add(statementElement.getArrowFunction());
        }
//        StRow stRow = new StRow();
//        stRow.setType(statementElement.getNode_type());
//        strow.setName(statementElement.getNode_type());
        return statementElement;
    }

    @Override
    public JsxParameters visitJsxParameters(ReactParser.JsxParametersContext ctx) {
        JsxParameters jsxParameters = new JsxParameters();
        jsxParameters.setNode_type("JsxParameters");
        jsxParameters.setCount_child(ctx.getChildCount());
        jsxParameters.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if(ctx.jsxArrowFunction()!=null) {
            jsxParameters.setJsxArrowFunction((JsxArrowFunction) visitJsxArrowFunction(ctx.jsxArrowFunction()));
            jsxParameters.getChild().add(jsxParameters.getJsxArrowFunction());
        }
        else if (ctx.jsxCallfunction()!=null) {
            jsxParameters.setJsxCallfunction((JsxCallfunction) visitJsxCallfunction(ctx.jsxCallfunction()));
            jsxParameters.getChild().add(jsxParameters.getJsxCallfunction());
        }
        else if (ctx.jsxArgument()!=null) {
            jsxParameters.setJsxArgument((JsxArgument) visitJsxArgument(ctx.jsxArgument()));
            jsxParameters.getChild().add(jsxParameters.getJsxArgument());
        }
        else if (ctx.jsxCallIdentifier()!=null) {
            jsxParameters.setJsxCallIdentifier((JsxCallIdentifier) visitJsxCallIdentifier(ctx.jsxCallIdentifier()));
            jsxParameters.getChild().add(jsxParameters.getJsxCallIdentifier());
        }
        else if (ctx.jsxExpression()!=null) {
            jsxParameters.setJsxExpression((JsxExpression) visitJsxExpression(ctx.jsxExpression ()));
            jsxParameters.getChild().add(jsxParameters.getJsxExpression());
        }
//        StRow stRow = new StRow();
//        stRow.setType(jsxParameters.getNode_type());
//        strow.setName(jsxParameters.getNode_type());
        return jsxParameters;
    }

    @Override
    public If visitIf(ReactParser.IfContext ctx) {
        If ifElement = new If();
        ifElement.setNode_type("If");
        ifElement.setCount_child(ctx.getChildCount());
        ifElement.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.conditions()!=null) {
            ifElement.setCondition(visitConditions(ctx.conditions()));
            ifElement.getChild().add(ifElement.getCondition());
        }
        if (ctx.block()!=null){
            ifElement.setBlock(visitBlock(ctx.block()));
            ifElement.getChild().add(ifElement.getBlock());
        }
        if (ctx.statment()!=null){
            ifElement.setStatement(visitStatment(ctx.statment()));
            ifElement.getChild().add(ifElement.getStatement());
        }
        for (int i=0;i<ctx.else_if().size();i++){
            ifElement.getElseIfList().add(visitElse_if(ctx.else_if(i)));
            ifElement.getChild().add(ifElement.getElseIfList().get(i));
        }
        if (ctx.else_()!=null) {
            ifElement.setElseElement(visitElse(ctx.else_()));
            ifElement.getChild().add(ifElement.getElseElement());
        }
//        StRow row = new StRow();
//        row.setType(ifElement.getNode_type());
//        row.setName(ifElement.getNode_type());
//        symbolTable.getRows().add(row);
        return ifElement;
    }

    @Override
    public For visitForElement(ReactParser.ForElementContext ctx) {
        For forElement = new For();
        forElement.setNode_type("For");
        forElement.setCount_child(ctx.getChildCount());
        forElement.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.forLoopParts()!=null) {
            forElement.setForLoopParts(visitForLoopParts(ctx.forLoopParts()));
            forElement.getChild().add(forElement.getForLoopParts());
        }
        if (ctx.block()!=null) {
            forElement.setBlock(visitBlock(ctx.block()));
            forElement.getChild().add(forElement.getBlock());
        }
        if (ctx.statment()!=null) {
            forElement.setStatement(visitStatment(ctx.statment()));
            forElement.getChild().add(forElement.getStatement());
        }
//        StRow row = new StRow();
//        row.setType(forElement.getNode_type());
//        row.setName(forElement.getNode_type());
//        symbolTable.getRows().add(row);
        return forElement;
    }

    @Override
    public Function visitFunction(ReactParser.FunctionContext ctx) {
        Function function = new Function();
        function.setNode_type("Function");
        function.setCount_child(ctx.getChildCount());
        function.setLine_num(String.valueOf(ctx.getStart().getLine()));


        if (ctx.id()!=null){
            Id id = new Id ();
            id.setId (ctx.id().getText ());
            //function.setId( (Id) visitId(ctx.id()));
            function.setId (id);
            function.setNode_name(id.getId ());
            function.getChild().add(function.getId());
        }
        if (ctx.arguments()!=null){
            function.setArguments(visitArguments(ctx.arguments()));
            function.getChild().add(function.getArguments());
        }
        if (ctx.OpenBrace ()!=null){
            scopes.add (new Scope (scopes.size (),scopes.getgId ()));
        }
        for (int i=0;i<ctx.statment().size();i++) {
            function.getStatements().add(visitStatment(ctx.statment(i)));
            function.getChild().add(function.getStatements().get(i));
        }
        for (int i=0;i<ctx.returnstatment().size();i++) {
            function.getReturnstatments().add(visitReturnstatment(ctx.returnstatment(i)));
            function.getChild().add(function.getReturnstatments().get(i));
        }
        if (ctx.CloseBrace ()!=null){
            scopes.pop ();
        }

        StRow row = new StRow();
        row.setType(function.getNode_type());
        row.setName(function.getNode_name());
        row.setScope (scopes);
        symbolTable.getRows().add(row);
        return function;
    }

    @Override
    public Comment visitComments(ReactParser.CommentsContext ctx) {
        Comment comment = new Comment();
        comment.setNode_type("Comments");
        comment.setCount_child(ctx.getChildCount());
        comment.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.SINGLE_LINE_COMMENT()!=null){
            comment.setSingleLineComment(ctx.SINGLE_LINE_COMMENT().getText());
            comment.setNode_name(ctx.SINGLE_LINE_COMMENT().getText());
            Stringg stringg = new Stringg();
            stringg.setNode_type("SINGLE_LINE_COMMENT");
            stringg.setString(ctx.SINGLE_LINE_COMMENT().getText());
            comment.getChild().add(stringg);
        }
        if (ctx.MULTI_LINE_COMMENT()!=null){
            comment.setMultiLineComment(ctx.MULTI_LINE_COMMENT().getText());
            comment.setNode_name(ctx.MULTI_LINE_COMMENT().getText());
            Stringg stringg = new Stringg();
            stringg.setNode_type("MULTI_LINE_COMMENT");
            stringg.setString(ctx.MULTI_LINE_COMMENT().getText());
            comment.getChild().add(stringg);
        }
//        StRow row = new StRow();
//        row.setType(comment.getNode_type());
//        row.setName(comment.getNode_name());
//        symbolTable.getRows().add(row);
        return comment;

    }

    @Override
    public While visitWhile(ReactParser.WhileContext ctx) {
        While whileElement = new While();
        whileElement.setNode_type("While");
        whileElement.setCount_child(ctx.getChildCount());
        whileElement.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.conditions()!=null) {
            whileElement.setCondition(visitConditions(ctx.conditions()));
            whileElement.getChild().add(whileElement.getCondition());
        }
        if (ctx.block()!=null) {
            whileElement.setBlock(visitBlock(ctx.block()));
            whileElement.getChild().add(whileElement.getBlock());
        }
        if (ctx.statment()!=null) {
            whileElement.setStatement(visitStatment(ctx.statment()));
            whileElement.getChild().add(whileElement.getStatement());
        }
//        StRow row = new StRow();
//        row.setType(whileElement.getNode_type());
//        row.setName(whileElement.getNode_type());
//        symbolTable.getRows().add(row);
        return whileElement;
    }

    @Override
    public DoWhile visitDo_while(ReactParser.Do_whileContext ctx) {
        DoWhile doWhile = new DoWhile();
        doWhile.setNode_type("DoWhile");
        doWhile.setCount_child(ctx.getChildCount());
        doWhile.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.conditions()!=null) {
            doWhile.setCondition(visitConditions(ctx.conditions()));
            doWhile.getChild().add(doWhile.getCondition());
        }
        if (ctx.block()!=null) {
            doWhile.setBlock(visitBlock(ctx.block()));
            doWhile.getChild().add(doWhile.getBlock());
        }
        if (ctx.statment()!=null) {
            doWhile.setStatement(visitStatment(ctx.statment()));
            doWhile.getChild().add(doWhile.getCondition());
        }
//        StRow row = new StRow();
//        row.setType(doWhile.getNode_type());
//        row.setName(doWhile.getNode_type());
//        symbolTable.getRows().add(row);
        return doWhile;
    }

    @Override
    public CallFunction visitCallfunction(ReactParser.CallfunctionContext ctx) {
        CallFunction callFunction = new CallFunction();
        callFunction.setNode_type("CallFunction");
        callFunction.setNode_name ("Callfunction");
        callFunction.setCount_child(ctx.getChildCount());
        callFunction.setLine_num(String.valueOf(ctx.getStart().getLine()));
        for (int i=0;i<ctx.simpleCallfunction().size();i++) {
            callFunction.getSimpleCallfunctions().add(visitSimpleCallfunction(ctx.simpleCallfunction(i)));
            callFunction.getChild().add(callFunction.getSimpleCallfunctions().get(i));

        }
        for (int i=0;i<ctx.callIdentifier().size();i++) {
            callFunction.getCallIdentifiers().add(visitCallIdentifier(ctx.callIdentifier(i)));
            callFunction.getChild().add(callFunction.getCallIdentifiers().get(i));
        }
//        StRow row = new StRow();
//        row.setType(callFunction.getNode_type());
//        row.setName(callFunction.getNode_type());
//        symbolTable.getRows().add(row);
        return callFunction;
    }

    @Override
    public Switch visitSwitch(ReactParser.SwitchContext ctx) {
        Switch switchElement = new Switch();
        switchElement.setNode_type("Switch");
        switchElement.setCount_child(ctx.getChildCount());
        switchElement.setLine_num(String.valueOf(ctx.getStart().getLine()));
        for (int i=0;i<ctx.expression().size();i++) {
            switchElement.getExpressions().add((Expression) visit(ctx.expression(i)));
            switchElement.getChild().add(switchElement.getExpressions().get(i));
        }
        if (ctx.OpenBrace ()!=null){
            scopes.add (new Scope (scopes.size (),scopes.getgId ()));
        }
        for (int i=0;i<ctx.block().size();i++) {
            switchElement.getBlocks().add(visitBlock(ctx.block(i)));
            switchElement.getChild().add(switchElement.getBlocks().get(i));
        }
        for (int i=0;i<ctx.statment().size();i++) {
            switchElement.getStatements().add(visitStatment(ctx.statment(i)));
            switchElement.getChild().add(switchElement.getStatements().get(i));
        }
        if (ctx.CloseBrace ()!=null){
            scopes.pop ();
        }
//        StRow row = new StRow();
//        row.setType(switchElement.getNode_type());
//        row.setName(switchElement.getNode_type());
//        symbolTable.getRows().add(row);
        return switchElement;
    }

    @Override
    public TryCatch visitTryCatch(ReactParser.TryCatchContext ctx) {
        TryCatch tryCatch = new TryCatch();
        tryCatch.setNode_type("TryCatch");
        tryCatch.setCount_child(ctx.getChildCount());
        tryCatch.setLine_num(String.valueOf(ctx.getStart().getLine()));
        for (int i=0;i<ctx.block().size();i++) {
            tryCatch.getBlocks().add(visitBlock(ctx.block(i)));
            tryCatch.getChild().add(tryCatch.getBlocks().get(i));
        }
        for (int i=0;i<ctx.id().size();i++) {
            tryCatch.getIds().add(visitId(ctx.id(i)));
            tryCatch.getChild().add(tryCatch.getIds().get(i));
        }
//        StRow row = new StRow();
//        row.setType(tryCatch.getNode_type());
//        row.setName(tryCatch.getNode_type());
//        symbolTable.getRows().add(row);
        return tryCatch;
    }

    @Override
    public Import visitImportt(ReactParser.ImporttContext ctx) {
        Import importElement = new Import();
        importElement.setNode_type("Import");
        importElement.setCount_child(ctx.getChildCount());
        importElement.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.OpenBrace ()!=null){
            scopes.add (new Scope (scopes.size (),scopes.getgId ()));
        }
        for (int i=0 ; i<ctx.id().size();i++){
            importElement.getIds().add(visitId(ctx.id(i)));
            importElement.getChild().add(importElement.getIds().get(i));
            StRow row = new StRow();
            row.setType(importElement.getNode_type());
            row.setName(importElement.getIds ().get (i).getId ());
            symbolTable.getRows().add(row);
        }
        for (int i=0 ; i<ctx.hook ().size();i++){
            importElement.getHooks ().add( visitHook (ctx.hook (i)));
            importElement.getChild().add(importElement.getHooks ().get(i));

        }
        if (ctx.CloseBrace ()!=null){
            scopes.pop ();
        }
        if (ctx.String()!=null) {
            importElement.setString(ctx.String().getText());
            Stringg stringg = new Stringg();
            stringg.setNode_type("String");
            stringg.setNode_name (ctx.String().getText ());
            stringg.setCount_child(ctx.getChildCount());
            stringg.setLine_num(String.valueOf(ctx.getStart().getLine()));
            stringg.setString(ctx.String().getText());
            importElement.getChild().add(stringg);
        }

//
        return importElement;
    }

    @Override
    public IfShort visitIfShort(ReactParser.IfShortContext ctx) {
        IfShort ifShort = new IfShort();
        ifShort.setNode_type("IfShort");
        ifShort.setCount_child(ctx.getChildCount());
        ifShort.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.callIdentifier()!=null) {
            ifShort.setCallIdentifier(visitCallIdentifier(ctx.callIdentifier()));
            ifShort.getChild().add(ifShort.getCallIdentifier());
        }
        if (ctx.operation()!=null) {
            ifShort.setOperation(visitOperation(ctx.operation()));
            ifShort.getChild().add(ifShort.getOperation());
        }
        if (ctx.expression()!=null) {
            ifShort.setExpression((Expression) visit(ctx.expression()));
            ifShort.getChild().add(ifShort.getExpression());
        }
        //System.out.println (ctx.statment ().get (0).getText ());
        for (int i =0;i<ctx.statment().size();i++) {
            Statement statement =visitStatment(ctx.statment ().get (i));
            System.out.println (statement);
            ifShort.getStatements()
                    .add(statement);
            ifShort.getChild().add(ifShort.getStatements().get(i));
        }
        for (int i =0;i<ctx.jsxElement().size();i++) {
            ifShort.getJsxElements().add(visitJsxElement(ctx.jsxElement(i)));
            ifShort.getChild().add(ifShort.getJsxElements().get(i));
        }
//        StRow row = new StRow();
//        row.setType(ifShort.getNode_type());
//        row.setName(ifShort.getNode_type());
//        symbolTable.getRows().add(row);
        return ifShort;
    }

    @Override
    public JsxElement visitJsxElement(ReactParser.JsxElementContext ctx) {
        JsxElement jsxElement = new JsxElement();
        jsxElement.setNode_type("JsxElement");
        jsxElement.setCount_child(ctx.getChildCount());
        jsxElement.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.jsxElementNonSelfClosing()!=null) {
            jsxElement.setJsxElementNonSelfClosing (visitJsxElementNonSelfClosing (ctx.jsxElementNonSelfClosing ()));
            jsxElement.getChild ().add (jsxElement.getJsxElementNonSelfClosing ());
        }
        if (ctx.jsxElementSelfClosing()!=null) {
            jsxElement.setJsxElementSelfClosing (visitJsxElementSelfClosing (ctx.jsxElementSelfClosing ()));
            jsxElement.getChild ().add (jsxElement.getJsxElementSelfClosing ());
        }
//        StRow row = new StRow();
//        row.setType(jsxElement.getNode_type());
//        row.setName(jsxElement.getNode_type());
//        symbolTable.getRows().add(row);
        return jsxElement;
    }

    @Override
    public JsxElementNonSelfClosing visitJsxElementNonSelfClosing(ReactParser.JsxElementNonSelfClosingContext ctx) {
        JsxElementNonSelfClosing jsxElementNonSelfClosing = new JsxElementNonSelfClosing();
        jsxElementNonSelfClosing.setNode_type("JsxElementNonSelfClosing");
        jsxElementNonSelfClosing.setCount_child(ctx.getChildCount());
        jsxElementNonSelfClosing.setLine_num(String.valueOf(ctx.getStart().getLine()));

        for (int i=0;i<ctx.attribute ().size();i++) {
            jsxElementNonSelfClosing.getAttributes().add(visitAttribute (ctx.attribute(i)));
            jsxElementNonSelfClosing.getChild().add(jsxElementNonSelfClosing.getAttributes().get(i));

        }

        if (ctx.OpenBraceInIn ()!=null){
            scopes.add (new Scope (scopes.size (),scopes.getgId ()));
        }

        for (int i=0;i<ctx.ifShort().size();i++) {
            jsxElementNonSelfClosing.getIfShorts().add(visitIfShort(ctx.ifShort(i)));
            jsxElementNonSelfClosing.getChild().add(jsxElementNonSelfClosing.getIfShorts().get(i));
        }
        if (ctx.CloseBraceCall ()!=null){
            scopes.pop ();
        }
        if (ctx.JSX_TAG ()!=null){
            System.out.println ("hhhhh");
            System.out.println (ctx.JSX_TAG ().getText ());
            jsxElementNonSelfClosing.setJsxTag (ctx.JSX_TAG ().getText ());
        }
        if (ctx.JSX_TAGModeCall ()!=null){
            System.out.println ("kkkkk");
            System.out.println (ctx.JSX_TAGModeCall ().getText ());
            jsxElementNonSelfClosing.setJsxTag (ctx.JSX_TAGModeCall ().getText ());
        }
        for (int i=0;i<ctx.LETTERR().size();i++) {
            jsxElementNonSelfClosing.getLetterrs().add(ctx.LETTERR(i).getText());
            Stringg stringg = new Stringg();
            stringg.setNode_type("LETTERR");
            stringg.setString(ctx.LETTERR().toString ());
            jsxElementNonSelfClosing.getChild().add(stringg);
            StRow row = new StRow();
            row.setType ("Text");
            row.setName (ctx.LETTERR().get(0).getText ());
            row.setScope (scopes);
            symbolTable.getRows().add(row);
        }
        for (int i=0;i<ctx.jsxElementIn().size();i++) {
            jsxElementNonSelfClosing.getJsxElementIns().add(visitJsxElementIn(ctx.jsxElementIn().get (i)));
            jsxElementNonSelfClosing.getChild().add(jsxElementNonSelfClosing.getJsxElementIns().get(i));
        }
        for (int i=0;i<ctx.blockOfarguments().size();i++) {
            jsxElementNonSelfClosing.getBlockOfarguments().add(visitBlockOfarguments(ctx.blockOfarguments(i)));
            jsxElementNonSelfClosing.getChild().add(jsxElementNonSelfClosing.getBlockOfarguments().get(i));
        }
        if (!ctx.Id ().isEmpty ()){

        }
//        StRow row = new StRow();
//        row.setType(jsxElementNonSelfClosing.getNode_type());
//        row.setName(jsxElementNonSelfClosing.getNode_type());
//        symbolTable.getRows().add(row);

        return jsxElementNonSelfClosing;
    }

    @Override
    public Attribute visitAttribute(ReactParser.AttributeContext ctx) {
        Attribute attribute = new Attribute ();
        attribute.setNode_type("Attribute");
        attribute.setCount_child(ctx.getChildCount());
        attribute.setLine_num(String.valueOf(ctx.getStart().getLine()));
        StRow row = new StRow();
        row.setType(attribute.getNode_type());
        row.setScope (scopes);
        if (ctx.id()!= null) {
            attribute.setId (visitId(ctx.id()));
            attribute.getChild ().add (attribute.getId ());
            row.setName (attribute.getId ().getId ());
        }
        if (ctx.blockIn ()!= null) {
            attribute.setBlockIn (visitBlockIn (ctx.blockIn ()));
            attribute.getChild ().add (attribute.getBlockIn ());
            row.setValue ("Block");
        }
        if (ctx.StringIn() !=null) {
            Stringg stringg = new Stringg();
            stringg.setNode_type("StringIn");
            stringg.setString(ctx.StringIn().getText());
            attribute.setStringg(stringg);
            attribute.getChild().add(stringg);
            row.setValue (attribute.getStringg ().getString ());
        }
        row.setAssigned (true);
        symbolTable.getRows().add(row);
        return attribute;
    }

    @Override
    public JsxElementSelfClosing visitJsxElementSelfClosing(ReactParser.JsxElementSelfClosingContext ctx) {
        JsxElementSelfClosing jsxElementSelfClosing = new JsxElementSelfClosing();
        jsxElementSelfClosing.setNode_type("JsxElementSelfClosing");
        jsxElementSelfClosing.setCount_child(ctx.getChildCount());
        jsxElementSelfClosing.setLine_num(String.valueOf(ctx.getStart().getLine()));

        if (ctx.jsx_tag ()!=null){
            jsxElementSelfClosing.setJsxTag (ctx.jsx_tag ().getText ());
        }

        for (int i=0;i<ctx.attribute ().size();i++) {

            jsxElementSelfClosing.getAttributes().add( visitAttribute (ctx.attribute ().get (i)));

            jsxElementSelfClosing.getChild().add(jsxElementSelfClosing.getAttributes().get(i));

        }

        return jsxElementSelfClosing;

    }

    @Override
    public JsxElementIn visitJsxElementIn(ReactParser.JsxElementInContext ctx) {
        JsxElementIn jsxElementIn = new JsxElementIn();
        jsxElementIn.setNode_type("JsxElementIn");
        jsxElementIn.setCount_child(ctx.getChildCount());
        jsxElementIn.setLine_num(String.valueOf(ctx.getStart().getLine()));

        if(!ctx.Id ().isEmpty ()){
            jsxElementIn.setId1 (ctx.Id ().get (0).getText ());
            jsxElementIn.setId2 (ctx.Id ().get (1).getText ());
        }
        if (!ctx.MinusMinusModeCall ().isEmpty ()){
            jsxElementIn.setOp (ctx.MinusMinusModeCall ().get(0).getText ());
        }
        if (!ctx.MinusMinusModeCall ().isEmpty ()){
            jsxElementIn.setOp (ctx.PlussPlussModeCall ().get(0).getText ());

        }
        if(ctx.JSX_TAGIn ()!=null){
            jsxElementIn.setJsxTag (ctx.JSX_TAGIn ().getText ());
        }
        if(ctx.JSX_TAGInIn ()!=null){
            jsxElementIn.setJsxTag (ctx.JSX_TAGInIn ().getText ());
        }

        if (ctx.OpenBraceInIn ()!=null){
            scopes.add (new Scope (scopes.size (),scopes.getgId ()));
        }

        for (int i=0;i<ctx.jsxElementIn().size();i++) {
            jsxElementIn.getJsxElementIns().add(visitJsxElementIn(ctx.jsxElementIn(i)));
            jsxElementIn.getChild().add(jsxElementIn.getJsxElementIns().get(i));
        }
        for (int i=0;i<ctx.LETTERR().size();i++) {
            jsxElementIn.getLetterrs().add(ctx.LETTERR(i).getText());
            Stringg stringg = new Stringg();
            stringg.setNode_type("LETTERR");
            stringg.setString(ctx.LETTERR().get(i).getText());
            jsxElementIn.getChild().add(stringg);
        }
        if (ctx.CloseBraceCall ()!=null){
            scopes.pop ();
        }
        for (int i=0;i<ctx.blockOfarguments().size();i++) {
            jsxElementIn.getBlockOfarguments().add(visitBlockOfarguments(ctx.blockOfarguments(i)));
            jsxElementIn.getChild().add(jsxElementIn.getBlockOfarguments().get(i));
        }
        if(ctx.jsxElementSelfClosing ()!= null){
            jsxElementIn.setJsxElementSelfClosing (visitJsxElementSelfClosing (ctx.jsxElementSelfClosing ()));
            jsxElementIn.getChild().add(jsxElementIn.getJsxElementSelfClosing ());
        }
        for (int i=0;i<ctx.attribute ().size();i++) {
            jsxElementIn.getAttributes().add(visitAttribute (ctx.attribute(i)));
            jsxElementIn.getChild().add(jsxElementIn.getAttributes().get(i));

        }
        if (ctx.CLOSE_TAGIn ()!=null){
            jsxElementIn.setClose (ctx.CLOSE_TAGIn ().getText ());
        }

        return jsxElementIn;

    }

    @Override
    public BlockIn visitBlockIn(ReactParser.BlockInContext ctx) {
        BlockIn blockIn = new BlockIn();
        blockIn.setNode_type("BlockIn");
        blockIn.setCount_child(ctx.getChildCount());
        blockIn.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.OpenBraceIn ()!=null){
            scopes.add (new Scope (scopes.size (),scopes.getgId ()));
        }
        for (int i =0;i<ctx.jsxArguments().size();i++) {
            blockIn.getJsxArgumentsList().add(visitJsxArguments(ctx.jsxArguments(i)));
            blockIn.getChild().add(blockIn.getJsxArgumentsList().get(i));
        }
        if (ctx.CloseBraceIn ()!=null){
            scopes.pop ();
        }
//        StRow row = new StRow();
//        row.setType(blockIn.getNode_type());
//        row.setName(blockIn.getNode_type());
//        symbolTable.getRows().add(row);
        return blockIn;

    }

    @Override
    public JsxArguments visitJsxArguments(ReactParser.JsxArgumentsContext ctx) {
        JsxArguments jsxArguments = new JsxArguments();
        jsxArguments.setNode_name ("JsxArguments");
        jsxArguments.setNode_type ("JsxArguments");
        jsxArguments.setCount_child(ctx.getChildCount());
        jsxArguments.setLine_num(String.valueOf(ctx.getStart().getLine()));
        for (int i =0;i<ctx.jsxParameters().size();i++) {
            jsxArguments.getJsxParametersList().add(visitJsxParameters (ctx.jsxParameters(i)));
            jsxArguments.getChild().add(jsxArguments.getJsxParametersList().get(i));
        }
//        StRow row = new StRow();
//        row.setType(jsxArguments.getNode_type());
//        row.setName(jsxArguments.getNode_type());
//        symbolTable.getRows().add(row);
        return jsxArguments;
    }

//    @Override
//    public JsxArrowFunction visitJsxArrFunction(ReactParser.JsxArrFunctionContext ctx) {
//        if(ctx.jsxArrowFunction()!=null)
//            return ((JsxArrowFunction) visitJsxArrowFunction(ctx.jsxArrowFunction()));
//        else
//            return null;
//    }
//
//    @Override
//    public JsxCallfunction visitLabelJsxCallFunction(ReactParser.LabelJsxCallFunctionContext ctx) {
//        if(ctx.jsxCallfunction()!=null)
//            return ((JsxCallfunction) visitJsxCallfunction(ctx.jsxCallfunction()));
//        else
//            return null;
//    }
//
//    @Override
//    public JsxArgument visitJsxArg(ReactParser.JsxArgContext ctx) {
//        if(ctx.jsxArgument()!=null)
//            return ((JsxArgument) visitJsxArgument(ctx.jsxArgument()));
//        else
//            return null;
//    }
//
//    @Override
//    public JsxCallIdentifier visitJsxCallId(ReactParser.JsxCallIdContext ctx) {
//        if(ctx.jsxCallIdentifier()!=null)
//            return ((JsxCallIdentifier) visitJsxCallIdentifier(ctx.jsxCallIdentifier()));
//        else
//            return null;
//    }
//
//    @Override
//    public JsxExpression visitJsxExp(ReactParser.JsxExpContext ctx) {
//        if(ctx.jsxExpression()!=null)
//            return ((JsxExpression) visit(ctx.jsxExpression()));
//        else
//            return null;
//    }

    @Override
    public JsxArrowFunction visitJsxArrowFunction(ReactParser.JsxArrowFunctionContext ctx) {
        JsxArrowFunction jsxArrowFunction =new JsxArrowFunction ();
        jsxArrowFunction.setNode_name ("JsxArrowFunction");
        jsxArrowFunction.setNode_type ("JsxArrowFunction");
        jsxArrowFunction.setCount_child(ctx.getChildCount());
        jsxArrowFunction.setLine_num(String.valueOf(ctx.getStart().getLine()));

        if(ctx.jsxArguments () != null){
            jsxArrowFunction.setJsxArguments (visitJsxArguments (ctx.jsxArguments ()));
            jsxArrowFunction.getChild ().add (jsxArrowFunction.getJsxArguments ());
        }

        if (ctx.jsxArgument () != null){
            jsxArrowFunction.setJsxArgument (visitJsxArgument (ctx.jsxArgument ()));
            jsxArrowFunction.getChild ().add (jsxArrowFunction.getJsxArgument ());
        }

        if (ctx.OpenBraceIn ()!=null){
            scopes.add (new Scope (scopes.size (),scopes.getgId ()));
        }
        for ( int i =0 ;i<ctx.jsxExpression ().size ();i++){
            jsxArrowFunction.getJsxExpressionList ().add ((JsxExpression) visit (ctx.jsxExpression ().get (i)));
            jsxArrowFunction.getChild ().add (jsxArrowFunction.getJsxExpressionList ().get (i));
        }
        if (ctx.CloseBraceIn ()!=null){
            scopes.pop ();
        }

        return jsxArrowFunction;
    }

    @Override
    public JsxCallfunction visitJsxCallfunction(ReactParser.JsxCallfunctionContext ctx) {
        JsxCallfunction jsxCallfunction =new JsxCallfunction ();
        jsxCallfunction.setNode_name ("JsxCallfunction");

        jsxCallfunction.setNode_type ("JsxCallfunction");
        jsxCallfunction.setCount_child(ctx.getChildCount());
        jsxCallfunction.setLine_num(String.valueOf(ctx.getStart().getLine()));
        //jsxCallfunction.setNode_name (ctx.jsxSimpleCallfunction (ctx.jsxSimpleCallfunction ().size ()-1).IDENTIFIERIn ().getText ());

        for ( int i =0 ;i<ctx.jsxSimpleCallfunction ().size ();i++){
            jsxCallfunction.getJsxSimpleCallfunctionList ().add (visitJsxSimpleCallfunction (ctx.jsxSimpleCallfunction ().get (i)));
            jsxCallfunction.getChild ().add (jsxCallfunction.getJsxSimpleCallfunctionList ().get (i));
        }
        for ( int i =0 ;i<ctx.id ().size ();i++){
            jsxCallfunction.getIdList ().add (visitId (ctx.id ().get (i)));
            jsxCallfunction.getChild ().add (jsxCallfunction.getIdList ().get (i));
        }


        return jsxCallfunction;
    }


    @Override
    public JsxSimpleCallfunction visitJsxSimpleCallfunction(ReactParser.JsxSimpleCallfunctionContext ctx) {

        JsxSimpleCallfunction jsxSimpleCallfunction = new JsxSimpleCallfunction ();
        jsxSimpleCallfunction.setNode_type ("JsxSimpleCallfunction");
        jsxSimpleCallfunction.setCount_child(ctx.getChildCount());
        jsxSimpleCallfunction.setLine_num(String.valueOf(ctx.getStart().getLine()));
        //jsxSimpleCallfunction.setNode_name (ctx.id ().getText ());
        if (ctx.id () !=null){
            Id id = new Id ();
            id.setId (ctx.id().getText ());
            jsxSimpleCallfunction.setId (id);
            jsxSimpleCallfunction.setNode_name(ctx.id().getText());
            //jsxSimpleCallfunction.setId ((Id) visitId (ctx.id ()));
            jsxSimpleCallfunction.getChild ().add (jsxSimpleCallfunction.getId ());
        }
        if (ctx.jsxArguments () !=null){
          jsxSimpleCallfunction.setJsxArguments (visitJsxArguments (ctx.jsxArguments ()));
          jsxSimpleCallfunction.getChild ().add (jsxSimpleCallfunction.getJsxArguments ());
        }

        StRow row = new StRow();
        row.setType(jsxSimpleCallfunction.getNode_type());
        row.setName(jsxSimpleCallfunction.getNode_type());
        row.setScope (scopes);
        symbolTable.getRows().add(row);
        return jsxSimpleCallfunction;
    }

    @Override
    public JsxArgument visitJsxArgument(ReactParser.JsxArgumentContext ctx) {
        JsxArgument jsxArgument =new JsxArgument ();

        jsxArgument.setNode_name ("Jsx Argument");
        jsxArgument.setNode_type ("Jsx Argument");
        jsxArgument.setCount_child(ctx.getChildCount());
        jsxArgument.setLine_num(String.valueOf(ctx.getStart().getLine()));
        StRow row = new StRow();

        if (ctx.id () !=null){
            jsxArgument.setId (visitId (ctx.id ()));
            jsxArgument.getChild ().add (jsxArgument.getId ());
        }

        if (ctx.jsxExpression () !=null){
            jsxArgument.setJsxExpression ((JsxExpression) visit (ctx.jsxExpression ()));
            jsxArgument.getChild ().add (jsxArgument.getJsxExpression ());
        }

        if (ctx.jsxArrowFunction () !=null){
            jsxArgument.setJsxArrowFunction (visitJsxArrowFunction (ctx.jsxArrowFunction ()));
            jsxArgument.getChild ().add (jsxArgument.getJsxArrowFunction ());
        }


        row.setType(jsxArgument.getNode_type());
        row.setName(jsxArgument.getId ().getId ());
        row.setAssigned (true);
        row.setValue ("value");
        row.setScope (scopes);
        //symbolTable.getRows().add(row);
        return jsxArgument;
    }
    @Override
    public JsxExpression visitJsxExpression(ReactParser.JsxExpressionContext ctx){
        JsxExpression jsxExpression = new JsxExpression ();
        jsxExpression.setNode_type ("JsxExpression");
        jsxExpression.setCount_child(ctx.getChildCount());
        jsxExpression.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.MultiplyIn () !=null){
            Stringg stringg = new Stringg();
            stringg.setNode_type("Operation");
            stringg.setString (ctx.MultiplyIn ().getText ());
            stringg.setNode_name (ctx.MultiplyIn ().getText ());
            jsxExpression.setOperation (ctx.MultiplyIn ().getText ());
            jsxExpression.getChild ().add (stringg);
        }
        if(ctx.OpenParenIn ()!=null)
            jsxExpression.setParen ("(");

        if (ctx.DivideIn () !=null){
            jsxExpression.setOperation (ctx.DivideIn ().getText ());
            Stringg stringg = new Stringg();
            stringg.setNode_type("Operation");
            stringg.setString (ctx.DivideIn ().getText ());
            stringg.setNode_name (ctx.DivideIn ().getText ());
            jsxExpression.getChild ().add (stringg);
        }
        if (ctx.PlusIn () !=null){
            jsxExpression.setOperation (ctx.PlusIn ().getText ());
            Stringg stringg = new Stringg();
            stringg.setNode_type("Operation");
            stringg.setString (ctx.PlusIn ().getText ());
            stringg.setNode_name (ctx.PlusIn ().getText ());
            jsxExpression.getChild ().add (stringg);
        }
        if (ctx.MinusIn () !=null){
            jsxExpression.setOperation (ctx.MinusIn ().getText ());
            Stringg stringg = new Stringg();
            stringg.setNode_type("Operation");
            stringg.setString (ctx.MinusIn ().getText ());
            stringg.setNode_name (ctx.MinusIn ().getText ());
            jsxExpression.getChild ().add (stringg);
        }
        if (ctx.NUMBERIn () !=null){
            Number number = new Number();
            number.setNode_type("Number");
            if (ctx.NUMBERIn () != null) {
                number.setValue(Integer.parseInt(ctx.NUMBERIn ().getText()));
                number.setNode_name(ctx.NUMBERIn ().getText());
                jsxExpression.getChild ().add (jsxExpression.getNumber ());
            }
        }
        if (ctx.StringIn () !=null){
            Stringg stringg = new Stringg();
            stringg.setNode_type("string");
            stringg.setNode_name (ctx.StringIn ().getText ());
            stringg.setCount_child(ctx.getChildCount());
            stringg.setLine_num(String.valueOf(ctx.getStart().getLine()));
            if (ctx.StringIn () != null) {
                stringg.setString( ctx.StringIn ().getText());
                stringg.setNode_name(ctx.StringIn ().getText());
                jsxExpression.getChild ().add (jsxExpression.getStringg ());
            }
        }
        if (ctx.BooleanLiteralIn () !=null){
            Bool bool = new Bool();
            bool.setNode_type("Boolean");
            if (ctx.BooleanLiteralIn () != null) {
                bool.setBool(ctx.BooleanLiteralIn ().getText());
                bool.setNode_name(ctx.BooleanLiteralIn ().getText());
                jsxExpression.getChild ().add (jsxExpression.getBooll ());
            }
        }
        if (ctx.id () !=null){
            jsxExpression.setId (visitId (ctx.id ()));
            jsxExpression.getChild ().add (jsxExpression.getIdd ());
        }
        for ( int i =0 ;i<ctx.jsxExpression ().size ();i++){
            jsxExpression.getJsxExpressionList ().add (visitJsxExpression (ctx.jsxExpression ().get (i)));
            jsxExpression.getChild ().add (jsxExpression.getJsxExpressionList ().get (i));
        }
        return jsxExpression;

    }

    @Override
    public JsxCallIdentifier visitJsxCallIdentifier(ReactParser.JsxCallIdentifierContext ctx) {
        JsxCallIdentifier  jsxCallIdentifier = new JsxCallIdentifier ();
        jsxCallIdentifier.setNode_type ("JsxCallIdentifier");
        jsxCallIdentifier.setCount_child(ctx.getChildCount());
        jsxCallIdentifier.setLine_num(String.valueOf(ctx.getStart().getLine()));
        for ( int i =0 ;i<ctx.id ().size ();i++){
            jsxCallIdentifier.getIdList ().add (visitId (ctx.id ().get (i)));
            jsxCallIdentifier.getChild ().add (jsxCallIdentifier.getIdList ().get (i));
        }
        return jsxCallIdentifier;
    }

    @Override
    public JsxBlock visitJsxBlock(ReactParser.JsxBlockContext ctx) {
        JsxBlock jsxBlock =new JsxBlock ();
        jsxBlock.setNode_type ("Block");
        jsxBlock.setCount_child(ctx.getChildCount());
        jsxBlock.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.jsxElement () !=null){
            jsxBlock.setJsxElement (visitJsxElement (ctx.jsxElement ()));
            jsxBlock.getChild ().add (jsxBlock.getJsxElement ());
        }
        return jsxBlock;
    }

    @Override
    public Block visitBlock(ReactParser.BlockContext ctx) {
        Block block = new Block ();
        block.setNode_type ("Block");
        block.setCount_child(ctx.getChildCount());
        block.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.OpenBrace ()!=null){
            scopes.add (new Scope (scopes.size (),scopes.getgId ()));
        }
        for ( int i =0 ;i<ctx.statment ().size ();i++){
            block.getStatementList ().add (visitStatment (ctx.statment ().get (i)));
            block.getChild ().add (block.getStatementList ().get (i));
        }
        if (ctx.CloseBrace ()!=null){
            scopes.pop ();
        }
        return block;
    }

    @Override
    public Else_if visitElse_if(ReactParser.Else_ifContext ctx) {
        Else_if else_if = new Else_if ();
        else_if.setNode_type ("Else_if");
        else_if.setCount_child(ctx.getChildCount());
        else_if.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.conditions () !=null){
            else_if.setCondition (visitConditions (ctx.conditions ()));
            else_if.getChild ().add (else_if.getCondition ());
        }
        if (ctx.block () !=null){
            else_if.setBlock (visitBlock (ctx.block ()));
            else_if.getChild ().add (else_if.getBlock ());
        }
        if (ctx.statment () !=null){
            else_if.setStatement (visitStatment (ctx.statment ()));
            else_if.getChild ().add (else_if.getStatement ());
        }
        return else_if;
    }

    @Override
    public Else visitElse(ReactParser.ElseContext ctx) {
        Else elsee = new Else ();
        elsee.setNode_type ("Else");
        elsee.setCount_child(ctx.getChildCount());
        elsee.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.block () !=null){
            elsee.setBlock (visitBlock (ctx.block ()));
            elsee.getChild ().add (elsee.getBlock ());
        }
        if (ctx.statment () !=null){
            elsee.setStatement (visitStatment (ctx.statment ()));
            elsee.getChild ().add (elsee.getStatement ());
        }
        return elsee;
    }

    @Override
    public ForLoopParts visitForLoopParts(ReactParser.ForLoopPartsContext ctx) {
        ForLoopParts forLoopParts = new ForLoopParts ();
        forLoopParts.setNode_type ("ForLoopParts");
        forLoopParts.setCount_child(ctx.getChildCount());
        forLoopParts.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.kind () !=null){
            forLoopParts.setKind (visitKind (ctx.kind ()));
            forLoopParts.getChild ().add (forLoopParts.getKind ());
        }
        if (ctx.conditions () !=null){
            forLoopParts.setCondition (visitConditions (ctx.conditions ()));
            forLoopParts.getChild ().add (forLoopParts.getCondition ());
        }
        if (ctx.callIdentifier () !=null){
            forLoopParts.setCallIdentifier (visitCallIdentifier (ctx.callIdentifier ()));
            forLoopParts.getChild ().add (forLoopParts.getCallIdentifier ());
        }
        for ( int i =0 ;i<ctx.variableDeclaration ().size ();i++){
            forLoopParts.getVariableDeclarationList ().add ((VariableDeclaration) visitVariableDeclaration (ctx.variableDeclaration ().get (i)));
            forLoopParts.getChild ().add (forLoopParts.getVariableDeclarationList ().get (i));
        }
        for ( int i =0 ;i<ctx.id ().size ();i++){
            forLoopParts.getIdList ().add (visitId (ctx.id ().get (i)));
            forLoopParts.getChild ().add (forLoopParts.getIdList ().get (i));
        }
        if (ctx.PlusPlus ()!=null){
            forLoopParts.setOp (ctx.PlusPlus ().getText ());
        }
        if (ctx.MinusMinus ()!=null){
            forLoopParts.setOp (ctx.MinusMinus ().getText ());
        }
        return forLoopParts;
    }

    @Override
    public Condition visitConditions(ReactParser.ConditionsContext ctx) {
        Condition condition = new Condition ();
        condition.setNode_type ("Conditions");
        condition.setCount_child(ctx.getChildCount());
        condition.setLine_num(String.valueOf(ctx.getStart().getLine()));
        for ( int i =0 ;i<ctx.data ().size ();i++){
            condition.getDataList ().add ((Data) visit (ctx.data ().get (i)));
            condition.getChild ().add (condition.getDataList ().get (i));
        }
        for ( int i =0 ;i<ctx.Not ().size ();i++){
            Stringg stringg = new Stringg ();
            stringg.setString (condition.getNotList ().get (i));
            stringg.setNode_name ("!");
            stringg.setNode_type ("Not");
            condition.getNotList ().add (ctx.Not ().toString ());
            condition.getChild ().add (stringg);
        }
        if (ctx.operation () !=null){
            condition.setOperation (visitOperation (ctx.operation ()));
            condition.getChild ().add (condition.getOperation ());
        }
        if (ctx.BooleanLiteral () !=null){
            Bool bool = new Bool ();
            bool.setBool (condition.getBool ());
            bool.setNode_name (condition.getBool ());
            bool.setNode_type ("Bool");
            condition.setBool (ctx.BooleanLiteral ().getText ());
            condition.getChild ().add (bool);
        }
        if (ctx.id () !=null){
            condition.setId (visitId (ctx.id ()));
            condition.getChild ().add (condition.getId ());
        }
        return condition;
    }

    @Override
    public Arguments visitArguments(ReactParser.ArgumentsContext ctx) {
        Arguments arguments = new Arguments ();
        arguments.setNode_type ("Arguments");
        arguments.setCount_child(ctx.getChildCount());
        arguments.setLine_num(String.valueOf(ctx.getStart().getLine()));

        for ( int i =0 ;i< ctx.parameters ().size ();i++){
            arguments.getParametersList ().add ((Parameters) visit (ctx.parameters ().get (i)));
            arguments.getChild ().add (arguments.getParametersList ().get (i));
        }
        return arguments;
    }

    @Override
    public BlockOfarguments visitBlockOfarguments(ReactParser.BlockOfargumentsContext ctx) {
        BlockOfarguments blockOfarguments = new BlockOfarguments ();
        blockOfarguments.setNode_type ("BlockOfarguments");
        blockOfarguments.setCount_child(ctx.getChildCount());
        blockOfarguments.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.OpenBrace ()!=null){
            scopes.add (new Scope (scopes.size (),scopes.getgId ()));
        }
        if (ctx.arguments () !=null){
            blockOfarguments.setArguments (visitArguments (ctx.arguments ()));
            blockOfarguments.getChild ().add (blockOfarguments.getArguments ());
        }
        if (ctx.CloseBrace ()!=null){
            scopes.pop ();
        }
        return blockOfarguments;
    }

    @Override
    public Object visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx) {
        StRow row = new StRow();
        VariableDeclaration variableDeclaration = new VariableDeclaration ();
        variableDeclaration.setNode_type ("VariableDeclaration");
        variableDeclaration.setCount_child(ctx.getChildCount());
        variableDeclaration.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.kind () !=null){
            variableDeclaration.setKind (visitKind (ctx.kind ()));
            variableDeclaration.getChild ().add (variableDeclaration.getKind ());
        }
        if (ctx.id () !=null){
            Id id = new Id();
            if (ctx.id ().IDENTIFIER () != null) {
                id.setId(ctx.id ().IDENTIFIER ().getText());
                id.setNode_name(ctx.id ().IDENTIFIER ().getText());
            }
            else if (ctx.id ().Id() != null) {
                id.setId(ctx.id ().Id().getText());
                id.setNode_name(ctx.id ().Id().getText());
            }
            else if (ctx.id ().IDENTIFIERIn () != null) {
                id.setId(ctx.id ().IDENTIFIERIn ().getText());
                id.setNode_name(ctx.id ().IDENTIFIERIn ().getText());
            }
            variableDeclaration.setId (id);
            variableDeclaration.getChild ().add (variableDeclaration.getId ());

        }

        if (ctx.expression () !=null){
            variableDeclaration.setExpression ((Expression) visit (ctx.expression ()));
            variableDeclaration.getChild ().add (variableDeclaration.getExpression ());
            row.setValue ("Expression");
        }
        if (ctx.callfunction () !=null){
            variableDeclaration.setCallFunction (visitCallfunction (ctx.callfunction ()));
            variableDeclaration.getChild ().add (variableDeclaration.getCallFunction ());
            row.setValue ("Call Function");
        }
        if (ctx.callIdentifier () !=null){
            variableDeclaration.setCallIdentifier (visitCallIdentifier (ctx.callIdentifier ()));
            variableDeclaration.getChild ().add (variableDeclaration.getCallIdentifier ());
            row.setValue ("Call Identifier");
        }
        if (ctx.arrowFunction () !=null){
            variableDeclaration.setArrowFunction (visitArrowFunction (ctx.arrowFunction ()));
            variableDeclaration.getChild ().add (variableDeclaration.getArrowFunction ());
            row.setValue ("Arrow Function");
        }


        row.setType(variableDeclaration.getNode_type());
        if(ctx.kind ()!=null)
        row.setKind (String.valueOf (variableDeclaration.getKind ().getType ()));
        row.setName (variableDeclaration.getId ().getId ());
        if (ctx.Assign ()!= null)
            row.setAssigned (true);
        row.setScope (scopes);
        symbolTable.getRows().add(row);
        return variableDeclaration;
    }

    @Override
    public VariableDeclarationList visitVariableDeclarationList(ReactParser.VariableDeclarationListContext ctx) {
        VariableDeclarationList variableDeclarationList =new VariableDeclarationList ();
        variableDeclarationList.setNode_type ("VariableDeclarationList");
        variableDeclarationList.setCount_child(ctx.getChildCount());
        variableDeclarationList.setLine_num(String.valueOf(ctx.getStart().getLine()));
        for ( int i =0 ;i<ctx.variableDeclaration ().size ();i++){
            variableDeclarationList.getVariableDeclarationList ().add ((VariableDeclaration) visitVariableDeclaration (ctx.variableDeclaration ().get (i)));
            variableDeclarationList.getChild ().add (variableDeclarationList.getVariableDeclarationList ().get (i));
        }
        return variableDeclarationList;
    }

    @Override
    public ArrowFunction visitArrowFunction(ReactParser.ArrowFunctionContext ctx) {
        ArrowFunction arrowFunction =new ArrowFunction ();
        arrowFunction.setNode_type ("ArrowFunction");
        arrowFunction.setCount_child(ctx.getChildCount());
        arrowFunction.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.Async () !=null){
            Stringg stringg = new Stringg ();
            stringg.setString (arrowFunction.getAsync ());
            stringg.setNode_name ("async");
            stringg.setNode_type ("async");
            arrowFunction.setAsync (ctx.Async ().getText ());
            arrowFunction.getChild ().add (stringg);
        }
        if (ctx.arguments () !=null){
            arrowFunction.setArguments (visitArguments (ctx.arguments ()));
            arrowFunction.getChild ().add (arrowFunction.getArguments ());
        }
        if (ctx.id () !=null){
            arrowFunction.setId (visitId (ctx.id ()));
            arrowFunction.getChild ().add (arrowFunction.getId ());
        }
        if (ctx.expression () !=null){
            arrowFunction.setExperssion ((Expression) visit (ctx.expression ()));
            arrowFunction.getChild ().add (arrowFunction.getExperssion ());
        }
        if (ctx.openBrace ()!=null){
            scopes.add (new Scope (scopes.size (),scopes.getgId ()));
        }
        for ( int i =0 ;i<ctx.statment ().size ();i++){
            arrowFunction.getStatementList ().add (visitStatment (ctx.statment ().get (i)));
            arrowFunction.getChild ().add (arrowFunction.getStatementList ().get (i));
        }
        if (ctx.closeBrace ()!=null){
            scopes.pop ();
        }
        if (ctx.returnstatment () !=null){
            arrowFunction.setReturnstatment (visitReturnstatment (ctx.returnstatment ()));
            arrowFunction.getChild ().add (arrowFunction.getReturnstatment ());
        }
        if (ctx.jsxElement () !=null){
            arrowFunction.setJsxElement (visitJsxElement (ctx.jsxElement ()));
            arrowFunction.getChild ().add (arrowFunction.getJsxElement ());
        }
        return arrowFunction;
    }

    @Override
    public Returnstatment visitReturnstatment(ReactParser.ReturnstatmentContext ctx) {
        Returnstatment returnstatment =new Returnstatment ();
        returnstatment.setNode_type ("Returnstatment");
        returnstatment.setCount_child(ctx.getChildCount());
        returnstatment.setLine_num(String.valueOf(ctx.getStart().getLine()));

        if (ctx.jsxBlock () !=null){
            returnstatment.setJsxBlock (visitJsxBlock (ctx.jsxBlock ()));
            returnstatment.getChild ().add (returnstatment.getJsxBlock ());
        }
        if (ctx.expression () !=null){
            returnstatment.setExperssion ((Expression) visit (ctx.expression ()));
            returnstatment.getChild ().add (returnstatment.getExperssion ());
        }
        return returnstatment;
    }

    @Override
    public SimpleCallfunction visitSimpleCallfunction(ReactParser.SimpleCallfunctionContext ctx) {

        SimpleCallfunction SimpleCallfunction = new SimpleCallfunction ();
        SimpleCallfunction.setNode_type ("SimpleCallfunction");
        SimpleCallfunction.setNode_name (ctx.id ().getText ());
        SimpleCallfunction.setCount_child(ctx.getChildCount());
        SimpleCallfunction.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.id () !=null){
            SimpleCallfunction.setId (visitId (ctx.id ()));
            SimpleCallfunction.getChild ().add (SimpleCallfunction.getId ());
        }
        if (ctx.arguments () !=null){
            SimpleCallfunction.setArguments (visitArguments (ctx.arguments ()));
            SimpleCallfunction.getChild ().add (SimpleCallfunction.getArguments ());
        }

        StRow row = new StRow();
        row.setType(SimpleCallfunction.getNode_type());
        row.setName(SimpleCallfunction.getNode_name ());
        row.setScope (scopes);
        symbolTable.getRows().add(row);
        return SimpleCallfunction;
    }

    @Override
    public Argument visitArgument(ReactParser.ArgumentContext ctx) {
        Argument argument = new Argument ();
        argument.setNode_type ("Argument");
        argument.setCount_child(ctx.getChildCount());
        argument.setLine_num(String.valueOf(ctx.getStart().getLine()));
      //  argument.setNode_name ();

        if (ctx.callIdentifier () !=null){
            argument.setCallIdentifier (visitCallIdentifier (ctx.callIdentifier ()));
            argument.getChild ().add (argument.getCallIdentifier ());
        }
        if (ctx.expression () !=null){
            argument.setExperssion ((Expression) visit (ctx.expression ()));
            argument.getChild ().add (argument.getExperssion ());
        }
        if (ctx.arrowFunction () !=null){
            argument.setArrowFunction (visitArrowFunction (ctx.arrowFunction ()));
            argument.getChild ().add (argument.getArrowFunction ());

        }

        return argument;
    }

//    @Override
//    public ArrowFunction visitLabel_ArrowFunction(ReactParser.Label_ArrowFunctionContext ctx) {
//
//        return (ArrowFunction) visitArrowFunction(ctx.arrowFunction()) ;
//    }
//
//    @Override
//    public CallIdentifier visitLabel_CallIdentifier(ReactParser.Label_CallIdentifierContext ctx) {
//        return (visitCallIdentifier(ctx.callIdentifier()));
//    }
//
//    @Override
//    public Argument visitLable_Argument(ReactParser.Lable_ArgumentContext ctx) { ArrowFunction arrowFunction = new ArrowFunction();
//        return ((Argument)visitArgument(ctx.argument()));
//
//    }
//
//    @Override
//    public CallFunction visitLabel_Callfunction(ReactParser.Label_CallfunctionContext ctx) {
//        return ((CallFunction)visitCallfunction(ctx.callfunction()));
//    }
//
//    @Override
//    public Expression visitLabel_Expression(ReactParser.Label_ExpressionContext ctx) {
//        return ((Expression) visit(ctx.expression()));
//
//    }
//
//    @Override
//    public NullLiteral visitLabel_NullLiteral(ReactParser.Label_NullLiteralContext ctx) {
//        NullLiteral nullLiteral =new NullLiteral();
//        nullLiteral.setNode_type("NullLiteral");
//        if (ctx.NullLiteral() != null) {
//            nullLiteral.setN(ctx.NullLiteral().getText());
//        }
//        if (ctx.NullLiteralModeCall() != null) {
//            nullLiteral.setN(ctx.NullLiteralModeCall().getText());
//        }
//        return nullLiteral;
//        }
//
//
//
//    @Override
//    public BlockOfarguments visitLabel_BlockOfarguments(ReactParser.Label_BlockOfargumentsContext ctx) {
//        return ((BlockOfarguments)visitBlockOfarguments(ctx.blockOfarguments()));    }

    @Override
    public CallIdentifier visitCallIdentifier(ReactParser.CallIdentifierContext ctx) {
        CallIdentifier callIdentifier = new CallIdentifier();
        callIdentifier.setNode_type("callIdentifier");
        callIdentifier.setCount_child(ctx.getChildCount());
        callIdentifier.setLine_num(String.valueOf(ctx.getStart().getLine()));
        for (int i = 0; i < ctx.id().size(); i++) {
            callIdentifier.getIds().add(visitId(ctx.id().get(i)));
            callIdentifier.getChild().add(callIdentifier.getIds().get(i));
        }
        return callIdentifier;
    }

    @Override
    public Parameters visitParameters(ReactParser.ParametersContext ctx){
        Parameters parameters = new Parameters();
        parameters.setNode_type("Parameters");
        parameters.setCount_child(ctx.getChildCount());
        parameters.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if(ctx.arrowFunction()!=null){
            parameters.setArrowFunction(visitArrowFunction(ctx.arrowFunction()));
            parameters.getChild().add(parameters.getArrowFunction());
        }
        if(ctx.callIdentifier()!=null){
            parameters.setCallIdentifier(visitCallIdentifier(ctx.callIdentifier()));
            parameters.getChild().add(parameters.getCallIdentifier());
        }
        if(ctx.argument()!=null){
            parameters.setArgument(visitArgument(ctx.argument()));
            parameters.getChild().add(parameters.getArgument());
        }
        if(ctx.callfunction()!=null){
            parameters.setCallFunction(visitCallfunction(ctx.callfunction()));
            parameters.getChild().add(parameters.getCallFunction());
        }
        if(ctx.expression()!=null){
            parameters.setExpression(visitExpression(ctx.expression()));
            parameters.getChild().add(parameters.getExpression());
        }
        if(ctx.blockOfarguments()!=null){
            parameters.setBlockOfarguments(visitBlockOfarguments(ctx.blockOfarguments()));
            parameters.getChild().add(parameters.getBlockOfarguments());
        }
        return parameters;
    }

    @Override
    public Expression visitExpression(ReactParser.ExpressionContext ctx){
        Expression expression = new Expression();
        expression.setNode_type ("Expression");
        expression.setNode_name ("Expression");
        expression.setCount_child(ctx.getChildCount());
        expression.setLine_num(String.valueOf(ctx.getStart().getLine()));


        for(int i=0;i<ctx.expression().size();i++){
            expression.getExpressionList().add(visitExpression(ctx.expression(i)));
            expression.getChild().add(expression.getExpressionList().get(i));
        }
        if(ctx.Multiply()!=null){
            expression.setOperator(ctx.Multiply().getText());
            Stringg stringg = new Stringg();
            stringg.setNode_type("Multiply");
            stringg.setString(ctx.Multiply().getText());
            expression.getChild().add(stringg);
        }
        if(ctx.MultiplyModeCall()!=null){
            expression.setOperator(ctx.MultiplyModeCall().getText());
            Stringg stringg = new Stringg();
            stringg.setNode_type("MultiplyModeCall");
            stringg.setString(ctx.MultiplyModeCall().getText());
            expression.getChild().add(stringg);
        }
        if(ctx.Divide()!=null){
            expression.setOperator(ctx.Divide().getText());
            Stringg stringg = new Stringg();
            stringg.setNode_type("Divide");
            stringg.setString(ctx.Divide().getText());
            expression.getChild().add(stringg);
        }
        if(ctx.DivideModeCall()!=null){
            expression.setOperator(ctx.DivideModeCall().getText());
            Stringg stringg = new Stringg();
            stringg.setNode_type("DivideModeCall");
            stringg.setString(ctx.MultiplyModeCall().getText());
            expression.getChild().add(stringg);
        }
        if(ctx.Plus()!=null){
            expression.setOperator(ctx.Plus().getText());
            Stringg stringg = new Stringg();
            stringg.setNode_type("Plus");
            stringg.setString(ctx.Plus().getText());
            expression.getChild().add(stringg);
        }
        if(ctx.PlusModeCall()!=null){
            expression.setOperator(ctx.PlusModeCall().getText());
            Stringg stringg = new Stringg();
            stringg.setNode_type("PlusModeCall");
            stringg.setString(ctx.PlusModeCall().getText());
            expression.getChild().add(stringg);
        }
        if(ctx.Minus()!=null){
            expression.setOperator(ctx.Minus().getText());
            Stringg stringg = new Stringg();
            stringg.setNode_type("Minus");
            stringg.setString(ctx.Minus().getText());
            expression.getChild().add(stringg);
        }
        if(ctx.MinusModeCall()!=null){
            expression.setOperator(ctx.MinusModeCall().getText());
            Stringg stringg = new Stringg();
            stringg.setNode_type("MinusModeCall");
            stringg.setString(ctx.MinusModeCall().getText());
            expression.getChild().add(stringg);
        }
        if(ctx.callIdentifier()!=null){
        expression.setCallIdentifier(visitCallIdentifier(ctx.callIdentifier()));
        expression.getChild().add(expression.getCallIdentifier());
        }
        if(ctx.MinusMinus()!=null){
            expression.setOperator(ctx.MinusMinus().getText());
            Stringg stringg = new Stringg();
            stringg.setNode_type("MinusMinus");
            stringg.setString(ctx.MinusMinus().getText());
            expression.getChild().add(stringg);
        }
        if(ctx.PlusPlus()!=null){
            expression.setOperator(ctx.PlusPlus().getText());
            Stringg stringg = new Stringg();
            stringg.setNode_type("PlusPlus");
            stringg.setString(ctx.PlusPlus().getText());
            expression.getChild().add(stringg);
        }
        if(ctx.data()!=null){
            Data data = visitData(ctx.data());
            expression.setData(data);
            expression.getChild().add(expression.getData());
            expression.setStRow (data.getStRow ());
        }
        return expression;
    }


//    @Override
//    public Label_shortExpressions visitShortExpression(ReactParser.ShortExpressionContext ctx) {
//        Label_shortExpressions label_shortExpressions =new Label_shortExpressions();
//        label_shortExpressions.setNode_type("label_shortExpressions");
//        label_shortExpressions.setCallIdentifier((CallIdentifier)( visitCallIdentifier (ctx.callIdentifier())));
//        if(ctx.PlusPlus() !=null){
//            label_shortExpressions.setOperation(ctx.PlusPlus().getText());
//        }
//        else if(ctx.MinusMinus() !=null){
//            label_shortExpressions.setOperation(ctx.MinusMinus().getText());
//        }
//        return label_shortExpressions;
//    }
//
//    @Override
//    public Data visitLabel_dataExpression(ReactParser.Label_dataExpressionContext ctx) {
//            return ((Data) visit (ctx.data()));
//    }
//
//    @Override
//    public Label_normalExpressions visitLabel_normalExpression(ReactParser.Label_normalExpressionContext ctx) {
//        Label_normalExpressions label_normalExpressions =new Label_normalExpressions();
//        label_normalExpressions.setNode_type("Label_normalExpressions");
//         for(int i=0 ; i<ctx.expression().size(); i++){
//                label_normalExpressions.getExpressions().add((Expression) visit (ctx.expression(i)));
//            }
//            if(ctx.Multiply() !=null){
//                label_normalExpressions.setOperation(ctx.Multiply().getText());
//            }
//           else if(ctx.MinusModeCall() !=null){
//            label_normalExpressions.setOperation(ctx.MinusModeCall().getText());
//        }
//        return label_normalExpressions;
//    }

    @Override
    public Export visitExport(ReactParser.ExportContext ctx) {
        Export export = new Export();
        export.setNode_type("Expert");
        export.setCount_child(ctx.getChildCount());
        export.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.Export() != null) {
            export.setEap(ctx.Export().getText());
        }
        if (ctx.Default() != null) {

            export.setDef(ctx.Default().getText());
        }
        if (ctx.callIdentifier() != null) {

            export.setCallIdentifier ( visitCallIdentifier(ctx.callIdentifier()));


        }
        return export;
    }

    @Override
    public Data visitData(ReactParser.DataContext ctx) {
        Data data = new Data ();

        data.setNode_name ("Data");
        data.setNode_type ("data");
        data.setCount_child(ctx.getChildCount());
        data.setLine_num(String.valueOf(ctx.getStart().getLine()));
        StRow row = new StRow();

        if (ctx.array () != null) {
           data.setArray (visitArray (ctx.array ()));
        }
        if (ctx.NUMBER () != null) {
            Number number = new Number ();
            number.setNode_type ("Number");
            number.setNode_name (ctx.NUMBER ().getText ());
            number.setCount_child(ctx.getChildCount());
            number.setLine_num(String.valueOf(ctx.getStart().getLine()));
            number.setValue (Integer.parseInt (ctx.NUMBER ().getText ()));
            data.setNumber (number);
            row.setValue (ctx.NUMBER ().getText ());
            data.setStRow (row);
        }
        if (ctx.NUMBERModeCall () != null) {
            Number number = new Number ();
            number.setNode_type ("Number");
            number.setNode_name (ctx.NUMBERModeCall ().getText ());
            number.setCount_child(ctx.getChildCount());
            number.setLine_num(String.valueOf(ctx.getStart().getLine()));
            number.setValue (Integer.parseInt (ctx.NUMBERModeCall ().getText ()));
            row.setValue (ctx.NUMBERModeCall ().getText ());
            data.setNumber (number);
        }
        if (ctx.String () != null) {
            Stringg stringg = new Stringg ();
            stringg.setNode_type ("String");
            stringg.setNode_name (ctx.String ().getText ());
            stringg.setCount_child(ctx.getChildCount());
            stringg.setLine_num(String.valueOf(ctx.getStart().getLine()));
            stringg.setString (ctx.String ().getText ());
            data.setStringg (stringg);
            row.setValue (ctx.String ().getText ());
            data.setStRow (row);

        }
        if (ctx.StringModeCall () != null) {
            Stringg stringg = new Stringg ();
            stringg.setNode_type ("String");
            stringg.setNode_name (ctx.StringModeCall ().getText ());
            stringg.setCount_child(ctx.getChildCount());
            stringg.setLine_num(String.valueOf(ctx.getStart().getLine()));
            stringg.setString (ctx.StringModeCall ().getText());
            data.setStringg (stringg);
            row.setValue (ctx.StringModeCall ().getText ());
            data.setStRow (row);
        }
        if (ctx.id () != null) {
            data.setId (visitId (ctx.id ()));
        }
        if (ctx.map () != null) {
            data.setMap (visitMap (ctx.map ()));
        }
        if (ctx.BooleanLiteral () != null) {
            Bool bool = new Bool ();
            bool.setNode_type ("Bool");
            bool.setNode_name (ctx.BooleanLiteral ().getText ());
            bool.setCount_child(ctx.getChildCount());
            bool.setLine_num(String.valueOf(ctx.getStart().getLine()));
            bool.setBool (ctx.BooleanLiteral ().getText ());
            data.setBool (bool);
            row.setValue (ctx.BooleanLiteral ().getText ());

        }
        if (ctx.BooleanLiteralModeCall () != null) {
            Bool bool = new Bool ();
            bool.setNode_type ("Bool");
            bool.setNode_name (ctx.BooleanLiteralModeCall ().getText ());
            bool.setCount_child(ctx.getChildCount());
            bool.setLine_num(String.valueOf(ctx.getStart().getLine()));
            bool.setBool (ctx.BooleanLiteralModeCall ().getText ());
            data.setBool (bool);
            row.setValue (ctx.BooleanLiteralModeCall ().getText ());
        }

        return data;
    }
//    @Override
//    public Array visitLabel_Array(ReactParser.Label_ArrayContext ctx) {
//        return (Array) visitArray(ctx.array());
//    }
//
//    @Override
//    public Number visitLabel_Number(ReactParser.Label_NumberContext ctx) {
//        Number number = new Number();
//        number.setNode_type("Number");
//        if (ctx.NUMBER() != null) {
//            number.setValue(Integer.parseInt(ctx.NUMBER().getText()));
//            number.setNode_name(ctx.NUMBER().getText());
//
//        }
//        else if (ctx.NUMBERModeCall() != null) {
//            number.setValue(Integer.parseInt(ctx.NUMBERModeCall().getText()));
//            number.setNode_name(ctx.NUMBERModeCall().getText());
//        }
//        return number;
//    }
//
//    @Override
//    public Stringg visitLabel_String(ReactParser.Label_StringContext ctx) {
//        Stringg stringg = new Stringg();
//        stringg.setNode_type("string");
//        if (ctx.String() != null) {
//            stringg.setString( ctx.String().getText());
//            stringg.setNode_name(ctx.String().getText());
//
//        }
//        else if (ctx.StringModeCall() != null) {
//            stringg.setString( ctx.StringModeCall().getText());
//            stringg.setNode_name(ctx.StringModeCall().getText());
//        }
//        return stringg;
//    }
//
//    @Override
//    public Id visitLabel_Id(ReactParser.Label_IdContext ctx) {
//        return (Id) visitId(ctx.id());
//    }
//
//    @Override
//    public Map visitLabel_Map(ReactParser.Label_MapContext ctx) {
//        return (Map) visitMap(ctx.map());
//    }
//
//    @Override
//    public Bool visitLabel_Bool(ReactParser.Label_BoolContext ctx) {
//        Bool bool = new Bool();
//        bool.setNode_type("Boolean");
//        if (ctx.BooleanLiteral() != null) {
//            bool.setBool(ctx.BooleanLiteral().getText());
//            bool.setNode_name(ctx.BooleanLiteral().getText());
//
//        }
//        else if (ctx.BooleanLiteralModeCall() != null) {
//            bool.setBool( ctx.BooleanLiteralModeCall().getText());
//            bool.setNode_name(ctx.BooleanLiteralModeCall().getText());
//        }
//        return bool;
//    }

    @Override
    public Array visitArray(ReactParser.ArrayContext ctx) {
        Array array = new Array();
        array.setNode_name ("Array");
        array.setNode_type ("Array");
        array.setCount_child(ctx.getChildCount());
        array.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if(ctx.suquence()!= null){
            array.setSequence(visitSuquence(ctx.suquence()));
            array.getChild ().add (array.getSequence ());
        }
        return array;
    }

    @Override
    public Map visitMap(ReactParser.MapContext ctx) {
        Map map = new Map();
        map.setNode_type("map");
        map.setCount_child(ctx.getChildCount());
        map.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.OpenBrace ()!=null){
            scopes.add (new Scope (scopes.size (),scopes.getgId ()));
        }
        for(int i=0 ; i<ctx.mapElementList().size(); i++){
            map.getMapElementLists().add(visitMapElementList(ctx.mapElementList(i)));
            map.getChild ().add (map.getMapElementLists ().get (i));
        }
        if (ctx.CloseBrace ()!=null){
            scopes.pop ();
        }
        return map;
    }

    @Override
    public MapElementList visitMapElementList(ReactParser.MapElementListContext ctx) {
        MapElementList mapElementList = new MapElementList();
        mapElementList.setNode_type("MapElementList");
        mapElementList.setCount_child(ctx.getChildCount());
        mapElementList.setLine_num(String.valueOf(ctx.getStart().getLine()));
        for(int i=0 ; i<ctx.mapElement().size(); i++){
            mapElementList.getMapElement().add(visitMapElement(ctx.mapElement(i)));
            mapElementList.getChild ().add (mapElementList.getMapElement ().get (i));
        }
        return  mapElementList;
    }

    @Override
    public MapElement visitMapElement(ReactParser.MapElementContext ctx) {
        MapElement mapElement = new MapElement();
        Expression expression=null;

        mapElement.setNode_type("mapElement");
        mapElement.setCount_child(ctx.getChildCount());
        mapElement.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if( ctx.expression() != null){
            expression = visitExpression (ctx.expression());
            mapElement.setExpressions(expression);
            mapElement.getChild ().add (mapElement.getExpressions ());
        }

        StRow row ;
        if (expression!=null)
            row = expression.getStRow ();
        else
            row = new StRow ();

        if(ctx.IDENTIFIER() != null){
            Id id =new Id ();
            id.setId (ctx.IDENTIFIER().getText ());
            mapElement.setIdentifier(id);
            mapElement.getChild ().add (mapElement.getIdentifier ());
            row.setName (mapElement.getIdentifier ().getId ());
        }
        if(ctx.callfunction() != null){
            mapElement.setCallFunction(visitCallfunction(ctx.callfunction()));
            mapElement.getChild ().add (mapElement.getCallIdentifier ());
        }
        else if(ctx.callIdentifier() != null){
            mapElement.setCallIdentifier(visitCallIdentifier(ctx.callIdentifier()));
            mapElement.getChild ().add (mapElement.getCallIdentifier ());
        }

        row.setType(mapElement.getNode_type ());
        row.setAssigned (true);
        row.setScope (scopes);
        symbolTable.getRows().add(row);
        return mapElement;
    }

    @Override
    public Sequence visitSuquence(ReactParser.SuquenceContext ctx) {
        Sequence sequence = new Sequence();
        sequence.setNode_type("Sequence");
        sequence.setCount_child(ctx.getChildCount());
        sequence.setLine_num(String.valueOf(ctx.getStart().getLine()));
        for(int i=0; i<ctx.data().size(); i++){
            sequence.getListData().add(visitData (ctx.data(i)));
            sequence.getChild ().add (sequence.getListData ().get (i));
        }
        return sequence;
    }

    @Override
    public Kind visitKind(ReactParser.KindContext ctx) {
        Kind kind = new Kind();
        kind.setNode_type("Kind");
        kind.setCount_child(ctx.getChildCount());
        kind.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.Const() != null) {
            kind.setType(ctx.Const().getText());
            kind.setNode_name (ctx.Const().getText());
        }
        else if (ctx.Let() != null) {
            kind.setType(ctx.Let().getText());
            kind.setNode_name (ctx.Let ().getText());
        }
        else if (ctx.Var() != null) {
            kind.setType(ctx.Var().getText());
            kind.setNode_name (ctx.Var ().getText());
        }
        return kind;

    }

    @Override
    public Operation visitOperation(ReactParser.OperationContext ctx) {
        Operation operation = new Operation();
        operation.setNode_type("operation");
        operation.setCount_child(ctx.getChildCount());
        operation.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.LessThan() != null) {
            operation.setOperation(ctx.LessThan().getText());
            operation.setNode_name (ctx.LessThan().getText());
        }
        else if (ctx.LessThanModeCall() != null) {
            operation.setOperation(ctx.LessThanModeCall().getText());
            operation.setNode_name (ctx.LessThanModeCall ().getText());
        }
        else if (ctx.MoreThan() != null) {
            operation.setOperation(ctx.MoreThan().getText());
            operation.setNode_name (ctx.MoreThan().getText());
        }
        else if (ctx.MoreThanModeCall() != null) {
            operation.setOperation(ctx.MoreThanModeCall().getText());
            operation.setNode_name (ctx.MoreThanModeCall ().getText());
        }
        else if (ctx.Equals_() != null) {
            operation.setOperation(ctx.Equals_().getText());
            operation.setNode_name (ctx.Equals_ ().getText());
        }
        else if (ctx.Equals_ModeCall() != null) {
            operation.setOperation(ctx.Equals_ModeCall().getText());
            operation.setNode_name (ctx.Equals_ModeCall ().getText());
        }
        else if (ctx.GreaterThanEquals() != null) {
            operation.setOperation(ctx.GreaterThanEquals().getText());
            operation.setNode_name (ctx.GreaterThanEquals ().getText());
        }
        else if (ctx.GreaterThanEqualsModeCall() != null) {
            operation.setOperation(ctx.GreaterThanEqualsModeCall().getText());
            operation.setNode_name (ctx.GreaterThanEqualsModeCall ().getText());
        }
        else if (ctx.LessThanEquals() != null) {
            operation.setOperation(ctx.LessThanEquals().getText());
            operation.setNode_name (ctx.LessThanEquals ().getText());
        }
        else if (ctx.LessThanEqualsModeCall() != null) {
            operation.setOperation(ctx.LessThanEqualsModeCall().getText());
            operation.setNode_name (ctx.LessThanEqualsModeCall ().getText());
        }
        else if (ctx.NotEquals() != null) {
            operation.setOperation(ctx.NotEquals().getText());
            operation.setNode_name (ctx.NotEquals ().getText());
        }
        else if (ctx.NotEqualsModeCall() != null) {
            operation.setOperation(ctx.NotEqualsModeCall().getText());
            operation.setNode_name (ctx.NotEqualsModeCall ().getText());
        }
        else if (ctx.IdentityEquals() != null) {
            operation.setOperation(ctx.IdentityEquals().getText());
            operation.setNode_name (ctx.IdentityEquals ().getText());
        }
        else if (ctx.IdentityEqualsModeCall() != null) {
            operation.setOperation(ctx.IdentityEqualsModeCall().getText());
            operation.setNode_name (ctx.IdentityEqualsModeCall ().getText());
        }
        else if (ctx.IdentityNotEquals() != null) {
            operation.setOperation(ctx.IdentityNotEquals().getText());
            operation.setNode_name (ctx.IdentityNotEquals ().getText());
        }
        else if (ctx.IdentityNotEqualsModeCall() != null) {
            operation.setOperation(ctx.IdentityNotEqualsModeCall().getText());
            operation.setNode_name (ctx.IdentityNotEqualsModeCall ().getText());
        }
        return operation;
    }

    @Override
    public Id visitId(ReactParser.IdContext ctx) {
        Id id = new Id();
        id.setNode_type("id");
        id.setCount_child(ctx.getChildCount());
        id.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.IDENTIFIER() != null) {
            id.setId(ctx.IDENTIFIER().getText());
            id.setNode_name(ctx.IDENTIFIER().getText());
        }
        else if (ctx.Id() != null) {
            id.setId(ctx.Id().getText());
            id.setNode_name(ctx.Id().getText());
        }
        else if (ctx.IDENTIFIERIn () != null) {
            id.setId(ctx.IDENTIFIERIn ().getText());
           // System.out.println ("vvvvvvvvvvvvvvvvvv");
            System.out.println (ctx.IDENTIFIERIn ().getText());
            id.setNode_name(ctx.IDENTIFIERIn ().getText());
        }
//        StRow row = new StRow();
//        row.setType(id.getNode_type());
//        row.setName (id.getNode_name ());
//        row.setScope (scopes);
//        symbolTable.getRows().add(row);
        return id;

    }

    @Override
    public Hooks visitHooks(ReactParser.HooksContext ctx) {
        Hooks hooks = new Hooks ();
        hooks.setNode_type("hooks");
        hooks.setCount_child(ctx.getChildCount());
        hooks.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.useState () !=null){
            hooks.setUseState (visitUseState (ctx.useState ()));
            hooks.getChild().add(hooks.getUseState ());
        }
        else if (ctx.useEffect () !=null){
            hooks.setUseEffect (visitUseEffect (ctx.useEffect ()));
            hooks.getChild().add(hooks.getUseEffect ());
        }
        else if (ctx.useRef () !=null){
            hooks.setUseRef ((UseRef) visitUseRef (ctx.useRef ()));
            hooks.getChild().add(hooks.getUseRef ());
        }
        else if (ctx.useMemo () !=null){
            hooks.setUseMemo ((UseMemo) visitUseMemo (ctx.useMemo ()));
            hooks.getChild().add(hooks.getUseMemo ());
        }


        return hooks;
    }

    @Override
    public Hook visitHook(ReactParser.HookContext ctx) {
        Hook hook = new Hook ();
        hook.setNode_type("hook");
        hook.setCount_child(ctx.getChildCount());
        hook.setLine_num(String.valueOf(ctx.getStart().getLine()));
        StRow row = new StRow();
        row.setType("Import");

        if (ctx.UseState () !=null){
            hook.setHook (ctx.UseState ().getText ());
            hook.setNode_name(ctx.UseState().getText());

        }
        else  if (ctx.UseEffect () !=null){
            hook.setHook (ctx.UseEffect ().getText ());
            hook.setNode_name(ctx.UseEffect().getText());
        }
        else  if (ctx.UseRef () !=null){
            hook.setHook (ctx.UseRef ().getText ());
            hook.setNode_name(ctx.UseRef().getText());
        }
        else  if (ctx.UseMemo () !=null){
            hook.setHook (ctx.UseMemo ().getText ());
            hook.setNode_name(ctx.UseMemo().getText());
        }
        row.setName (hook.getHook ());

        symbolTable.getRows().add(row);
        return hook;
    }

    @Override
    public UseState visitUseState(ReactParser.UseStateContext ctx) {
        UseState useState = new UseState ();
        useState.setNode_type("useState");
        useState.setCount_child(ctx.getChildCount());
        useState.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.kind ()!=null){
            useState.setKind (visitKind (ctx.kind ()));
            useState.getChild().add(useState.getKind());
        }
        if (ctx.NullLiteral ()!=null){
            NullLiteral nullLiteral = new NullLiteral ();
            useState.setNullLiteral (nullLiteral);
            useState.getChild().add(useState.getNullLiteral ());
        }
        for (int i = 0; i < ctx.id ().size (); i++) {
            useState.getIds().add(( visitId(ctx.id ().get (i))));
            useState.getChild().add(useState.getIds().get(i));
        }
        return useState;
    }

    @Override
    public UseEffect visitUseEffect(ReactParser.UseEffectContext ctx) {
        UseEffect useEffect = new UseEffect ();
        useEffect.setNode_type("useEffect");
        useEffect.setCount_child(ctx.getChildCount());
        useEffect.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if(ctx.arrowFunction ()!= null){
            useEffect.setArrowFunction (visitArrowFunction (ctx.arrowFunction ()));
            useEffect.getChild().add(useEffect.getArrowFunction ());
        }
        if(ctx.array ()!= null){
            useEffect.setArray (visitArray (ctx.array ()));
            useEffect.getChild().add(useEffect.getArray ());
        }
        return useEffect;
    }

    @Override
    public Object visitUseRef(ReactParser.UseRefContext ctx) {
        UseRef useRef = new UseRef ();
        useRef.setNode_type("useRef");
        useRef.setCount_child(ctx.getChildCount());
        useRef.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.kind ()!=null){
            useRef.setKind (visitKind (ctx.kind ()));
            useRef.getChild().add(useRef.getKind());
        }
        if (ctx.NullLiteral ()!=null){
            NullLiteral nullLiteral = new NullLiteral ();
            useRef.setNullLiteral (nullLiteral);
            useRef.getChild().add(useRef.getNullLiteral ());
        }
        for (int i = 0; i < ctx.id ().size (); i++) {
            useRef.getIds().add(( visitId(ctx.id ().get (i))));
            useRef.getChild().add(useRef.getIds().get(i));
        }
        return useRef;
    }

    @Override
    public Object visitUseMemo(ReactParser.UseMemoContext ctx) {
        UseMemo useMemo = new UseMemo ();
        useMemo.setNode_type("useMemo");
        useMemo.setCount_child(ctx.getChildCount());
        useMemo.setLine_num(String.valueOf(ctx.getStart().getLine()));
        if (ctx.kind ()!=null){
            useMemo.setKind (visitKind (ctx.kind ()));
            useMemo.getChild().add(useMemo.getKind());
        }
        if (ctx.id ()!=null){
            useMemo.setId (visitId (ctx.id ()));
            useMemo.getChild().add(useMemo.getId());
        }
        if(ctx.arrowFunction ()!= null){
            useMemo.setArrowFunction (visitArrowFunction (ctx.arrowFunction ()));
            useMemo.getChild().add(useMemo.getArrowFunction ());
        }
        return useMemo;
    }

    @Override
    public OpenParen visitOpenParen(ReactParser.OpenParenContext ctx) {
        OpenParen openParen = new OpenParen();
        if (ctx.OpenParen() != null) {
            openParen.setOpenParen(ctx.OpenParen().getText());
        }
        else if (ctx.OpenParenModeCall() != null) {
            openParen.setOpenParen(ctx.OpenParen().getText());
        }

        return openParen;
    }

    @Override
    public CloseParen visitCloseParen(ReactParser.CloseParenContext ctx) {
        CloseParen closeParen = new CloseParen();
        if (ctx.CloseParen() != null) {
            closeParen.setCloseParen(ctx.CloseParen().getText());
        }
        else if (ctx.CloseParenModeCall() != null) {
            closeParen.setCloseParen(ctx.CloseParenModeCall().getText());
        }

        return closeParen;
    }

    @Override
    public Assign visitAssign(ReactParser.AssignContext ctx) {
        Assign assign = new Assign();

        if (ctx.Assign() != null) {
            assign.setAssign(ctx.Assign().getText());
            assign.setNode_name (ctx.Assign().getText());
        }
        else if (ctx.AssignModeCall() != null) {
            assign.setAssign(ctx.AssignModeCall().getText());
            assign.setNode_name (ctx.AssignModeCall ().getText());
        }

        return assign;
    }

    @Override
    public CloseBrace visitCloseBrace(ReactParser.CloseBraceContext ctx) {
        CloseBrace closeBrace = new CloseBrace();
        if (ctx.CloseBrace() != null) {
            closeBrace.setCloseBrace(ctx.CloseBrace().getText());
        }
        else if (ctx.CloseBraceModeCall() != null) {
            closeBrace.setCloseBrace(ctx.CloseBraceModeCall().getText());
        }
        return closeBrace;
    }

    @Override
    public OpenBrace visitOpenBrace(ReactParser.OpenBraceContext ctx) {
        OpenBrace openBrace = new OpenBrace();
        if (ctx.OpenBrace() != null) {
            openBrace.setOpenBrace(ctx.OpenBrace().getText());
        }
        else if (ctx.OpenBraceModeCall() != null) {
            openBrace.setOpenBrace(ctx.OpenBrace().getText());
        }

        return openBrace;
    }

    @Override
    public Jsx_tag visitJsx_tag(ReactParser.Jsx_tagContext ctx) {
        Jsx_tag jsx_tag = new Jsx_tag();
        if (ctx.JSX_TAG() != null) {
            jsx_tag.setJsx(ctx.JSX_TAG().getText());
        }
        else if (ctx.JSX_TAGIn() != null) {
            jsx_tag.setJsx(ctx.JSX_TAGIn().getText());
        }
        else if (ctx.JSX_TAGInIn() != null) {
            jsx_tag.setJsx(ctx.JSX_TAGInIn().getText());
        }

        return jsx_tag;
    }


    @Override
    public Break visitBreak(ReactParser.BreakContext ctx) {
        Break b = new Break();
        if (ctx.Break() != null) {
            b.setB(ctx.Break().getText());
        }
        return b;

    }


//    @Override
//    public Object visit(ParseTree parseTree) {
//        return null;
//    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
