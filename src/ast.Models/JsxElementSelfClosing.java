package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class JsxElementSelfClosing extends Node {
    // Existing fields
    String jsxTag;
    List<Attribute> attributes = new ArrayList<>();

    // Existing getters and setters
    public String getJsxTag() {
        return jsxTag;
    }

    public void setJsxTag(String jsxTag) {
        this.jsxTag = jsxTag;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    // New method to generate the code for the self-closing JSX element
    public String generateCode() {
        StringBuilder code = new StringBuilder();

        // Start the tag with '<' and the jsxTag
        code.append(jsxTag.charAt (0)+" "+jsxTag.substring (1));

        // Add attributes, if any
        for (Attribute attribute : attributes) {
            code.append(" ").append(attribute.getId().generateCode()).append("=");
            if (attribute.getStringg() != null) {
                code.append("\"").append(attribute.getStringg().getString()).append("\"");
            } else if (attribute.getBlockIn() != null) {
                // Assuming BlockIn or other types should be converted to a string representation
                code.append(attribute.getBlockIn().generateCode());
            }
        }

        // End the tag with '/>'
        code.append(" />");

        return code.toString();
    }
}
