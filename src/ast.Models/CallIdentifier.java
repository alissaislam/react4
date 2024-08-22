package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class CallIdentifier extends Parameters {

    List<Id> ids = new ArrayList<>();


    public List<Id> getIds() {
        return ids;
    }


    public void setIds(List<Id> ids) {

        this.ids = ids;
    }

    public String generateCode() {
        StringBuilder content = new StringBuilder();
        if (!ids.isEmpty ()) {
            for(int i =0 ; i<ids.size (); i++){
                if(i==ids.size ()-1){
//                    System.out.println ("fffffffffffffffffff");
//                    System.out.println (ids.get (i).generateCode());
                    content.append(ids.get (i).generateCode());}
                else {
                    content.append(ids.get (i).generateCode());
                    content.append(".");
                }
            }
        }
        return content.toString();
    }

}
