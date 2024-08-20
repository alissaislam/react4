package ast.Models.ast.Models;

import ast.Models.Arguments;
import ast.Models.Id;
import ast.Models.Node;

public class SimpleCallfunction extends Node {

    ast.Models.Id id;
    ast.Models.Arguments arguments;

    public ast.Models.Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public ast.Models.Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    public String generateCode() {
        return "";
    }


}
