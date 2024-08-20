package ast.Models.ast.Models;

import ast.Models.Data;
import ast.Models.MapElementList;

import java.util.ArrayList;
import java.util.List;

public class Map extends Data {
    List<MapElementList> mapElementLists = new ArrayList<>();

    public List<MapElementList> getMapElementLists() {
        return mapElementLists;
    }

    public void setMapElementLists(List<MapElementList> mapElementLists) {
        this.mapElementLists = mapElementLists;
    }
    public String generateCode() {
        StringBuilder content = new StringBuilder();
        content.append("{");
        for (int i = 0; i < mapElementLists.size(); i++) {
            if (mapElementLists.get(i) != null) {
                content.append(mapElementLists.get(i).generateCode());
            }
            if (mapElementLists.size()>1 && i < mapElementLists.size() - 1) {
                content.append(", ");
            }
        }
        content.append("}");
        return content.toString();
    }
}