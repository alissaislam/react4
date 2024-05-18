package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class JsxElementSelfClosing extends Node{
    String jsxTag;
    List<Id> ids;
    List<BlockIn> blocks= new ArrayList<>();
    List<String> stringsIns = new ArrayList<>();

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

    public List<String> getStringsIns() {
        return stringsIns;
    }

    public void setStringsIns(List<String> stringsIns) {
        this.stringsIns = stringsIns;
    }
}
