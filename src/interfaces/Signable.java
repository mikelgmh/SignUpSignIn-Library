package interfaces;

import exceptions.ErrorClosingDatabaseResources;
import exceptions.ErrorConnectingServerException;
import exceptions.ErrorConnectingDatabaseException;
import exceptions.PasswordMissmatchException;
import exceptions.QueryException;
import exceptions.UserNotFoundException;
import exceptions.UserAlreadyExistException;
import user.User;

/**
 * The interface with the application use cases.
 * @author Imanol
 */
public interface Signable {

    public User signIn(User user) throws ErrorConnectingDatabaseException, UserNotFoundException, PasswordMissmatchException, ErrorClosingDatabaseResources, ErrorConnectingServerException, QueryException;

    public User signUp(User user) throws UserAlreadyExistException, ErrorConnectingServerException, ErrorConnectingDatabaseException, QueryException;

}
