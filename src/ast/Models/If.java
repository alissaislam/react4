package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class If extends Node{
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
}
