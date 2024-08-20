package ast.Models.ast.Models;

import ast.Models.Node;

public class Hook extends Node {
    String hook;

    public String getHook() {
        return hook;
    }

    public void setHook(String hook) {
        this.hook = hook;
    }

    public String generateCode() {
        return "";
    }
}
