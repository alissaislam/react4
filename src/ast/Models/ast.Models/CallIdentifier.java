package ast.Models.ast.Models;

import ast.Models.Id;
import ast.Models.Parameters;

import java.util.ArrayList;
import java.util.List;

public class CallIdentifier extends Parameters {

    List<ast.Models.Id> ids = new ArrayList<>();


    public List<ast.Models.Id> getIds() {
        return ids;
    }


    public void setIds(List<ast.Models.Id> ids) {

        this.ids = ids;
    }

    public String generateCode() {
        StringBuilder content = new StringBuilder();
        int idCount = ids.size();
        for (int i = 0; i < idCount; i++) {
            Id id = ids.get(i);
            if (id != null) {
                content.append(id.generateCode());
            }
            //No trailing dot after the last identifier.
            //No dot added when there's only one identifier.
            if (idCount > 1 && i < idCount - 1) {
                content.append(".");
            }
        }
        return content.toString();
    }

}
