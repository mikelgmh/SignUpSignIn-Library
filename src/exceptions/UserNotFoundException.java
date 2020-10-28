/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import message.TypeMessage;
import user.User;

/**
 *
 * @author Iker de la Cruz
 */
public class UserNotFoundException extends Exception implements ExceptionMethods {

    private final TypeMessage messageType = TypeMessage.USER_DOES_NOT_EXIST;

    public UserNotFoundException(User user) {
        super("The inserted user does not exist in the database.");
    }

    @Override
    public TypeMessage getMessageType() {
        return messageType;
    }

}
