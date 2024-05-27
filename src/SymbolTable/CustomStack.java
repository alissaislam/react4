package SymbolTable;

import java.util.Stack;

public class CustomStack  {

    Stack<Scope> scopes = new Stack<> ();
    int gId ;

    public CustomStack() {
        this.gId = 0;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public boolean add(Scope item) {
        if (scopes.empty ()){
            gId = gId +1;
        }
        return scopes.add (item);
    }

    public int size(){

        return scopes.size ();
    }

    public Scope pop(){

        return scopes.pop ();
    }

    public boolean empty(){
        return scopes.empty ();
    }

    public Scope peek(){
        return scopes.peek ();
    }
}
