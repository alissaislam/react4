package ast.Models;


import java.util.ArrayList;
import java.util.List;

public class CallFunction extends  Parameters{

    List<SimpleCallfunction> simpleCallfunctions=new ArrayList<> ();
    List<CallIdentifier> callIdentifiers =new ArrayList<> ();

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
}
