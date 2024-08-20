package ast.Models.ast.Models;

import ast.Models.Node;

public class Assign  extends Node {
    String assign;



    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }
    public String generateCode(){
        return assign;
    }
}
