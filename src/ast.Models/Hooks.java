package ast.Models;

public class Hooks extends Node{
    UseState useState;
    UseEffect useEffect;
    UseRef useRef;
    UseMemo useMemo;

    public UseState getUseState() {
        return useState;
    }

    public void setUseState(UseState useState) {
        this.useState = useState;
    }

    public UseEffect getUseEffect() {
        return useEffect;
    }

    public void setUseEffect(UseEffect useEffect) {
        this.useEffect = useEffect;
    }

    public UseRef getUseRef() {
        return useRef;
    }

    public void setUseRef(UseRef useRef) {
        this.useRef = useRef;
    }

    public UseMemo getUseMemo() {
        return useMemo;
    }

    public void setUseMemo(UseMemo useMemo) {
        this.useMemo = useMemo;
    }
    public String generateCode() {return "";}

}
