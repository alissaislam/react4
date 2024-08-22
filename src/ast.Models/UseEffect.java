package ast.Models;

public class UseEffect extends Node{

    ArrowFunction arrowFunction;

    Array array;

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

        // Start with 'useEffect('
        code.append("useEffect(");

        // Generate the code for the arrow function
        if (arrowFunction != null) {
            code.append(arrowFunction.generateCode());
        }

        // Generate the code for the dependency array, if present
        if (array != null) {
            code.append(", ").append(array.generateCode());
        }

        // Close the 'useEffect' function call
        code.append(");");

        return code.toString();
    }
}
