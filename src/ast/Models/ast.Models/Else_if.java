package ast.Models.ast.Models;

import ast.Models.Block;
import ast.Models.Condition;
import ast.Models.Node;
import ast.Models.Statement;

public class Else_if extends Node {
    Condition condition;
    ast.Models.Block block ;
    Statement statement;


    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

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
    public String generateCode() {return "";}


}
