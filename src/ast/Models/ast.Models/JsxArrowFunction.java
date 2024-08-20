package ast.Models.ast.Models;

import ast.Models.JsxArgument;
import ast.Models.JsxArguments;
import ast.Models.JsxExpression;
import ast.Models.JsxParameters;

import java.util.ArrayList;
import java.util.List;

public class JsxArrowFunction extends JsxParameters {
 ast.Models.JsxArguments jsxArguments;
 ast.Models.JsxArgument jsxArgument;
 List<ast.Models.JsxExpression> jsxExpressionList= new ArrayList<> ();

    public ast.Models.JsxArguments getJsxArguments() {
        return jsxArguments;
    }

    public void setJsxArguments(JsxArguments jsxArguments) {
        this.jsxArguments = jsxArguments;
    }

    public ast.Models.JsxArgument getJsxArgument() {
        return jsxArgument;
    }

    public void setJsxArgument(JsxArgument jsxArgument) {
        this.jsxArgument = jsxArgument;
    }

    public List<ast.Models.JsxExpression> getJsxExpressionList() {
        return jsxExpressionList;
    }

    public void setJsxExpressionList(List<JsxExpression> jsxExpressionList) {
        this.jsxExpressionList = jsxExpressionList;
    }
}
