package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class TryCatch extends Node{
    List<Block> blocks = new ArrayList<>();
    List<Id> ids = new ArrayList<>();

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    public List<Id> getIds() {
        return ids;
    }

    public void setIds(List<Id> ids) {
        this.ids = ids;
    }
}
