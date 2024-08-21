package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class UseMemo extends Node {

    Kind kind ;
    Id id;

    ArrowFunction arrowFunction;

    Array array;

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public Id getId() {
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

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public String generateCode() {
        StringBuilder code = new StringBuilder();

        // Handle optional kind (e.g., const)
        if (kind != null) {
            code.append(kind.generateCode()).append(" ");
        }

        // Append the identifier (variable name)
        if (id != null) {
            code.append(id.generateCode()).append(" = ");
        }

        // Start useMemo function call
        code.append("useMemo(");

        // Generate code for the arrow function
        if (arrowFunction != null) {
            code.append(arrowFunction.generateCode());
        }

        // Generate code for the dependency array
        if (array != null) {
            code.append(", ").append(array.generateCode());
        }

        // Close the useMemo function call
        code.append(");");

        return code.toString();
    }
}
