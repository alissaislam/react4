package ast.Models.ast.Models;

import ast.Models.JsxParameters;
import ast.Models.Node;

import java.util.ArrayList;
import java.util.List;

public class JsxArguments extends Node {
    // Existing field
    List<JsxParameters> jsxParametersList = new ArrayList<>();

    // Existing getters and setters
    public List<JsxParameters> getJsxParametersList() {
        return jsxParametersList;
    }

    public void setJsxParametersList(List<JsxParameters> jsxParametersList) {
        this.jsxParametersList = jsxParametersList;
    }

    // New method to generate the code for the jsxArguments
    public String generateCode() {
        StringBuilder code = new StringBuilder();

        // Generate code for each jsxParameter in the list
        for (int i = 0; i < jsxParametersList.size(); i++) {
            JsxParameters parameter = jsxParametersList.get(i);
            code.append(parameter.generateCode());

            // Append a comma if this is not the last parameter
            if (i < jsxParametersList.size() - 1) {
                code.append(",");
            }
        }

        return code.toString();
    }
}
