package ast.Models.ast.Models;

import ast.Models.Node;

public class Comment extends Node {
    String singleLineComment;
    String multiLineComment;

    public String getSingleLineComment() {
        return singleLineComment;
    }

    public void setSingleLineComment(String singleLineComment) {
        this.singleLineComment = singleLineComment;
    }

    public String getMultiLineComment() {
        return multiLineComment;
    }

    public void setMultiLineComment(String multiLineComment) {
        this.multiLineComment = multiLineComment;
    }

    // New generateCode method
    public String generateCode() {
        StringBuilder content = new StringBuilder();

        if (singleLineComment != null) {
            content.append("// ").append(singleLineComment);  // Generate single-line comment
        }

        if (multiLineComment != null) {
            content.append("/* ").append(multiLineComment).append(" */");  // Generate multi-line comment
        }

        return content.toString();
    }
}
