package ast.Models;

public class JsxElement extends Node{
    JsxElementNonSelfClosing jsxElementNonSelfClosing;
    JsxElementSelfClosing jsxElementSelfClosing;

    public JsxElementNonSelfClosing getJsxElementNonSelfClosing() {
        return jsxElementNonSelfClosing;
    }

    public void setJsxElementNonSelfClosing(JsxElementNonSelfClosing jsxElementNonSelfClosing) {
        this.jsxElementNonSelfClosing = jsxElementNonSelfClosing;
    }

    public JsxElementSelfClosing getJsxElementSelfClosing() {
        return jsxElementSelfClosing;
    }

    public void setJsxElementSelfClosing(JsxElementSelfClosing jsxElementSelfClosing) {
        this.jsxElementSelfClosing = jsxElementSelfClosing;
    }
}
