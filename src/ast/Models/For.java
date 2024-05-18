package ast.Models;

public class For extends Node{
    ForLoopParts forLoopParts ;
    Block block  ;
    Statement statement ;

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
}
