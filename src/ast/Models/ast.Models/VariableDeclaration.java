package ast.Models.ast.Models;

import ast.Models.Array;
import ast.Models.ArrowFunction;
import ast.Models.CallFunction;
import ast.Models.CallIdentifier;
import ast.Models.Expression;
import ast.Models.Id;
import ast.Models.Kind;
import ast.Models.Node;

public class VariableDeclaration extends Node {
     ast.Models.Kind kind;
     ast.Models.Id id;
     ast.Models.Array array;
     ast.Models.Expression expression;
     ast.Models.CallIdentifier callIdentifier;
     ast.Models.CallFunction callFunction;
     ast.Models.ArrowFunction arrowFunction;

    public ast.Models.Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public ast.Models.Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public ast.Models.Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public ast.Models.Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public ast.Models.CallIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    public ast.Models.CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public ast.Models.ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }
}
