package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class ForLoopParts extends Node{
    Kind kind;
    List<VariableDeclaration> variableDeclarationList =new ArrayList<> ();
    Condition condition;
    List<Id> idList =new ArrayList<> ();
    CallIdentifier callIdentifier;

    String op;

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public Kind getKind() {
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

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public List<Id> getIdList() {
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

    public String generateCode() {
        StringBuilder content = new StringBuilder();

        if (kind != null) {
            content.append(kind.generateCode());
        }

        if (variableDeclarationList.get (0) != null) {
            content.append(variableDeclarationList.get (0).generateCode()); // Append arguments if they exist
        }
        content.append(";");

        if (condition != null) {
            content.append(condition.generateCode());
        }
        content.append(";");
        if (variableDeclarationList.get (1) != null) {
            content.append(variableDeclarationList.get (1).generateCode()); // Append arguments if they exist
        }
        if (idList.size ()==1){
            content.append(idList.get (0).generateCode());
            content.append(getOp ());
        }
        else {
            for (Id id : idList){
                content.append(id.generateCode());
            }
            content.append(" : ");
            content.append(callIdentifier.generateCode());
        }
        return content.toString();
    }


}
