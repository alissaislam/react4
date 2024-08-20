package ast.Models.ast.Models;

import ast.Models.Id;
import ast.Models.JsxParameters;

import java.util.ArrayList;
import java.util.List;

public class JsxCallIdentifier extends JsxParameters {
    List<ast.Models.Id> idList =new ArrayList<> ();

    public List<ast.Models.Id> getIdList() {
        return idList;
    }

    public void setIdList(List<Id> idList) {
        this.idList = idList;
    }
}
