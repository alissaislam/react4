package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class JsxElementSelfClosing extends Node{
    String jsxTag;
    List<Attribute> attributes = new ArrayList<> ();

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
}
