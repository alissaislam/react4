package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class Condition extends Node{

    List<Data> dataList =new ArrayList<> ();
    Operation operation;
    String bool;
    List<String> notList=new ArrayList<> ();
    Id id;

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public String getBool() {
        return bool;
    }

    public void setBool(String bool) {
        this.bool = bool;
    }

    public List<String> getNotList() {
        return notList;
    }

    public void setNotList(List<String> notList) {
        this.notList = notList;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }
    public String generateCode() {
        StringBuilder content = new StringBuilder();
        if (operation != null) {
            content.append(dataList.get (0).generateCode());
            content.append(operation.generateCode());
            content.append(dataList.get (1).generateCode());
        }
        if (bool != null) {
            content.append(bool);
        }
        if (id != null) {
            for (String not : notList) {
                content.append (not);
            }
            content.append(id.generateCode());
        }
        return content.toString();
    }

}
