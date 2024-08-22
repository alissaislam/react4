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
    String paren;

    public String getParen() {
        return paren;
    }

    public void setParen(String paren) {
        this.paren = paren;
    }

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

    public String generateCode() {
        StringBuilder content = new StringBuilder();
        if (paren != null) {
            content.append("(");
        }
        if (!jsxExpressionList.isEmpty ()) {
            for (JsxExpression jsxExpression : jsxExpressionList){
                content.append(jsxExpression.generateCode());
            }
        }
        if (paren != null) {
            content.append(")");
        }
        if (number != null) {
            content.append(number.getValue ());
        }
        if (stringg != null) {
            content.append(stringg.getStringg ());
        }

        if (booll != null) {
            content.append(booll.getBooll ());
        }

        if (id != null) {
            content.append(id.getId ());
        }


        return content.toString();
    }
}
