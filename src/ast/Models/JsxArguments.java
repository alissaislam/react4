package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class JsxArguments extends Node{
    List<JsxParameters> jsxParametersList = new ArrayList<>();

    public List<JsxParameters> getJsxParametersList() {
        return jsxParametersList;
    }

    public void setJsxParametersList(List<JsxParameters> jsxParametersList) {
        this.jsxParametersList = jsxParametersList;
    }
}
