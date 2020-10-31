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
public class QueryException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public QueryException() {
        super("Query error.");

    }
}
