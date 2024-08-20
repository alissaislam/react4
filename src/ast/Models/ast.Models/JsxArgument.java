package ast.Models.ast.Models;

import ast.Models.Id;
import ast.Models.JsxArrowFunction;
import ast.Models.JsxExpression;
import ast.Models.JsxParameters;

public class JsxArgument extends JsxParameters {
    ast.Models.Id id ;
    JsxExpression jsxExpression;
    JsxArrowFunction jsxArrowFunction;

    public ast.Models.Id getId() {
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
