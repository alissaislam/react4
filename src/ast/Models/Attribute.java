package ast.Models;

public class Attribute extends  Node {
    Id id;
    BlockIn blockIn;
    Stringg stringg ;


    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public BlockIn getBlockIn() {
        return blockIn;
    }

    public void setBlockIn(BlockIn blockIn) {
        this.blockIn = blockIn;
    }

    public Stringg getStringg() {
        return stringg;
    }

    public void setStringg(Stringg stringg) {
        this.stringg = stringg;
    }
}
