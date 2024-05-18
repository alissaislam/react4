package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class Map extends Data{
    List<MapElementList> mapElementLists =new ArrayList<>();

    public List<MapElementList> getMapElementLists() {
        return mapElementLists;
    }

    public void setMapElementLists(List<MapElementList> mapElementLists) {
        this.mapElementLists = mapElementLists;
    }
}