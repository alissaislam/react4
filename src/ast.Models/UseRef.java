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

    public String generateCode() {
        StringBuilder code = new StringBuilder();

        // Handle optional kind
        if (kind != null) {
            code.append(kind.generateCode()).append(" ");
        }

        // Generate code for the identifier
        if (!ids.isEmpty()) {
            code.append(ids.get(0).generateCode()).append(" = ");
        }

        // Append 'useRef('
        code.append("useRef(");

        // Handle the argument to useRef (either another id or null)
        if (ids.size() > 1) {
            code.append(ids.get(1).generateCode());
        } else if (nullLiteral != null) {
            code.append("null");
        }

        // Close the useRef function call
        code.append(");");

        return code.toString();
    }
}
