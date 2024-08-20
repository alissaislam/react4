package ast.Models;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;


public class Start extends Node{
    private static boolean isExists;
    List<Statement> statement_list = new ArrayList<>();

    public List<Statement> getStatement_list() {
        return statement_list;
    }

    public void setStatement_list(List<Statement> statement_list) {
        this.statement_list = statement_list;
    }


    public String getHTML() {
        System.out.println("in getHtml ");
        String content = "helooo world";
        try {

            File directory = new File("HTML_output");
            if (!directory.exists()) {
                if (directory.mkdirs()) {
                    System.out.println("Directory created successfully.");
                } else {
                    System.out.println("Failed to create directory.");
                    return "Failed to create directory.";
                } }
            FileWriter writer = new FileWriter("HTML_output/index.html");
            writer.write("<!DOCTYPE html>\n" +
                    "<html lang='en'>\n" +
                    "  <head>\n" +
                    "<meta charset='UTF-8' />\n" +
                    "    <title>Welcome to my App</title>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "    <div>\n" +
                    content +
                    "    </div>\n" +
                    "  </body>\n" +
                    "</html>");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();}
        return "";
    }




}
