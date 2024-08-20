package ast.Models.ast.Models;


import ast.Models.Data;
import ast.Models.Node;

import java.util.ArrayList;
import java.util.List;

public class Sequence extends Node {
    List<ast.Models.Data> listData = new ArrayList<>();

    public List<ast.Models.Data> getListData() {
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
