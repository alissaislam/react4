package ast.Models.ast.Models;

import ast.Models.Array;
import ast.Models.ArrowFunction;
import ast.Models.Node;

public class UseEffect extends Node {

    ArrowFunction arrowFunction;

    ast.Models.Array array;

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
