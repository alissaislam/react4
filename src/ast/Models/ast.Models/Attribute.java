package ast.Models.ast.Models;

import ast.Models.BlockIn;
import ast.Models.Id;
import ast.Models.Node;
import ast.Models.Stringg;

public class Attribute extends Node {
    // Existing fields
    ast.Models.Id id;
    ast.Models.BlockIn blockIn;
    ast.Models.Stringg stringg;

    // Existing getters and setters
    public ast.Models.Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public ast.Models.BlockIn getBlockIn() {
        return blockIn;
    }

    public void setBlockIn(BlockIn blockIn) {
        this.blockIn = blockIn;
    }

    public ast.Models.Stringg getStringg() {
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
            code.append(id.generateCode()); // Directly use generateCode of Id
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
