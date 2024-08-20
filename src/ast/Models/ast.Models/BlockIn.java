package ast.Models.ast.Models;

import ast.Models.JsxArguments;
import ast.Models.Node;

import java.util.ArrayList;
import java.util.List;

public class BlockIn extends Node {
    // Existing field
    List<JsxArguments> jsxArgumentsList = new ArrayList<>();

    // Existing getters and setters
    public List<JsxArguments> getJsxArgumentsList() {
        return jsxArgumentsList;
    }

    public void setJsxArgumentsList(List<JsxArguments> jsxArgumentsList) {
        this.jsxArgumentsList = jsxArgumentsList;
    }

    // New method to generate the code for the blockIn
    public String generateCode() {
        StringBuilder code = new StringBuilder();

        // Open brace
        code.append("{");

        // Generate code for each jsxArgument in the list
        for (JsxArguments jsxArgument : jsxArgumentsList) {
            code.append(jsxArgument.generateCode());
        }

        // Close brace
        code.append("}");

        return code.toString();
    }
}
