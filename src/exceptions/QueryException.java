package exceptions;

/**
 * Custom error that is generated when query sentence is incorrect
 * 
 * @author Mikel
 */
public class QueryException extends Exception {

    public QueryException() {
        super("Query error.");

    }

}
