package ast.Models.ast.Models;

import ast.Models.Node;

public class CloseParen extends Node {
    String closeParen;

    public String getCloseParen() {
        return closeParen;
    }

    public void setCloseParen(String closeParen) {
        this.closeParen = closeParen;
    }
    public String generateCode(){
        return closeParen;
    }
}
