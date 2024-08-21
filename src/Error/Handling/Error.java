package Error.Handling;

public class Error extends Throwable {
    private String name;
    private String message;

    public Error() {

    }

    public Error(String name, String message) {
        this.message = message;
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
