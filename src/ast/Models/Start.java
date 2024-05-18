package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class Start extends Node{
List<Statement> statement_list = new ArrayList<>();

    public List<Statement> getStatement_list() {
        return statement_list;
    }

    public void setStatement_list(List<Statement> statement_list) {
        this.statement_list = statement_list;
    }
}
