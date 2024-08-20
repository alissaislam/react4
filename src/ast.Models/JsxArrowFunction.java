package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class JsxArrowFunction extends JsxParameters{
 JsxArguments jsxArguments;
 JsxArgument jsxArgument;
 List<JsxExpression> jsxExpressionList= new ArrayList<> ();

    public JsxArguments getJsxArguments() {
        return jsxArguments;
    }

    public void setJsxArguments(JsxArguments jsxArguments) {
        this.jsxArguments = jsxArguments;
    }

    public JsxArgument getJsxArgument() {
        return jsxArgument;
    }

    public void setJsxArgument(JsxArgument jsxArgument) {
        this.jsxArgument = jsxArgument;
    }

    public List<JsxExpression> getJsxExpressionList() {
        return jsxExpressionList;
    }

    public void setJsxExpressionList(List<JsxExpression> jsxExpressionList) {
        this.jsxExpressionList = jsxExpressionList;
    }
}
