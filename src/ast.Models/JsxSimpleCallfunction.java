package ast.Models;

public class JsxSimpleCallfunction extends Node{
    Id id;
    JsxArguments jsxArguments;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public JsxArguments getJsxArguments() {
        return jsxArguments;
    }

    public void setJsxArguments(JsxArguments jsxArguments) {
        this.jsxArguments = jsxArguments;
    }

    public String generateCode() {
        StringBuilder content = new StringBuilder();

        if (id != null) {
            content.append(id.generateCode()).append(" ");
        }
        content.append("(");
        if (jsxArguments != null) {
            content.append(jsxArguments.generateCode()); // Append arguments if they exist
        }
        content.append(")");

        return content.toString();
    }
}
