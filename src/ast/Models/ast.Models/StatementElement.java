package ast.Models.ast.Models;

import ast.Models.ArrowFunction;
import ast.Models.Block;
import ast.Models.Break;
import ast.Models.CallFunction;
import ast.Models.Comment;
import ast.Models.DoWhile;
import ast.Models.Export;
import ast.Models.Expression;
import ast.Models.For;
import ast.Models.Function;
import ast.Models.Hooks;
import ast.Models.If;
import ast.Models.IfShort;
import ast.Models.Import;
import ast.Models.JsxElement;
import ast.Models.Node;
import ast.Models.Sequence;
import ast.Models.Switch;
import ast.Models.TryCatch;
import ast.Models.VariableDeclarationList;
import ast.Models.While;

public class StatementElement extends Node {
    VariableDeclarationList variableDeclarationList;

    Hooks hooks;
    ast.Models.If ifElement;

    ast.Models.For forElement;
    ast.Models.Function functionElement;
    ast.Models.Comment comment;
    ast.Models.While whileElement;
    ast.Models.DoWhile doWhileElement;
    ast.Models.CallFunction callFunction;
    ast.Models.Switch switchElement;
    ast.Models.Block block;
    ast.Models.Break breakElement;
    ast.Models.TryCatch tryCatch;
    ast.Models.Import importElement;
    ast.Models.IfShort ifShort;
    ast.Models.Sequence sequence;
    ast.Models.Export exportElement;
    ast.Models.JsxElement jsxElement;
    ast.Models.Expression expression;
    ast.Models.ArrowFunction arrowFunction;

    public ast.Models.ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    public ast.Models.Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public VariableDeclarationList getVariableDeclarationList() {
        return variableDeclarationList;
    }

    public void setVariableDeclarationList(VariableDeclarationList variableDeclarationList) {
        this.variableDeclarationList = variableDeclarationList;
    }

    public ast.Models.If getIfElement() {
        return ifElement;
    }

    public void setIfElement(If ifElement) {
        this.ifElement = ifElement;
    }

    public ast.Models.For getForelement() {
        return forElement;
    }

    public void setForelement(For forElement) {
        this.forElement = forElement;
    }

    public ast.Models.Function getFunctionElement() {
        return functionElement;
    }

    public void setFunctionElement(Function functionElement) {
        this.functionElement = functionElement;
    }

    public ast.Models.Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public ast.Models.While getWhileElement() {
        return whileElement;
    }

    public void setWhileElement(While whileElement) {
        this.whileElement = whileElement;
    }

    public ast.Models.DoWhile getDoWhileElement() {
        return doWhileElement;
    }

    public void setDoWhileElement(DoWhile doWhileElement) {
        this.doWhileElement = doWhileElement;
    }

    public ast.Models.CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public ast.Models.Switch getSwitchElement() {
        return switchElement;
    }

    public void setSwitchElement(Switch switchElement) {
        this.switchElement = switchElement;
    }

    public ast.Models.Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public ast.Models.Break getBreakElement() {
        return breakElement;
    }

    public void setBreakElement(Break breakElement) {
        this.breakElement = breakElement;
    }

    public ast.Models.TryCatch getTryCatch() {
        return tryCatch;
    }

    public void setTryCatch(TryCatch tryCatch) {
        this.tryCatch = tryCatch;
    }

    public ast.Models.Import getImportElement() {
        return importElement;
    }

    public void setImportElement(Import importElement) {
        this.importElement = importElement;
    }

    public ast.Models.IfShort getIfShort() {
        return ifShort;
    }

    public void setIfShort(IfShort ifShort) {
        this.ifShort = ifShort;
    }

    public ast.Models.Sequence getSequence() {
        return sequence;
    }

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    public ast.Models.Export getExportElement() {
        return exportElement;
    }

    public void setExportElement(Export exportElement) {
        this.exportElement = exportElement;
    }

    public ast.Models.JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public String getHTML() {
        return "";
    }

    // New generateCode method
    public String generateCode() {
        String content = "";

        if (variableDeclarationList != null) {
            content = variableDeclarationList.generateCode();
        } else if (hooks !=null) {
            content =hooks.generateCode();
        } else if (ifElement != null) {
            content = ifElement.generateCode();
        } else if (forElement != null) {
            content = forElement.generateCode();
        } else if (functionElement != null) {
            content = functionElement.generateCode();
        } else if (comment != null) {
            content = comment.generateCode();
        } else if (whileElement != null) {
            content = whileElement.generateCode();
        } else if (doWhileElement != null) {
            content = doWhileElement.generateCode();
        } else if (callFunction != null) {
            content = callFunction.generateCode();
        } else if (switchElement != null) {
            content = switchElement.generateCode();
        } else if (block != null) {
            content = block.generateCode();
        } else if (breakElement != null) {
            content = breakElement.generateCode();
        } else if (tryCatch != null) {
            content = tryCatch.generateCode();
        } else if (importElement != null) {
            content = importElement.generateCode();
        } else if (ifShort != null) {
            content = ifShort.generateCode();
        } else if (sequence != null) {
            content = sequence.generateCode();
        } else if (exportElement != null) {
            content = exportElement.generateCode();
        } else if (jsxElement != null) {
            content = jsxElement.generateCode();
        } else if (expression != null) {
            content = expression.generateCode();
        } else if (arrowFunction != null) {
            content = arrowFunction.generateCode();
        }

        return content;
    }
}
