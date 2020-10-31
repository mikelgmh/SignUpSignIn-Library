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
public class ErrorConnectingServerException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ErrorConnectingServerException() {
        super("Error trying to access database.");
    }
}
