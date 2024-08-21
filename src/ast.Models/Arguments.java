package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class Arguments extends Node {
    List<Parameters> parametersList = new ArrayList<>();

    public List<Parameters> getParametersList() {
        return parametersList;
    }

    public void setParametersList(List<Parameters> parametersList) {
        this.parametersList = parametersList;
    }

    public String generateCode() {
        StringBuilder content = new StringBuilder();

        if (!parametersList.isEmpty ()) {

            for(int i =0 ; i<parametersList.size (); i++){
                if(i==parametersList.size ()-1)
                    content.append(parametersList.get (i).generateCode());
                else {
                    content.append(parametersList.get (i).generateCode());
                    content.append(",");
                }
            }
        }
        return content.toString();
    }




}
