package java_exception.user_define;

public class AgeOfDriverException extends Exception {
    private String message;

    public AgeOfDriverException(String message) {
        this.message = message;
    }

    public AgeOfDriverException() {
    }
}
