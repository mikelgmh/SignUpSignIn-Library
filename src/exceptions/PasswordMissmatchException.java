/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Iker de la Cruz
 */
public class PasswordMissmatchException extends Exception {

    public PasswordMissmatchException(String password) {
        super("The password inserted doesn't match.");
    }
}
