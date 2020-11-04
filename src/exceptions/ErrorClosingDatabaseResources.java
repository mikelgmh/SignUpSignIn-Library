package exceptions;

/**
 * Custom error that is generated when there is closing error resources from database 
 * 
 * @author Imanol
 */
public class ErrorClosingDatabaseResources extends Exception {
    
    public ErrorClosingDatabaseResources() {
        super("Fatal error releasing database connection.");
    }
}
