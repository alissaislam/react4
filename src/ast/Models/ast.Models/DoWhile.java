package ast.Models.ast.Models;

import ast.Models.Block;
import ast.Models.Condition;
import ast.Models.Node;
import ast.Models.Statement;

public class DoWhile extends Node {
    ast.Models.Block block;
    Statement statement;
    Condition condition;

    public ast.Models.Block getBlock() {
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

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    // New generateCode method
    public String generateCode() {
        StringBuilder content = new StringBuilder();

        content.append("do ");

        if (block != null) {
            content.append(block.generateCode()); // Append the block's generated code if it exists
        } else if (statement != null) {
            content.append(statement.generateCode()); // Append the statement's generated code if no block is present
        }

        content.append(" while (");

        if (condition != null) {
            content.append(condition.generateCode()); // Append the condition's generated code
        }

        content.append(");");

        return content.toString();
    }
}
