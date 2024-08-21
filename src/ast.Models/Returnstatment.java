package ast.Models;

public class Returnstatment extends Node {

    Expression experssion;
    JsxBlock jsxBlock;

    public Expression getExperssion() {
        return experssion;
    }

    public void setExperssion(Expression experssion) {
        this.experssion = experssion;
    }

    public JsxBlock getJsxBlock() {
        return jsxBlock;
    }

    public void setJsxBlock(JsxBlock jsxBlock) {
        this.jsxBlock = jsxBlock;
    }


    public String generateCode() {
        StringBuilder content = new StringBuilder();
        content.append("return ");
        if (experssion != null) {
            content.append(experssion.generateCode());
        }
        if (jsxBlock != null) {
            content.append(jsxBlock.generateCode());
        }
        return content.toString();
    }


}
