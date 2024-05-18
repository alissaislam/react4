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
}
