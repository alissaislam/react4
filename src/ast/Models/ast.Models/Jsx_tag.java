package ast.Models.ast.Models;

import ast.Models.Node;

public class Jsx_tag extends Node {
    String jsx;

    public String getJsx() {
        return jsx;
    }

    public void setJsx(String jsx) {
        this.jsx = jsx;
    }
    public String generateCode(){
        return jsx;
    }
}
