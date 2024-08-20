package ast.Models;

public class CloseBrace extends Node{
    String closeBrace;

    public String getCloseBrace() {
        return closeBrace;
    }

    public void setCloseBrace(String closeBrace) {
        this.closeBrace = closeBrace;
    }
    public String generateCode(){
        return closeBrace ;
    }
}
