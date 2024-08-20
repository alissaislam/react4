package ast.Models.ast.Models;

import ast.Models.JsxArgument;
import ast.Models.JsxArrowFunction;
import ast.Models.JsxCallIdentifier;
import ast.Models.JsxCallfunction;
import ast.Models.JsxExpression;
import ast.Models.Node;

public class JsxParameters extends Node {

    // Existing fields
    JsxArrowFunction jsxArrowFunction;
    JsxCallfunction jsxCallfunction;
    ast.Models.JsxArgument jsxArgument;
    JsxCallIdentifier jsxCallIdentifier;
    ast.Models.JsxExpression jsxExpression;

    // Existing getters and setters
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

    public ast.Models.JsxArgument getJsxArgument() {
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

    public ast.Models.JsxExpression getJsxExpression() {
        return jsxExpression;
    }

    public void setJsxExpression(JsxExpression jsxExpression) {
        this.jsxExpression = jsxExpression;
    }

    // New method to generate the code for the parameter
    public String generateCode() {
        StringBuilder code = new StringBuilder();

        // Check each type of parameter and append its code
        if (jsxArrowFunction != null) {
            code.append(jsxArrowFunction.generateCode());
        } else if (jsxCallfunction != null) {
            code.append(jsxCallfunction.generateCode());
        } else if (jsxArgument != null) {
            code.append(jsxArgument.generateCode());
        } else if (jsxCallIdentifier != null) {
            code.append(jsxCallIdentifier.generateCode());
        } else if (jsxExpression != null) {
            code.append(jsxExpression.generateCode());
        }

        return code.toString();
    }
}
