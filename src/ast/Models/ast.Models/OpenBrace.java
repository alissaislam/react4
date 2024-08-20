package ast.Models.ast.Models;

import ast.Models.Node;

public class OpenBrace extends Node {
    String openBrace;

    public String getOpenBrace() {
        return openBrace;
    }

    public void setOpenBrace(String openBrace) {
        this.openBrace = openBrace;
    }
    public String generateCode(){
        return openBrace;
    }
}
