package ast.Models;

import SymbolTable.StRow;

public class Data extends Node {
    Array array;
    Number number;
    Stringg stringg;
    Id id;
    Map map;
    Bool bool;
    StRow stRow;

    public StRow getStRow() {
        return stRow;
    }

    public void setStRow(StRow stRow) {
        this.stRow = stRow;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public Stringg getStringg() {
        return stringg;
    }

    public void setStringg(Stringg stringg) {
        this.stringg = stringg;
    }

    public Id getIdd() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Bool getBoolll() {
        return bool;
    }

    public void setBool(Bool bool) {
        this.bool = bool;
    }

    public String generateCode() {
        String content = "";
        if (array != null) {
            content = array.generateCode();
        } else if (number != null) {
            content = String.valueOf(number.getValue());
        } else if (stringg != null) {
            content = stringg.getString();
        } else if (id != null) {
            content= id.generateCode();
        } else if (map != null) {
            content= map.generateCode();
        } else if (bool != null) {
            content= bool.getBool();
        }
        return content;
    }

}
