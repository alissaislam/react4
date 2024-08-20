package ast.Models.ast.Models;

import ast.Models.Arguments;
import ast.Models.Id;
import ast.Models.Node;
import ast.Models.Returnstatment;
import ast.Models.Statement;

import java.util.ArrayList;
import java.util.List;

public class Function extends Node {
    ast.Models.Id id;
    Arguments arguments;
    List<Statement> statements = new ArrayList<>();
    List<Returnstatment> returnstatments = new ArrayList<>();

    public ast.Models.Id getId() {
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

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public List<Returnstatment> getReturnstatments() {
        return returnstatments;
    }

    public void setReturnstatments(List<Returnstatment> returnstatments) {
        this.returnstatments = returnstatments;
    }

    // New generateCode method
    public String generateCode() {
        StringBuilder content = new StringBuilder();

        if (id != null) {
            content.append(id.generateCode()).append(" ");
        }
        content.append("(");
        if (arguments != null) {
            content.append(arguments.generateCode()); // Append arguments if they exist
        }
        content.append(") {");

        for (Statement statement : statements) {
            content.append(statement.generateCode()); // Append each statement's generated code
        }

        for (Returnstatment returnStatement : returnstatments) {
            content.append(returnStatement.generateCode()); // Append each return statement's generated code
        }

        content.append("}");

        return content.toString();
    }
}
