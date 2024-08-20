package ast.Models.ast.Models;

import ast.Models.Node;
import ast.Models.VariableDeclaration;

import java.util.ArrayList;
import java.util.List;

public class VariableDeclarationList extends Node {

    List<ast.Models.VariableDeclaration> variableDeclarationList = new ArrayList<>();

    public List<ast.Models.VariableDeclaration> getVariableDeclarationList() {
        return variableDeclarationList;
    }

    public void setVariableDeclarationList(List<VariableDeclaration> variableDeclarationList) {
        this.variableDeclarationList = variableDeclarationList;
    }

    public String getHTML() {
        return " ";
    }

    public String generateCode() {return "";}
}
