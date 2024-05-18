package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class JsxElementIn extends Node{
    String jsxTag;
    List<Id> ids = new ArrayList<>();
    List<String> stringsIns = new ArrayList<>();
    List<BlockIn> blocks = new ArrayList<>();
    List<JsxElementIn> jsxElementIns= new ArrayList<>();
    List<String> letterrs = new ArrayList<>();
    List<BlockOfarguments> blockOfarguments = new ArrayList<>();
    JsxElementSelfClosing jsxElementSelfClosing ;

    public String getJsxTag() {
        return jsxTag;
    }

    public void setJsxTag(String jsxTag) {
        this.jsxTag = jsxTag;
    }

    public List<Id> getIds() {
        return ids;
    }

    public void setIds(List<Id> ids) {
        this.ids = ids;
    }

    public List<String> getStringsIns() {
        return stringsIns;
    }

    public void setStringsIns(List<String> stringsIns) {
        this.stringsIns = stringsIns;
    }

    public List<BlockIn> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<BlockIn> blocks) {
        this.blocks = blocks;
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
}
