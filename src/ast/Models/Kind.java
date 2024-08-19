package ast.Models;

public class Kind extends Node{
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String generateCode(){
        return type;
    }
}