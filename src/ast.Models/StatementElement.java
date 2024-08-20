package ast.Models;

public class StatementElement extends Node {
    VariableDeclarationList variableDeclarationList;

    Hooks hooks;
    If ifElement;

    For forElement;
    Function functionElement;
    Comment comment;
    While whileElement;
    DoWhile doWhileElement;
    CallFunction callFunction;
    Switch switchElement;
    Block block;
    Break breakElement;
    TryCatch tryCatch;
    Import importElement;
    IfShort ifShort;
    Sequence sequence;
    Export exportElement;
    JsxElement jsxElement;
    Expression expression;
    ArrowFunction arrowFunction;

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    public Expression getExpression() {
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

    public If getIfElement() {
        return ifElement;
    }

    public void setIfElement(If ifElement) {
        this.ifElement = ifElement;
    }

    public For getForelement() {
        return forElement;
    }

    public void setForelement(For forElement) {
        this.forElement = forElement;
    }

    public Function getFunctionElement() {
        return functionElement;
    }

    public void setFunctionElement(Function functionElement) {
        this.functionElement = functionElement;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public While getWhileElement() {
        return whileElement;
    }

    public void setWhileElement(While whileElement) {
        this.whileElement = whileElement;
    }

    public DoWhile getDoWhileElement() {
        return doWhileElement;
    }

    public void setDoWhileElement(DoWhile doWhileElement) {
        this.doWhileElement = doWhileElement;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public Switch getSwitchElement() {
        return switchElement;
    }

    public void setSwitchElement(Switch switchElement) {
        this.switchElement = switchElement;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public Break getBreakElement() {
        return breakElement;
    }

    public void setBreakElement(Break breakElement) {
        this.breakElement = breakElement;
    }

    public TryCatch getTryCatch() {
        return tryCatch;
    }

    public void setTryCatch(TryCatch tryCatch) {
        this.tryCatch = tryCatch;
    }

    public Import getImportElement() {
        return importElement;
    }

    public void setImportElement(Import importElement) {
        this.importElement = importElement;
    }

    public IfShort getIfShort() {
        return ifShort;
    }

    public void setIfShort(IfShort ifShort) {
        this.ifShort = ifShort;
    }

    public Sequence getSequence() {
        return sequence;
    }

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    public Export getExportElement() {
        return exportElement;
    }

    public void setExportElement(Export exportElement) {
        this.exportElement = exportElement;
    }

    public JsxElement getJsxElement() {
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
