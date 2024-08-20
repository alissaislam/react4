package ast.Models.ast.Models;

import ast.Models.CallIdentifier;
import ast.Models.Condition;
import ast.Models.Id;
import ast.Models.Kind;
import ast.Models.Node;
import ast.Models.VariableDeclaration;

import java.util.ArrayList;
import java.util.List;

public class ForLoopParts extends Node {
    ast.Models.Kind kind;
    List<VariableDeclaration> variableDeclarationList =new ArrayList<> ();
    ast.Models.Condition condition;
    List<ast.Models.Id> idList =new ArrayList<> ();
    CallIdentifier callIdentifier;

    public ast.Models.Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public List<VariableDeclaration> getVariableDeclarationList() {
        return variableDeclarationList;
    }

    public void setVariableDeclarationList(List<VariableDeclaration> variableDeclarationList) {
        this.variableDeclarationList = variableDeclarationList;
    }

    public ast.Models.Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public List<ast.Models.Id> getIdList() {
        return idList;
    }

    public void setIdList(List<Id> idList) {
        this.idList = idList;
    }

    public CallIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    public String generateCode() {return "";}


}
