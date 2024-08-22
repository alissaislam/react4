package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class IfShort extends Node {
    // Existing fields
    CallIdentifier callIdentifier;
    Operation operation;
    Expression expression;
    List<Statement> statements = new ArrayList<>();
    List<JsxElement> jsxElements = new ArrayList<>();

    // Existing getters and setters
    public CallIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public List<JsxElement> getJsxElements() {
        return jsxElements;
    }

    public void setJsxElements(List<JsxElement> jsxElements) {
        this.jsxElements = jsxElements;
    }

    // New method to generate the code for the ifShort statement
    public String generateCode() {
        StringBuilder code = new StringBuilder();

        // Start with callIdentifier
        if (callIdentifier != null) {
            code.append(callIdentifier.generateCode());
        }

        // Optional operation and expression
        if (operation != null && expression != null) {
            code.append(" ").append(operation.generateCode()).append(" ").append(expression.generateCode());
        }

        // Add question mark
        code.append(" ? ");

        // Handle statements or jsxElements before the colon
        if (!statements.isEmpty()) {
            for (Statement statement : statements) {
                code.append(statement.generateCode());
            }
        } else if (!jsxElements.isEmpty()) {
            for (JsxElement jsxElement : jsxElements) {
                code.append(jsxElement.generateCode());
            }
        }

        // Add colon
        code.append(" : ");

        // Handle statements or jsxElements after the colon
        if (!statements.isEmpty()) {
            for (Statement statement : statements) {
                code.append(statement.generateCode());
            }
        } else if (!jsxElements.isEmpty()) {
            for (JsxElement jsxElement : jsxElements) {
                code.append(jsxElement.generateCode());
            }
        }

        return code.toString();
    }
}
