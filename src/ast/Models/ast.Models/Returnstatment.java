package ast.Models.ast.Models;

import ast.Models.Expression;
import ast.Models.JsxBlock;
import ast.Models.Node;

public class Returnstatment extends Node {

    ast.Models.Expression experssion;
    ast.Models.JsxBlock jsxBlock;

    public ast.Models.Expression getExperssion() {
        return experssion;
    }

    public void setExperssion(Expression experssion) {
        this.experssion = experssion;
    }

    public ast.Models.JsxBlock getJsxBlock() {
        return jsxBlock;
    }

    public void setJsxBlock(JsxBlock jsxBlock) {
        this.jsxBlock = jsxBlock;
    }

    public String generateCode() {
        return "";
    }


}
