package ast.Models;

public class While extends Node {
    Condition condition;
    Block block;
    Statement statement;

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

    // New generateCode method
    public String generateCode() {
        StringBuilder content = new StringBuilder();

        content.append("while (");
        if (condition != null) {
            content.append(condition.generateCode()); // Append the condition's generated code
        }
        content.append(") ");

        if (block != null) {
            content.append(block.generateCode()); // Append the block's generated code if it exists
        } else if (statement != null) {
            content.append(statement.generateCode()); // Append the statement's generated code if no block is present
        }

        return content.toString();
    }
}
