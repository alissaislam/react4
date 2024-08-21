package ast.Models;

public class VariableDeclaration extends Node{
     Kind kind;
     Id id;
     Array array;
     Expression expression;
     CallIdentifier callIdentifier;
     CallFunction callFunction;
     ArrowFunction arrowFunction;

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public CallIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    public String generateCode() {
        StringBuilder content = new StringBuilder();

        if (kind != null) {
            content.append (kind.generateCode ());
        }
        if (id != null) {
            content.append(id.generateCode());
        }
        if (expression != null||arrowFunction != null||callFunction != null||callIdentifier != null) {
            content.append("=");
            if (expression != null) {
                content.append(expression);
            }
            if (arrowFunction != null) {
                content.append(arrowFunction.generateCode());
            }
            if (callIdentifier != null) {
                content.append(callIdentifier.generateCode());
            }
            if (callFunction != null) {
                content.append(callFunction.generateCode());
            }
        }
        return content.toString();
    }
}
