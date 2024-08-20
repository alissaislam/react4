package ast.Models;

public class Argument extends Parameters{

    CallIdentifier callIdentifier;
    Expression experssion;
    ArrowFunction arrowFunction;

    public CallIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    public Expression getExperssion() {
        return experssion;
    }

    public void setExperssion(Expression experssion) {
        this.experssion = experssion;
    }

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }
}
