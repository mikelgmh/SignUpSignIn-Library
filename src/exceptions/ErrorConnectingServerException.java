package exceptions;


/**
 * Custom error that is generated when connecting server from client side.
 * 
 * @author Iker
 */
public class ErrorConnectingServerException extends Exception   {


    public ErrorConnectingServerException() {
        super("Error trying to connect to the server.");
    }

 
}
