package ast.Models;

public class Comment extends Node{
    String singleLineComment;
    String MultiLineComment;;

    public String getSingleLineComment() {
        return singleLineComment;
    }

    public void setSingleLineComment(String singleLineComment) {
        this.singleLineComment = singleLineComment;
    }

    public String getMultiLineComment() {
        return MultiLineComment;
    }

    public void setMultiLineComment(String multiLineComment) {
        MultiLineComment = multiLineComment;
    }
}
