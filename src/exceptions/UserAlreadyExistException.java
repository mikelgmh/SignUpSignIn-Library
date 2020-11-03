package exceptions;

import user.User;

/**
 *
 * @author Mikel
 */
public class UserAlreadyExistException extends Exception {

    public UserAlreadyExistException(User user) {
        super("The user already exists in the database.");
    }

}
