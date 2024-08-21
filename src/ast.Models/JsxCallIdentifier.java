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

    public String generateCode() {
        StringBuilder content = new StringBuilder();

        if (!idList.isEmpty ()) {
            for(int i =0 ; i<idList.size (); i++){
                if(i==idList.size ()-1)
                content.append(idList.get (i).generateCode());
                else {
                    content.append(idList.get (i).generateCode());
                    content.append(".");
                }
            }
        }
        return content.toString();
    }
}
