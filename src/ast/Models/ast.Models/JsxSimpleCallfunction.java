package ast.Models.ast.Models;

import ast.Models.Id;
import ast.Models.JsxArguments;
import ast.Models.Node;

public class JsxSimpleCallfunction extends Node {
    ast.Models.Id id;
    ast.Models.JsxArguments jsxArguments;

    public ast.Models.Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public ast.Models.JsxArguments getJsxArguments() {
        return jsxArguments;
    }

    public void setJsxArguments(JsxArguments jsxArguments) {
        this.jsxArguments = jsxArguments;
    }
}
