package ast.Models;

public class Array extends Data {
    Sequence sequence;

    public Sequence getSequence() {
        return sequence;
    }

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    public String generateCode() {
        StringBuilder content = new StringBuilder();
        content.append("[");
        if (sequence != null) {
            content.append(sequence.generateCode()); // Append the sequence code if it exists
        }
        content.append("]"); // End with closing bracket
        return content.toString();
    }
}
