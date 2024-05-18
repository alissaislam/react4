package ast.Models;

public class Id extends  JsxExpression {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    @Override
//    public String toString() {
//        return "Id{" +
//                "node_name='" + node_name + '\'' +
//                ", node_type='" + node_type + '\'' +
//                '}';
//    }
}