package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class CallIdentifier extends  Parameters {

    List<Id> ids=new ArrayList<>();


    public List<Id> getIds() {
        return ids;
    }


    public void setIds(List<Id> ids) {

        this.ids = ids;
    }
}
