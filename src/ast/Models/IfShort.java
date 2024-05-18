package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class IfShort extends Node{
    CallIdentifier callIdentifier;
    Operation operation;
    Expression expression;
    List<Statement> statements=new ArrayList<> ();
    List<JsxElement> jsxElements=new ArrayList<> ();

    public CallIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public List<JsxElement> getJsxElements() {
        return jsxElements;
    }

    public void setJsxElements(List<JsxElement> jsxElements) {
        this.jsxElements = jsxElements;
    }
}
