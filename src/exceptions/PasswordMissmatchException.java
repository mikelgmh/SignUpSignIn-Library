package exceptions;


/**
 * Custom error that is generated when password is incorrect
 * 
 * @author Iker
 */
public class PasswordMissmatchException extends Exception {


    public PasswordMissmatchException() {
        super("The password inserted doesn't match.");
    }


}
