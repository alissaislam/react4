package ast.Models;

public class JsxBlock extends Node{

JsxElement jsxElement;

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public String generateCode() {
        StringBuilder content = new StringBuilder();
        content.append("(");
        if (jsxElement != null) {
            content.append(jsxElement.generateCode()).append(" ");
        }
        content.append(")");

        return content.toString();
    }
}
