package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class UseRef extends Node{
    Kind kind;

    List<Id> ids = new ArrayList<> ();

    NullLiteral nullLiteral ;

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public List<Id> getIds() {
        return ids;
    }

    public void setIds(List<Id> ids) {
        this.ids = ids;
    }

    public NullLiteral getNullLiteral() {
        return nullLiteral;
    }

    public void setNullLiteral(NullLiteral nullLiteral) {
        this.nullLiteral = nullLiteral;
    }
}
