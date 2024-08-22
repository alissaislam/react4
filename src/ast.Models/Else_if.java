package ast.Models;

public class Else_if extends Node{
    Condition condition;
    Block block ;
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
    public String generateCode() {
        StringBuilder content = new StringBuilder();
        content.append("else if (");
        if (condition != null) {
            content.append(condition.generateCode());
        }
        content.append(")");
        if (block != null) {
            content.append(block.generateCode());
        }
        if (statement != null) {
            content.append(statement.generateCode());
        }
        return content.toString();
    }


}
