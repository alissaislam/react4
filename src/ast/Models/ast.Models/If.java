package ast.Models.ast.Models;

import ast.Models.*;

import java.util.ArrayList;
import java.util.List;

public class If extends Node {
    Condition condition;
    Block block;
    Statement statement;
    List<Else_if> elseIfList = new ArrayList<>();
    Else elseElement;

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public List<Else_if> getElseIfList() {
        return elseIfList;
    }

    public void setElseIfList(List<Else_if> elseIfList) {
        this.elseIfList = elseIfList;
    }

    public Else getElseElement() {
        return elseElement;
    }

    public void setElseElement(Else elseElement) {
        this.elseElement = elseElement;
    }

    public String getHTML() {
        return " ";
    }

    // New generateCode method
    public String generateCode() {
        StringBuilder content = new StringBuilder();

        content.append("if (");
        if (condition != null) {
            content.append(condition.generateCode()); // Append the condition code
        }
        content.append(") ");

        if (block != null) {
            content.append(block.generateCode()); // Append the block code if it exists
        } else if (statement != null) {
            content.append(statement.generateCode()); // Append the statement code if the block is not present
        }

        if (elseIfList != null && !elseIfList.isEmpty()) {
            for (Else_if elseIf : elseIfList) {
                content.append(elseIf.generateCode()); // Append each else-if block
            }
        }

        if (elseElement != null) {
            content.append(elseElement.generateCode()); // Append the else block if it exists
        }

        return content.toString();
    }
}
