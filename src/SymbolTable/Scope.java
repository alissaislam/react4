package SymbolTable;

import java.util.ArrayList;

public class Scope {
    int level;
    int id;
    int gId;
    static int ID=1;

    public Scope() {
    }

    public Scope(int level ,int gId) {
        this.level = level;
        this.gId = gId;
        this.id=ID;
        ID++;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
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
