package SymbolTable;
import SymbolTable.Scope;

import java.util.Stack;

public class StRow {
    String type,name,value;
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

    public void setScope(Stack<Scope> scopes) {
        this.scope.setLevel (scopes.size ());
        if(scopes.empty ()){
            this.scope.setId (0);
        }
        else {
            this.scope.setId (scopes.peek ().getId ());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
