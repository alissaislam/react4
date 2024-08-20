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
}
