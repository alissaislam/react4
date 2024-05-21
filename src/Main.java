import antlr.ReactLexer;
import antlr.ReactParser;
import ast.Models.Id;
import ast.Models.Node;
import ast.Models.Start;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.BaseVisitor;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {

        CharStream cs=null;
        String source  = "src/test/test1.txt";
        try{
            cs = fromFileName (source);
        }catch (Exception e){
            System.out.println (e);
        }
        ReactLexer lexer = new ReactLexer(cs);
        CommonTokenStream token =  new CommonTokenStream((TokenSource) lexer);
        ReactParser parser = new ReactParser(token);
        ParseTree tree = parser.start();
        Start  doc = (Start) new BaseVisitor().visit(tree);
        print (doc);
        BaseVisitor.getSymbolTable ().print ();

    }
    public static void print(Node root) {
        int x=0 ;
        if (root == null) return;

        Queue<Node> queue = new LinkedList<> ();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll ();
            System.out.println(tempNode);
            for (Node child : tempNode.getChild()) {
                queue.add(child);
            }
        }
    }
}
