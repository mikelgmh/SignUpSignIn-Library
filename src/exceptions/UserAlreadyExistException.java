package exceptions;

import user.User;

/**
 * Custom error that is generated when the user exist on the database
 * 
 * @author Mikel
 */
public class UserAlreadyExistException extends Exception {

    public UserAlreadyExistException(User user) {
        super("The user already exists in the database.");
    }

}
