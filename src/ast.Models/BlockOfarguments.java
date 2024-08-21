package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class BlockOfarguments extends Node {
    Arguments arguments;

    public Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }


    public String getHtml() {
        return "";
    }

    public String generateCode() {
        StringBuilder content = new StringBuilder();
        content.append("{");
        if ( arguments!=null) {

                content.append(arguments.generateCode());
        }
        content.append("}");

        return content.toString();
    }
}
