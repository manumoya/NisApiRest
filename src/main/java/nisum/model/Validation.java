package nisum.model;

public class Validation {

    private boolean validated;
    private String message;

    public Validation(){
    }

    public Validation(boolean validated, String message) {
        this.validated = validated;
        this.message = message;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
