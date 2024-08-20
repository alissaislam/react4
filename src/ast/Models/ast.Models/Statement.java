package ast.Models.ast.Models;

import ast.Models.Node;
import ast.Models.StatementElement;

public class Statement extends Node {
    StatementElement statementElement;

    public StatementElement getStatementElement() {
        return statementElement;
    }

    public void setStatementElement(StatementElement statementElement) {
        this.statementElement = statementElement;
    }

    public String getHTML() {
        return " ";
    }

    // New generateCode method
    public String generateCode() {
        String content = "";

        if (statementElement != null) {
            content = statementElement.generateCode(); // Assuming StatementElement also has a generateCode() method
        }

        return content;
    }
}
