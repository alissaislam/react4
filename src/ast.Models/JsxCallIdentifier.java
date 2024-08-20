package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class JsxCallIdentifier extends JsxParameters{
    List<Id> idList =new ArrayList<> ();

    public List<Id> getIdList() {
        return idList;
    }

    public void setIdList(List<Id> idList) {
        this.idList = idList;
    }
}
