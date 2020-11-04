package exceptions;


/**
 * Custom error that is generated when max connections of thread are reached
 * 
 * @author Mikel
 */
public class MaxConnectionsReachedException extends Exception  {


    public MaxConnectionsReachedException(int maxConnections, int actualConnections) {
        super("The server reached the maximum amount of connections. (" + actualConnections + "/" + maxConnections + ")");
    }


}
