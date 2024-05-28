package ro.ulbs.paradigme.lab9;

public class PhoneAppException extends Exception{
    public PhoneAppException(String message) {
        super(message);
    }

    public PhoneAppException(String message, Throwable cause) {
        super(message, cause);
    }
}
