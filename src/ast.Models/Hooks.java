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
    public String generateCode() {
        StringBuilder content = new StringBuilder();
        if (useState != null) {
            content.append(useState.generateCode());
        }
        if (useRef != null) {
            content.append(useRef.generateCode());
        }
        if (useMemo != null) {
            content.append(useMemo.generateCode());
        }
        if (useEffect != null) {
            content.append(useEffect.generateCode());
        }
        return content.toString();
    }

}
