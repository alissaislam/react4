package ast.Models;

public class Statement extends Node {
    StatementElement statementElement;

    public StatementElement getStatementElement() {
        return statementElement;
    }

    public void setStatementElement(StatementElement statementElement) {
        this.statementElement = statementElement;
    }
}
