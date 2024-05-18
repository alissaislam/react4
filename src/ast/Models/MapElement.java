package ast.Models;

public class MapElement extends Node {
    CallFunction callFunction;
    CallIdentifier callIdentifier;
    Expression expressions;
    Id Identifier;

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public CallIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    public Expression getExpressions() {
        return expressions;
    }

    public void setExpressions(Expression expressions) {
        this.expressions = expressions;
    }

    public Id getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(Id identifier) {
        Identifier = identifier;
    }
}
