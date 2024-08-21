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

    public String generateCode() {
        StringBuilder content = new StringBuilder();
        if (callIdentifier != null) {
            content.append(callIdentifier.generateCode());
        }
        if(experssion!=null||arrowFunction!=null){
            content.append (" = ");
            if (experssion != null) {
                content.append (experssion.generateCode ());
            }
            if (arrowFunction != null) {
                content.append (arrowFunction.generateCode ());
            }
        }
        return content.toString();
    }
}
