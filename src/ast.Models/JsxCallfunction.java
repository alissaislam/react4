package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class JsxCallfunction extends  JsxParameters{

    List<Id> idList =new ArrayList<> ();
    List<JsxSimpleCallfunction> jsxSimpleCallfunctionList =new ArrayList<> ();

    public List<Id> getIdList() {
        return idList;
    }

    public void setIdList(List<Id> idList) {
        this.idList = idList;
    }

    public List<JsxSimpleCallfunction> getJsxSimpleCallfunctionList() {
        return jsxSimpleCallfunctionList;
    }

    public void setJsxSimpleCallfunctionList(List<JsxSimpleCallfunction> jsxSimpleCallfunctionList) {
        this.jsxSimpleCallfunctionList = jsxSimpleCallfunctionList;
    }
    public String generateCode() {
        StringBuilder content = new StringBuilder();
        if (!idList.isEmpty ()) {
            for (Id id : idList) {
                content.append(id.generateCode());
                content.append(".");
            }
        }
        if (!jsxSimpleCallfunctionList.isEmpty ()) {
            for (int i =0 ; i< jsxSimpleCallfunctionList.size ();i++) {
                if(i==jsxSimpleCallfunctionList.size ()-1){
                    content.append (jsxSimpleCallfunctionList.get (i).generateCode ());

                }
                else{
                    content.append (jsxSimpleCallfunctionList.get (i).generateCode ());
                    content.append (".");
                }
            }
        }

        return content.toString();
    }
}
