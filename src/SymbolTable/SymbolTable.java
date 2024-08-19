package SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    List<StRow> rows = new ArrayList<>();

    public List<StRow> getRows() {
        return rows;
    }

    public void setRows(List<StRow> rows) {
        this.rows = rows;
    }

    public void print() {
        System.out.println("\t\t\t\t\tType\t\t\t\t\t\t\t\t\tKind\t\t\t\t\t\t\t\t\t  Name\t\t\t\t\t\t\t\t\t  Assigned\t\t\t\t\t\t\t\t\t   Value\t\t\t\t\t\t\t\t  scope level\t\t\t\t\t\t\t\t  scope Id\t\t\t\t\t\t\t\tscope Group Id");
        System.out.println("├────────────────────────────────────────┼─────────────────────────────────────────┼─────────────────────────────────────────┼──────────────────────────────────────────┼──────────────────────────────────────────┼─────────────────────────────────────────┼─────────────────────────────────────────┼─────────────────────────────────────────┤");

        for (StRow row : rows) {
            if (row!= null) {
                System.out.printf("│%-40s│ %-40s│ %-40s│ %-40s │ %-40s │%-40s │%-40s │%-40s │%n", centerText(row.getType(), 40), centerText(row.getKind (), 40), centerText(row.getName (), 40),centerText(String.valueOf (row.isAssigned ()), 40),centerText(row.getValue (), 40), centerText(String.valueOf (row.getScope ().getLevel ()), 40), centerText(String.valueOf (row.getScope ().getId ()), 40) ,centerText(String.valueOf (row.getScope ().getgId ()), 40));
            }
        }

        System.out.println("├────────────────────────────────────────┼─────────────────────────────────────────┼─────────────────────────────────────────┼──────────────────────────────────────────┼──────────────────────────────────────────┼─────────────────────────────────────────┼─────────────────────────────────────────┼─────────────────────────────────────────┤");

    }

    private String centerText(String text, int width) {
        if (text == null) {
            text = "";
        }
        int padding = width - text.length();
        int leftPadding = padding / 2;
        int rightPadding = padding - leftPadding;

        return String.format("%-" + leftPadding + "s%s%" + rightPadding + "s", "", text, "");
    }
}
