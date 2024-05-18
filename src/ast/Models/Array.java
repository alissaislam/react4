package ast.Models;

public class Array extends  Data{
    Sequence sequence;

    public Sequence getSequence() {
        return sequence;
    }

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }
}