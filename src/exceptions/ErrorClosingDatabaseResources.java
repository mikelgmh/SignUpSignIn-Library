/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Usuario
 */
public class ErrorClosingDatabaseResources extends Exception {
    
    public ErrorClosingDatabaseResources() {
        super("Fatal error releasing database connection.");
    }
}
