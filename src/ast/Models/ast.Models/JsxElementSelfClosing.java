package ast.Models.ast.Models;

import ast.Models.Attribute;
import ast.Models.Node;

import java.util.ArrayList;
import java.util.List;

public class JsxElementSelfClosing extends Node {
    // Existing fields
    String jsxTag;
    List<ast.Models.Attribute> attributes = new ArrayList<>();

    // Existing getters and setters
    public String getJsxTag() {
        return jsxTag;
    }

    public void setJsxTag(String jsxTag) {
        this.jsxTag = jsxTag;
    }

    public List<ast.Models.Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ast.Models.Attribute> attributes) {
        this.attributes = attributes;
    }

    // New method to generate the code for the self-closing JSX element
    public String generateCode() {
        StringBuilder code = new StringBuilder();

        // Start the tag with '<' and the jsxTag
        code.append("<").append(jsxTag);

        // Add attributes, if any
        for (Attribute attribute : attributes) {
            code.append(" ").append(attribute.getId().generateCode()).append("=");
            if (attribute.getStringg() != null) {
                code.append("\"").append(attribute.getStringg().getString()).append("\"");
            } else if (attribute.getBlockIn() != null) {
                // Assuming BlockIn or other types should be converted to a string representation
                code.append("{").append(attribute.getBlockIn().generateCode()).append("}");
            }
        }

        // End the tag with '/>'
        code.append(" />");

        return code.toString();
    }
}
