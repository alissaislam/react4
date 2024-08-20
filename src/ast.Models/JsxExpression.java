package ast.Models;


import java.util.ArrayList;
import java.util.List;

public class JsxExpression extends Data {

    List<JsxExpression> jsxExpressionList = new ArrayList<> ();
    String operation;
    Number number;
    Stringg stringg;
    Bool booll;
    Id idd;

    public List<JsxExpression> getJsxExpressionList() {
        return jsxExpressionList;
    }

    public void setJsxExpressionList(List<JsxExpression> jsxExpressionList) {
        this.jsxExpressionList = jsxExpressionList;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public Stringg getStringg() {
        return stringg;
    }

    public void setStringg(Stringg string) {
        this.stringg = string;
    }

    public Bool getBooll() {
        return booll;
    }

    public void setBooll(Bool bool) {
        this.booll = bool;
    }

    public Id getIdd() {
        return idd;
    }

    public void setIdd(Id id) {
        this.id = idd;
    }
}
