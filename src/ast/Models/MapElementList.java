package ast.Models;

import java.util.ArrayList;
import java.util.List;
public class MapElementList extends Node {
    List<MapElement> mapElement =new ArrayList<> ();


    public List<MapElement> getMapElement() {
        return mapElement;
    }

    public void setMapElement(List<MapElement> mapElement) {
        this.mapElement = mapElement;
    }
}
