package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class Import extends Node{
    List<Id> ids = new ArrayList<>();

    List<Hook> hooks = new ArrayList<>();
    String string;

    public List<Hook> getHooks() {
        return hooks;
    }

    public void setHooks(List<Hook> hooks) {
        this.hooks = hooks;
    }

    public List<Id> getIds() {
        return ids;
    }

    public void setIds(List<Id> ids) {
        this.ids = ids;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
