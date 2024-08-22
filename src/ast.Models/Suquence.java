package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class Suquence extends Node {
    List<Data> listData =new ArrayList<>();

    public List<Data> getListData() {
        return listData;
    }

    public void setListData(List<Data> listData) {
        this.listData = listData;
    }
}
