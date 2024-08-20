package ast.Models.ast.Models;

import ast.Models.Arguments;
import ast.Models.Node;

import java.util.ArrayList;
import java.util.List;

public class BlockOfarguments extends Node {
    ast.Models.Arguments arguments;

    public ast.Models.Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }


    public String getHtml() {
        return "";
    }

    public String generateCode() {
        return "";
    }
}
