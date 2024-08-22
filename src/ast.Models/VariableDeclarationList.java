package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class VariableDeclarationList extends Node {

    List<VariableDeclaration> variableDeclarationList = new ArrayList<>();

    public List<VariableDeclaration> getVariableDeclarationList() {
        return variableDeclarationList;
    }

    public void setVariableDeclarationList(List<VariableDeclaration> variableDeclarationList) {
        this.variableDeclarationList = variableDeclarationList;
    }

    public String getHTML() {
        return " ";
    }

    public String generateCode() {
        StringBuilder content = new StringBuilder();

        if (!variableDeclarationList.isEmpty ()) {
            for(int i =0 ; i<variableDeclarationList.size (); i++){
                if(i==variableDeclarationList.size ()-1)
                    content.append(variableDeclarationList.get (i).generateCode());
                else {
                    content.append(variableDeclarationList.get (i).generateCode());
                    content.append(",");
                }
            }
        }
        return content.toString();
    }
}
