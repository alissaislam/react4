package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class VariableDeclarationList extends Node{

    List<VariableDeclaration> variableDeclarationList =new ArrayList<> ();

    public List<VariableDeclaration> getVariableDeclarationList() {
        return variableDeclarationList;
    }

    public void setVariableDeclarationList(List<VariableDeclaration> variableDeclarationList) {
        this.variableDeclarationList = variableDeclarationList;
    }
}
