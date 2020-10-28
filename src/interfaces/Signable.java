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
import java.sql.SQLException;
import user.User;

/**
 *
 * @author Imanol
 */
public interface Signable {
    
    public User signIn(User user) throws ErrorConnectingServerException, UserNotFoundException, SQLException, PasswordMissmatchException,ErrorClosingDatabaseResources;
    public User signUp(User user) throws ErrorConnectingDatabaseException, UserAlreadyExistException,QueryException;
    
}
