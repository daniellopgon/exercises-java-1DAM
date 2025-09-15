package exceptions.person;

public class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}