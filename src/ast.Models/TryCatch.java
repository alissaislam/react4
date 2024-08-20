package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class TryCatch extends Node {
    // Existing fields
    private List<Block> blocks = new ArrayList<>();
    private List<Id> ids = new ArrayList<>();

    // Existing getters and setters
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

    // New method to generate the code for the try-catch-finally structure
    public String generateCode() {
        StringBuilder content = new StringBuilder();

        // Start with the 'try' block
        content.append("try ");
        if (!blocks.isEmpty()) {
            content.append(blocks.get(0).generateCode()); // The first block is for 'try'
        }

        // Append the 'catch' blocks
        for (int i = 1; i < blocks.size() && i - 1 < ids.size(); i++) {
            content.append(" catch (");
            Id id = ids.get(i - 1); // Each 'catch' corresponds to an id and a block
            if (id != null) {
                content.append(id.generateCode()).append(" ");
            }
            content.append(") ");
            content.append(blocks.get(i).generateCode());
        }

        // Append the 'finally' block if it exists
        if (blocks.size() > ids.size() + 1) { // The last block is for 'finally'
            content.append(" finally ");
            content.append(blocks.get(blocks.size() - 1).generateCode());
        }

        return content.toString();
    }
}
