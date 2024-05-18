package ast.Models;

public  class JsxParameters extends Node{

    JsxArrowFunction jsxArrowFunction;
    JsxCallfunction jsxCallfunction;
    JsxArgument jsxArgument;
    JsxCallIdentifier jsxCallIdentifier;
    JsxExpression jsxExpression;

    public JsxArrowFunction getJsxArrowFunction() {
        return jsxArrowFunction;
    }

    public void setJsxArrowFunction(JsxArrowFunction jsxArrowFunction) {
        this.jsxArrowFunction = jsxArrowFunction;
    }

    public JsxCallfunction getJsxCallfunction() {
        return jsxCallfunction;
    }

    public void setJsxCallfunction(JsxCallfunction jsxCallfunction) {
        this.jsxCallfunction = jsxCallfunction;
    }

    public JsxArgument getJsxArgument() {
        return jsxArgument;
    }

    public void setJsxArgument(JsxArgument jsxArgument) {
        this.jsxArgument = jsxArgument;
    }

    public JsxCallIdentifier getJsxCallIdentifier() {
        return jsxCallIdentifier;
    }

    public void setJsxCallIdentifier(JsxCallIdentifier jsxCallIdentifier) {
        this.jsxCallIdentifier = jsxCallIdentifier;
    }

    public JsxExpression getJsxExpression() {
        return jsxExpression;
    }

    public void setJsxExpression(JsxExpression jsxExpression) {
        this.jsxExpression = jsxExpression;
    }
}
