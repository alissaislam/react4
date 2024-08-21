package ast.Models;

public class Else extends Node{
    Block block;
    Statement statement;

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

    public String generateCode() {
        StringBuilder content = new StringBuilder();
        content.append("else");
        if (block != null) {
            content.append(block.generateCode());
        }
        if (statement != null) {
            content.append(statement.generateCode());
        }
        return content.toString();
    }

}
