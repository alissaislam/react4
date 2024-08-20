package ast.Models.ast.Models;

import ast.Models.Block;
import ast.Models.Expression;
import ast.Models.Node;
import ast.Models.Statement;

import java.util.ArrayList;
import java.util.List;

public class Switch extends Node {
    // Existing fields
    private List<Expression> expressions = new ArrayList<>();
    private List<ast.Models.Block> blocks = new ArrayList<>();
    private List<Statement> statements = new ArrayList<>();

    // Additional fields to manage the case and default sections within the switch
    private Expression switchExpression;
    private List<Expression> caseExpressions = new ArrayList<>();
    private ast.Models.Block defaultBlock;
    private List<Statement> defaultStatements = new ArrayList<>();

    // Existing getters and setters
    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public List<ast.Models.Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<ast.Models.Block> blocks) {
        this.blocks = blocks;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    // New getters and setters for switchExpression, caseExpressions, defaultBlock, and defaultStatements
    public Expression getSwitchExpression() {
        return switchExpression;
    }

    public void setSwitchExpression(Expression switchExpression) {
        this.switchExpression = switchExpression;
    }

    public List<Expression> getCaseExpressions() {
        return caseExpressions;
    }

    public void setCaseExpressions(List<Expression> caseExpressions) {
        this.caseExpressions = caseExpressions;
    }

    public ast.Models.Block getDefaultBlock() {
        return defaultBlock;
    }

    public void setDefaultBlock(Block defaultBlock) {
        this.defaultBlock = defaultBlock;
    }

    public List<Statement> getDefaultStatements() {
        return defaultStatements;
    }

    public void setDefaultStatements(List<Statement> defaultStatements) {
        this.defaultStatements = defaultStatements;
    }

    // Method to generate the code for the switch statement
    public String generateCode() {
        StringBuilder content = new StringBuilder();

        // Generate the switch expression
        content.append("switch (");
        if (switchExpression != null) {
            content.append(switchExpression.generateCode());
        }
        content.append(") {\n");

        // Generate the case clauses using existing expressions and blocks/statements
        for (int i = 0; i < caseExpressions.size(); i++) {
            content.append("case ");
            content.append(caseExpressions.get(i).generateCode());
            content.append(":\n");

            if (i < blocks.size() && blocks.get(i) != null) {
                content.append(blocks.get(i).generateCode());
            } else if (i < statements.size() && statements.get(i) != null) {
                content.append(statements.get(i).generateCode());
            }
        }

        // Generate the default clause if it exists
        if (defaultBlock != null || !defaultStatements.isEmpty()) {
            content.append("default:\n");
            if (defaultBlock != null) {
                content.append(defaultBlock.generateCode());
            } else {
                for (Statement stmt : defaultStatements) {
                    content.append(stmt.generateCode());
                }
            }
        }

        content.append("}\n");
        return content.toString();
    }
}
