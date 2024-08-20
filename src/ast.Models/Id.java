package ast.Models;

public class Id extends  JsxExpression {
    String id;

    public Id() {
    }

    public Id(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String generateCode() {
        return id; // Returns the ID as is
    }}