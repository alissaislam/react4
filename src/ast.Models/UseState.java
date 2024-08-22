package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class UseState extends Node{

    Kind kind;
    List<Id> ids = new ArrayList<> ();

    NullLiteral nullLiteral ;

    public NullLiteral getNullLiteral() {
        return nullLiteral;
    }

    public void setNullLiteral(NullLiteral nullLiteral) {
        this.nullLiteral = nullLiteral;
    }

    public UseState() {
    }

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
    public String generateCode() {
        StringBuilder code = new StringBuilder();

        // Handle optional kind (e.g., const, let)
        if (kind != null) {
            code.append(kind.generateCode()).append(" ");
        }

        // Start array destructuring
        code.append("[");

        // Append the first id (state variable)
        if (ids.size() > 0) {
            code.append(ids.get(0).generateCode());
        }

        // Add the comma separator
        code.append(", ");

        // Append the second id (setState function)
        if (ids.size() > 1) {
            code.append(ids.get(1).generateCode());
        }

        // Close array destructuring
        code.append("] = useState(");

        // Handle the initial state value, either an id or null
        if (ids.size() > 2) {
            code.append(ids.get(2).generateCode());
        } else if (nullLiteral != null) {
            code.append("null");
        }

        // Close the useState function call
        code.append(");");

        return code.toString();
    }
}
