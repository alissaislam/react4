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
    public String generateCode() {
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < mapElement.size(); i++) {
            if ( mapElement.get(i) != null) {
                content.append( mapElement.get(i).generateCode()); // Generate code for each map element
            }
            if (mapElement.size() > 1 && i < mapElement.size() - 1) {
                content.append(", "); // Add comma between elements, but not after the last element
            }
        }
        return content.toString();
    }
}
