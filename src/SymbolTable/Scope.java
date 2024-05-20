package SymbolTable;

public class Scope {
    int level;
    int id;
    static int ID=1;

    public Scope() {
    }

    public Scope(int level) {
        this.level = level;
        this.id=ID;
        ID++;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
