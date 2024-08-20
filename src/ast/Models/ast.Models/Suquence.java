package ast.Models.ast.Models;

import ast.Models.Data;
import ast.Models.Node;

import java.util.ArrayList;
import java.util.List;

public class Suquence extends Node {
    List<ast.Models.Data> listData =new ArrayList<>();

    public List<ast.Models.Data> getListData() {
        return listData;
    }

    public void setListData(List<Data> listData) {
        this.listData = listData;
    }
}
