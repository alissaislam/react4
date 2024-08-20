package ast.Models.ast.Models;

import ast.Models.Node;
import ast.Models.Statement;

import java.util.ArrayList;
import java.util.List;

public class Block extends Node {
    List<Statement> statementList = new ArrayList<>();

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    public String generateCode() {
        return "";
    }

}
