/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author Imanol
 */
public interface Signable {

    public User signIn(User user) throws ErrorConnectingDatabaseException, UserNotFoundException, PasswordMissmatchException, ErrorClosingDatabaseResources, ErrorConnectingServerException, QueryException;

    public User signUp(User user) throws UserAlreadyExistException, ErrorConnectingServerException, ErrorConnectingDatabaseException, QueryException;

}
