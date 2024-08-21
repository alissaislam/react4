package ast.Models;

public class JsxArgument extends  JsxParameters{
    Id id ;
    JsxExpression jsxExpression;
    JsxArrowFunction jsxArrowFunction;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public JsxExpression getJsxExpression() {
        return jsxExpression;
    }

    public void setJsxExpression(JsxExpression jsxExpression) {
        this.jsxExpression = jsxExpression;
    }

    public JsxArrowFunction getJsxArrowFunction() {
        return jsxArrowFunction;
    }

    public void setJsxArrowFunction(JsxArrowFunction jsxArrowFunction) {
        this.jsxArrowFunction = jsxArrowFunction;
    }

    public String generateCode() {
        StringBuilder content = new StringBuilder();

        if (id != null) {
            content.append(id.generateCode());
        }

        if (jsxExpression != null|| jsxArrowFunction!=null) {
            content.append("=");
            if (jsxExpression != null)
            content.append(jsxExpression.generateCode()); // Append arguments if they exist
            if (jsxArrowFunction!=null){
                content.append(jsxArrowFunction.generateCode());
            }
        }

        return content.toString();
    }
}
