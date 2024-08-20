package ast.Models;


import java.util.ArrayList;
import java.util.List;

public abstract class Node {
    String node_name;
    String line_num;
    String node_type;
    int count_child;
    List<Node> child =new ArrayList<> ();


    public List<Node> getChild() {
        return child;
    }

    public void setChild(List<Node> child) {
        this.child = child;
    }

    public String getNode_name() {
        return node_name;
    }

    public void setNode_name(String node_name) {
        this.node_name = node_name;
    }

    public String getLine_num() {
        return line_num;
    }

    public void setLine_num(String line_num) {
        this.line_num = line_num;
    }

    public String getNode_type() {
        return node_type;
    }

    public void setNode_type(String node_type) {
        this.node_type = node_type;
    }

    public int getCount_child() {
        return count_child;
    }

    public void setCount_child(int count_child) {
        this.count_child = count_child;
    }


    @Override
    public String toString() {
        String str =  "\n Node { \n" +
                ", node_name= " + node_name + "\n" +
                ", line_num= " + line_num + "\n" +
                ", node_type= " + node_type + "\n" +
                ", count_child= " + count_child + "\n" +
                "\n";
        return str;
    }
}
