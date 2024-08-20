package ast.Models;

public class For extends Node {
    ForLoopParts forLoopParts;
    Block block;
    Statement statement;

    public ForLoopParts getForLoopParts() {
        return forLoopParts;
    }

    public void setForLoopParts(ForLoopParts forLoopParts) {
        this.forLoopParts = forLoopParts;
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

        content.append("for (");
        if (forLoopParts != null) {
            content.append(forLoopParts.generateCode()); // Append the for loop parts
        }
        content.append(") ");

        if (block != null) {
            content.append(block.generateCode()); // Append the block code if it exists
        } else if (statement != null) {
            content.append(statement.generateCode()); // Append the statement code if the block is not present
        }

        return content.toString();
    }

}
