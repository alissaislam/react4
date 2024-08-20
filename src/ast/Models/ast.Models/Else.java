package ast.Models.ast.Models;

import ast.Models.Block;
import ast.Models.Node;
import ast.Models.Statement;

public class Else extends Node {
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

    public String generateCode() {return "";}

}
