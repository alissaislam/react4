package Error.Handling;

import java.util.ArrayList;

public class JSXError {
    private static  ArrayList<Error> errors = new ArrayList<Error>();
    public static void printErrors(){
        for (Error error:errors){
            System.err.println("Error name :" + error.getName() + " Error message: " + error.getMessage());
        }
    }

    public static ArrayList<Error> getErrors() {
        return errors;
    }

    public static void setErrors(ArrayList<Error> errors) {
        JSXError.errors = errors;
    }
}
