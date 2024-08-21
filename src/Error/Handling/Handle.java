package Error.Handling;

import SymbolTable.SymbolTable;
import SymbolTable.StRow;
import visitors.BaseVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Handle {
    static SymbolTable symbolTable = BaseVisitor.getSymbolTable();

    static List<StRow> rows = symbolTable.getRows();
    private static  ArrayList<Error> errors = new ArrayList<Error>();

    public static ArrayList<Error> getErrors() {
        return errors;
    }

    public static List<StRow> getRows() {
        return rows;
    }
}
