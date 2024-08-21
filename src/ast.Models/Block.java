package ast.Models;

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
        StringBuilder content = new StringBuilder();
        content.append("{");
        if ( !statementList.isEmpty ()) {
            for (Statement statement: statementList)
            content.append(statement.generateCode());
        }
        content.append("}");

        return content.toString();
    }

}
