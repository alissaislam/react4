package ast.Models.ast.Models;

import ast.Models.Node;

public class Operation extends Node {
    String operation;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    public String generateCode(){
        return operation;
    }
}