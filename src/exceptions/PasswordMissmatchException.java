/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import message.TypeMessage;

/**
 *
 * @author Iker de la Cruz
 */
public class PasswordMissmatchException extends Exception implements ExceptionMethods {

    private final TypeMessage messageType = TypeMessage.CONNECTION_ERROR;

    public PasswordMissmatchException(String password) {
        super("The password inserted doesn't match.");
    }

    @Override
    public TypeMessage getMessageType() {
        return messageType;
    }
}
