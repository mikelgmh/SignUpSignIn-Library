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
public class ErrorConnectingDatabaseException extends Exception implements ExceptionMethods{

    private final TypeMessage messageType = TypeMessage.DATABASE_ERROR;

    public ErrorConnectingDatabaseException() {
        super("Error connecting database.");
    }

    @Override
    public TypeMessage getMessageType() {
        return messageType;
    }

}
