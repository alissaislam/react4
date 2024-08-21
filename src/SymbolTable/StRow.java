package SymbolTable;
import SymbolTable.Scope;

import java.util.Stack;

public class StRow {
     String type,name,value,line_number, kind = "*";

    public String getLine_number() {
        return line_number;
    }

    public void setLine_number(String line_number) {
        this.line_number = line_number;
    }

    boolean Assigned =false;
    Scope scope = new Scope ();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(CustomStack scopes) {
        this.scope.setLevel (scopes.size ());
        if(scopes.empty ()){
            this.scope.setId (0);
        }
        else {
            this.scope.setId (scopes.peek ().getId ());
        }
        this.scope.setgId (scopes.gId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public boolean isAssigned() {
        return Assigned;
    }

    public void setAssigned(boolean assigned) {
        Assigned = assigned;
    }
}
