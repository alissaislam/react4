package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class Import extends Node {
    // Existing fields
    List<Id> ids = new ArrayList<>();
    List<Hook> hooks = new ArrayList<>();
    String string;

    // Existing getters and setters
    public List<Hook> getHooks() {
        return hooks;
    }

    public void setHooks(List<Hook> hooks) {
        this.hooks = hooks;
    }

    public List<Id> getIds() {
        return ids;
    }

    public void setIds(List<Id> ids) {
        this.ids = ids;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    // New method to generate the code for the import statement
//    public String generateCode() {
//        StringBuilder content = new StringBuilder();
//        content.append("import ");
//
//        if (!ids.isEmpty() || !hooks.isEmpty()) {
//            // Handle the case with {id, hook, ...}
//            if (ids.size() + hooks.size() > 1) {
//                content.append("{ ");
//                for (int i = 0; i < ids.size(); i++) {
//                    content.append(ids.get(i).generateCode());
//                    if (i < ids.size() - 1 || !hooks.isEmpty()) {
//                        content.append(", ");
//                    }
//                }
//                for (int i = 0; i < hooks.size(); i++) {
//                    content.append(hooks.get(i).generateCode());
//                    if (i < hooks.size() - 1) {
//                        content.append(", ");
//                    }
//                }
//                content.append(" }");
//            } else if (!ids.isEmpty()) {
//                // Handle the single id case
//                content.append(ids.get(0).generateCode());
//            } else if (!hooks.isEmpty()) {
//                // Handle the single hook case
//                content.append(hooks.get(0).generateCode());
//            }
//        }
//
//        if (string != null) {
//            content.append(" from ").append(string);
//        }
//
//        content.append(";");
//
//        return content.toString();
//    }
}
