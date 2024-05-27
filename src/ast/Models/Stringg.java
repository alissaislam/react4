package ast.Models;

public class Stringg extends  JsxExpression{
    String string;

    public Stringg() {
    }

    public Stringg(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
