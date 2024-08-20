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
}
