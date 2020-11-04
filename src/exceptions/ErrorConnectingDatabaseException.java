package exceptions;

import message.TypeMessage;

/**
 * Custom error that is generated when access error to database 
 * 
 * @author Mikel
 */
public class ErrorConnectingDatabaseException extends Exception {


    public ErrorConnectingDatabaseException() {
        super("Error connecting database.");
    }

}
