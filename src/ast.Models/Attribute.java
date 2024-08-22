package ast.Models;

import java.util.Objects;

public class Attribute extends Node {
    // Existing fields
    Id id;
    BlockIn blockIn;
    Stringg stringg;

    // Existing getters and setters
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

    // Method to generate the code for the attribute
    public String generateCode() {
        StringBuilder code = new StringBuilder();

        // Start with the ID
        if (id != null) {
            if (Objects.equals (id.getId (), "className"))
                id.setId ("class");
            code.append(id.getId ()); // Directly use generateCode of Id
        }

        // Add the assignment and the value (blockIn or stringg)
        if (blockIn != null) {
            code.append("=").append(blockIn.generateCode()); // Assuming BlockIn has generateCode method
        } else if (stringg != null) {
            code.append("=").append("\"").append(stringg.getString()).append("\""); // Use getString method
        }

        return code.toString();
    }
}
