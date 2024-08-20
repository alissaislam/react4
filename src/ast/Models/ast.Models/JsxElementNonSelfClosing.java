package ast.Models.ast.Models;

import ast.Models.Attribute;
import ast.Models.BlockOfarguments;
import ast.Models.IfShort;
import ast.Models.JsxElementIn;
import ast.Models.Node;

import java.util.ArrayList;
import java.util.List;

public class JsxElementNonSelfClosing extends Node {
    // Existing fields
    String jsxTag;
    List<ast.Models.Attribute> attributes = new ArrayList<>();
    List<ast.Models.IfShort> ifShorts = new ArrayList<>();
    List<String> letterrs = new ArrayList<>();
    List<ast.Models.JsxElementIn> jsxElementIns = new ArrayList<>();
    List<ast.Models.BlockOfarguments> blockOfarguments = new ArrayList<>();

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

    public List<ast.Models.IfShort> getIfShorts() {
        return ifShorts;
    }

    public void setIfShorts(List<ast.Models.IfShort> ifShorts) {
        this.ifShorts = ifShorts;
    }

    public List<String> getLetterrs() {
        return letterrs;
    }

    public void setLetterrs(List<String> letterrs) {
        this.letterrs = letterrs;
    }

    public List<ast.Models.JsxElementIn> getJsxElementIns() {
        return jsxElementIns;
    }

    public void setJsxElementIns(List<ast.Models.JsxElementIn> jsxElementIns) {
        this.jsxElementIns = jsxElementIns;
    }

    public List<ast.Models.BlockOfarguments> getBlockOfarguments() {
        return blockOfarguments;
    }

    public void setBlockOfarguments(List<ast.Models.BlockOfarguments> blockOfarguments) {
        this.blockOfarguments = blockOfarguments;
    }

    // New method to generate the code for the JSX element
    public String generateCode() {
        StringBuilder code = new StringBuilder();

        // Append the JSX tag
        code.append("<").append(jsxTag);

        // Append attributes
        for (Attribute attribute : attributes) {
            code.append(" ").append(attribute.generateCode());
        }

        code.append(">");

        // Append any IfShort elements
        for (IfShort ifShort : ifShorts) {
            code.append(ifShort.generateCode());
        }

        // Append any letters
        for (String letter : letterrs) {
            code.append(letter);
        }

        // Append any nested JSX elements
        for (JsxElementIn jsxElementIn : jsxElementIns) {
            code.append(jsxElementIn.generateCode());
        }

        // Append any block of arguments
        for (BlockOfarguments block : blockOfarguments) {
            code.append(block.generateCode());
        }

        // Close the JSX tag
        code.append("</").append(jsxTag).append(">");

        return code.toString();
    }
}
