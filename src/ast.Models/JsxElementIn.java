package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class JsxElementIn extends Node {
    // Existing fields
    String jsxTag;
    List<Attribute> attributes = new ArrayList<>();
    List<JsxElementIn> jsxElementIns = new ArrayList<>();
    List<String> letterrs = new ArrayList<>();
    List<BlockOfarguments> blockOfarguments = new ArrayList<>();
    JsxElementSelfClosing jsxElementSelfClosing;

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

    public List<JsxElementIn> getJsxElementIns() {
        return jsxElementIns;
    }

    public void setJsxElementIns(List<JsxElementIn> jsxElementIns) {
        this.jsxElementIns = jsxElementIns;
    }

    public List<String> getLetterrs() {
        return letterrs;
    }

    public void setLetterrs(List<String> letterrs) {
        this.letterrs = letterrs;
    }

    public List<BlockOfarguments> getBlockOfarguments() {
        return blockOfarguments;
    }

    public void setBlockOfarguments(List<BlockOfarguments> blockOfarguments) {
        this.blockOfarguments = blockOfarguments;
    }

    public JsxElementSelfClosing getJsxElementSelfClosing() {
        return jsxElementSelfClosing;
    }

    public void setJsxElementSelfClosing(JsxElementSelfClosing jsxElementSelfClosing) {
        this.jsxElementSelfClosing = jsxElementSelfClosing;
    }

    // New method to generate the code for the JSX element
    public String generateCode() {
        StringBuilder code = new StringBuilder();

        if (jsxElementSelfClosing != null) {
            // Generate code for self-closing JSX element
            code.append(jsxElementSelfClosing.generateCode());
        } else {
            // Generate code for non-self-closing JSX element
            code.append(jsxTag.charAt (0)+" "+ jsxTag.substring (1));

            // Append attributes
            for (Attribute attribute : attributes) {
                code.append(" ").append(attribute.generateCode());
            }

            code.append(">");

            // Append child elements and content
            for (JsxElementIn jsxElementIn : jsxElementIns) {
                code.append(jsxElementIn.generateCode());
            }

            for (String letter : letterrs) {
                code.append(letter);
            }

            for (BlockOfarguments block : blockOfarguments) {
                code.append(block.generateCode());
            }

            // Close the JSX tag
            code.append("</").append(jsxTag).append(">");
        }

        return code.toString();
    }
}
