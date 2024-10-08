package ast.Models;

public class Hook extends Node {
    String hook;

    public String getHook() {
        return hook;
    }

    public void setHook(String hook) {
        this.hook = hook;
    }

    public String generateCode() {
        StringBuilder content = new StringBuilder();
        if (hook != null) {
            content.append(hook);
        }
        return content.toString();
    }
}
