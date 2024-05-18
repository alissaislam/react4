package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class Function extends Node{
    Id id ;
    Arguments arguments ;
    List<Statement> statements = new ArrayList<>();
    List<Returnstatment> returnstatments = new ArrayList<>();

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
}
