/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Mikel
 */
public class UserAndEmailAlreadyExistException extends Exception {
       public UserAndEmailAlreadyExistException() {
        super("The user and thee email already exists.");
    }
}
