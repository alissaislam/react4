package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class JsxElementNonSelfClosing extends Node {
    String jsxTag;
    List<Id> ids = new ArrayList<>();
    List<BlockIn> blocks= new ArrayList<>();
    List<String> strings = new ArrayList<>();
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

    public List<Id> getIds() {
        return ids;
    }

    public void setIds(List<Id> ids) {
        this.ids = ids;
    }

    public List<BlockIn> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<BlockIn> blocks) {
        this.blocks = blocks;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
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
