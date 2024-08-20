package ast.Models.ast.Models;

import ast.Models.JsxElement;
import ast.Models.Node;

public class JsxBlock extends Node {

JsxElement jsxElement;

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }
}
