package exceptions;

import user.User;

/**
 *
 * @author Mikel
 */
public class UserAlreadyExistException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public UserAlreadyExistException(User user) {
        super("The user already exists in the database.");
    }
}
