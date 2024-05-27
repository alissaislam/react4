package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class JsxElementNonSelfClosing extends Node {
    String jsxTag;
    List<Attribute>  attributes = new ArrayList<>();

    List<IfShort> ifShorts = new ArrayList<>();
    List<String> letterrs = new ArrayList<>();
    List<JsxElementIn> jsxElementIns = new ArrayList<>();
    List<BlockOfarguments> blockOfarguments = new ArrayList<>();

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

    public List<IfShort> getIfShorts() {
        return ifShorts;
    }

    public void setIfShorts(List<IfShort> ifShorts) {
        this.ifShorts = ifShorts;
    }

    public List<String> getLetterrs() {
        return letterrs;
    }

    public void setLetterrs(List<String> letterrs) {
        this.letterrs = letterrs;
    }

    public List<JsxElementIn> getJsxElementIns() {
        return jsxElementIns;
    }

    public void setJsxElementIns(List<JsxElementIn> jsxElementIns) {
        this.jsxElementIns = jsxElementIns;
    }

    public List<BlockOfarguments> getBlockOfarguments() {
        return blockOfarguments;
    }

    public void setBlockOfarguments(List<BlockOfarguments> blockOfarguments) {
        this.blockOfarguments = blockOfarguments;
    }
}
