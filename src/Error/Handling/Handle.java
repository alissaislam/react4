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
    private static final ArrayList<Error> errors = new ArrayList<Error>();
    public static void errorCheck(){
        for(StRow row : rows){
            canDeclare(row);
        }
        printErrors();
    }

    public static void canDeclare(StRow rowIn){
        if(!constAssigned(rowIn)){
            errors.add(new Error("SyntaxError : "," Missing initializer in const declaration"));
        }
        for(StRow row :rows){
            if(row==rowIn) {
                continue;
            }
            if(isReachable(row,rowIn)){
                if(constReassign(row,rowIn)&&nameEqual(row,rowIn)){
                    errors.add(new Error("TypeError: ","Assignment to constant variable."));
                }

            }
            if(sameScope(row,rowIn)){
                if(isBlockScoped(row)&&isBlockScoped(rowIn)&&nameEqual(row,rowIn)){ //change if statement
                    errors.add((new Error("SyntaxError: ","Identifier '" + rowIn.getName() +"' has already been declared" )));
                }
            }
        }
    }

    private static boolean constAssigned(StRow row){
        return !Objects.equals(row.getKind(), "const") || row.isAssigned();
    }


    //const reassign
    public static boolean constReassign(StRow row1,StRow row2){
        return row1.getKind().equals("const")  && row2.isAssigned() && Objects.equals(row2.getKind(), "*");
    }
    public static boolean nameEqual(StRow row1 , StRow row2){
        return Objects.equals(row1.getName(),row2.getName());
    }

    public static boolean isHigher(StRow row1,StRow row2){
        return row1.getScope().getLevel() >= row2.getScope().getLevel();
    }
    public static boolean isReachable(StRow row1,StRow row2){
        return row1.getScope().getgId()==row2.getScope().getgId();
    }
    public static boolean sameScope(StRow row1,StRow row2){
        return row1.getScope().getId()==row2.getScope().getId();
    }

    public static boolean isConst(StRow row){
        return row.getKind().equals("const");
    }
    public static boolean isReading(StRow row){
        return row.getKind().equals("*");
    }
    public static boolean isBlockScoped(StRow row){
        return row.getKind().equals("let")||row.getKind().equals("const");
    }

    public static void printErrors(){
        for (Error error:errors){
            System.out.println("Error name :" + error.getName() + " Error message: " + error.getMessage());
        }
    }

}
