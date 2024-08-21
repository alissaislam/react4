package ast.Models;

public class Id extends  JsxExpression {
    String id;

    public Id() {
    }

    public Id(String id) {
        this.id = id;
    }

    public String getId() {
        System.out.println ("eeeeeeeeeeeee");
        System.out.println (id);
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String generateCode() {

        return id;
    }
}