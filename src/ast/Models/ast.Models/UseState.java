package ast.Models.ast.Models;

import ast.Models.Id;
import ast.Models.Kind;
import ast.Models.Node;
import ast.Models.NullLiteral;

import java.util.ArrayList;
import java.util.List;

public class UseState extends Node {

    ast.Models.Kind kind;
    List<ast.Models.Id> ids = new ArrayList<> ();

    NullLiteral nullLiteral ;

    public NullLiteral getNullLiteral() {
        return nullLiteral;
    }

    public void setNullLiteral(NullLiteral nullLiteral) {
        this.nullLiteral = nullLiteral;
    }

    public UseState() {
    }

    public ast.Models.Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public List<ast.Models.Id> getIds() {
        return ids;
    }

    public void setIds(List<Id> ids) {
        this.ids = ids;
    }
}
