/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import user.User;

/**
 *
 * @author Iker de la Cruz
 */
public class UserAlreadyExistException extends Exception {

    public UserAlreadyExistException(User user) {
        super("The user already exists in the database.");
    }
}
