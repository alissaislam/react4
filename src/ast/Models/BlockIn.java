package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class BlockIn extends Node{
    List<JsxArguments> jsxArgumentsList = new ArrayList<>();

    public List<JsxArguments> getJsxArgumentsList() {
        return jsxArgumentsList;
    }

    public void setJsxArgumentsList(List<JsxArguments> jsxArgumentsList) {
        this.jsxArgumentsList = jsxArgumentsList;
    }
}
