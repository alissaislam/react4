package ast.Models.ast.Models;

import ast.Models.Array;
import ast.Models.ArrowFunction;
import ast.Models.Id;
import ast.Models.Kind;
import ast.Models.Node;

import java.util.ArrayList;
import java.util.List;

public class UseMemo extends Node {

    ast.Models.Kind kind ;
    ast.Models.Id id;

    ArrowFunction arrowFunction;

    ast.Models.Array array;

    public ast.Models.Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public ast.Models.Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    public ast.Models.Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }
}
