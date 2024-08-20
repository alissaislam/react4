package ast.Models.ast.Models;


import ast.Models.Bool;
import ast.Models.Data;
import ast.Models.Id;
import ast.Models.Number;
import ast.Models.Stringg;

import java.util.ArrayList;
import java.util.List;

public class JsxExpression extends Data {

    List<JsxExpression> jsxExpressionList = new ArrayList<> ();
    String operation;
    ast.Models.Number number;
    ast.Models.Stringg stringg;
    ast.Models.Bool booll;
    ast.Models.Id idd;

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

    public ast.Models.Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public ast.Models.Stringg getStringg() {
        return stringg;
    }

    public void setStringg(Stringg string) {
        this.stringg = string;
    }

    public ast.Models.Bool getBooll() {
        return booll;
    }

    public void setBooll(Bool bool) {
        this.booll = bool;
    }

    public ast.Models.Id getIdd() {
        return idd;
    }

    public void setIdd(Id id) {
        this.id = idd;
    }
}
