package ast.Models;


import java.util.ArrayList;
import java.util.List;

public class Sequence extends Node {
    List<Data> listData = new ArrayList<>();

    public List<Data> getListData() {
        return listData;
    }

    public void setListData(List<Data> listData) {
        this.listData = listData;
    }

    public String generateCode() {
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < listData.size(); i++) {
            if (listData.get(i) != null) {
                content.append(listData.get(i).generateCode());
            }
            if (listData.size() > 1 && i < listData.size() - 1) {
                content.append(", ");
            }
        }

        return content.toString();
    }
}
