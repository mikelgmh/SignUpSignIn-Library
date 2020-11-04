package exceptions;


/**
 * Custom error that is generated when the user is not found on database
 * 
 * @author Iker
 */
public class UserNotFoundException extends Exception {

    public UserNotFoundException() {
        super("The inserted user does not exist in the database.");
    }

}
