/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import message.TypeMessage;

/**
 *
 * @author Mikel
 */
public class ErrorConnectingDatabaseException extends Exception {


    public ErrorConnectingDatabaseException() {
        super("Error connecting database.");
    }

}
