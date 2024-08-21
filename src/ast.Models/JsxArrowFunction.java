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
    public String generateCode() {
        StringBuilder content = new StringBuilder();

        if (jsxArguments != null) {
            content.append("(");
            content.append(jsxArguments.generateCode());
            content.append(")");
        }

        if (jsxArgument != null) {
            content.append(jsxArgument.generateCode()); // Append arguments if they exist
        }
        content.append("=>");

        if(jsxExpressionList.size ()==1){
            content.append(jsxExpressionList.get (0).generateCode());
        }else if(!jsxExpressionList.isEmpty ()){
            content.append("{");
            for(JsxExpression jsxExpression1: jsxExpressionList){
                content.append(jsxExpression1.generateCode());
            }
            content.append("}");
        }

        return content.toString();
    }
}
