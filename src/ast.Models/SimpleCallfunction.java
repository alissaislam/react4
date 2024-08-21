package ast.Models;

public class SimpleCallfunction extends Node {

    Id id;
    Arguments arguments;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    public String generateCode() {
        StringBuilder content = new StringBuilder();
        if (id != null) {
            content.append(id.generateCode());
        }
        content.append("(");
        if (arguments != null) {
            content.append(arguments.generateCode());
        }
        content.append(")");
        return content.toString();
    }


}
