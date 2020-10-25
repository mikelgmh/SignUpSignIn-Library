/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import java.io.Serializable;

/**
 *
 * @author Imanol
 */
public enum TypeMessage implements Serializable {
    SIGN_IN,
    SIGN_UP,
    REGISTER_OK, 
    USER_EXISTS,
    MAIL_EXISTS,
    LOGIN_OK,
    LOGIN_ERROR,
    CONNECTION_ERROR, 
    STOP_SERVER,
    MAX_CONNECTIONS_REACHED;
}
