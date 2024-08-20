package ast.Models.ast.Models;

import ast.Models.JsxExpression;

public class Stringg extends JsxExpression {
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
