package ast.Models.ast.Models;

import ast.Models.JsxElementNonSelfClosing;
import ast.Models.JsxElementSelfClosing;
import ast.Models.Node;

public class JsxElement extends Node {
    // Existing fields
    JsxElementNonSelfClosing jsxElementNonSelfClosing;
    JsxElementSelfClosing jsxElementSelfClosing;

    // Existing getters and setters
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

    // New method to generate the code for the jsxElement
    public String generateCode() {
        StringBuilder code = new StringBuilder();

        // Check if it's a non-self-closing JSX element
        if (jsxElementNonSelfClosing != null) {
            code.append(jsxElementNonSelfClosing.generateCode());
        }

        // Check if it's a self-closing JSX element
        if (jsxElementSelfClosing != null) {
            code.append(jsxElementSelfClosing.generateCode());
        }

        return code.toString();
    }
}
