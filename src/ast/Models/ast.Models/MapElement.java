package ast.Models.ast.Models;

import ast.Models.CallFunction;
import ast.Models.CallIdentifier;
import ast.Models.Expression;
import ast.Models.Id;
import ast.Models.Node;

public class MapElement extends Node {
    CallFunction callFunction;
    CallIdentifier callIdentifier;
    ast.Models.Expression expressions;
    ast.Models.Id Identifier;

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

    public ast.Models.Expression getExpressions() {
        return expressions;
    }

    public void setExpressions(Expression expressions) {
        this.expressions = expressions;
    }

    public ast.Models.Id getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(Id identifier) {
        Identifier = identifier;
    }

    public String generateCode() {
        StringBuilder content = new StringBuilder();
        if (Identifier != null) {
            content.append(Identifier.getId());
        }
        content.append(" : ");
        if (callFunction != null) {
            content.append(callFunction.generateCode());
        } else if (callIdentifier != null) {
            content.append(callIdentifier.generateCode());
        } else if (expressions != null) {
            content.append(expressions.generateCode());
        }
        return content.toString();
    }
}
