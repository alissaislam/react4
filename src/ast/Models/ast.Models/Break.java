package ast.Models.ast.Models;

import ast.Models.Node;

public class Break extends Node {
    String b;

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
    public String generateCode(){
        return b;
    }
}
