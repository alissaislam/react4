package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class CallFunction extends Parameters {

    List<SimpleCallfunction> simpleCallfunctions = new ArrayList<>();
    List<CallIdentifier> callIdentifiers = new ArrayList<>();

    // Existing getters and setters
    public List<SimpleCallfunction> getSimpleCallfunctions() {
        return simpleCallfunctions;
    }

    public void setSimpleCallfunctions(List<SimpleCallfunction> simpleCallfunctions) {
        this.simpleCallfunctions = simpleCallfunctions;
    }

    public List<CallIdentifier> getCallIdentifiers() {
        return callIdentifiers;
    }

    public void setCallIdentifiers(List<CallIdentifier> callIdentifiers) {
        this.callIdentifiers = callIdentifiers;
    }

    // New method to generate the code for the call function
    public String generateCode() {
        StringBuilder code = new StringBuilder();

        // Append the first simpleCallfunction or callIdentifier
        if (!simpleCallfunctions.isEmpty()) {
            code.append(simpleCallfunctions.get(0).generateCode());
            for (int i = 1; i < simpleCallfunctions.size(); i++) {
                code.append(".").append(simpleCallfunctions.get(i).generateCode());
            }
        } else if (!callIdentifiers.isEmpty()) {
            code.append(callIdentifiers.get(0).generateCode());
            System.out.println ("gggggggggggggg");
            System.out.println (callIdentifiers.get(0).generateCode());
            for (int i = 1; i < callIdentifiers.size(); i++) {
                code.append(".").append(callIdentifiers.get(i).generateCode());
            }
        }

        // Append the optional trailing simpleCallfunction
        if (simpleCallfunctions.size() > 1) {
            code.append(".").append(simpleCallfunctions.get(simpleCallfunctions.size() - 1).generateCode());
        }

        return code.toString();
    }
}
