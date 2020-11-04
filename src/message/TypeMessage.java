package message;

import java.io.Serializable;

/**
 * An enumeration with all the messages we handle in the applications
 *
 * @author Imanol
 */
public enum TypeMessage implements Serializable {
    SIGN_IN,
    SIGN_UP,
    REGISTER_OK, 
    USER_EXISTS,
    USER_DOES_NOT_EXIST,
    MAIL_EXISTS,
    LOGIN_OK,
    LOGIN_ERROR,
    CONNECTION_ERROR,
    DATABASE_ERROR,
    STOP_SERVER,
    QUERY_ERROR,
    MAX_CONNECTIONS_REACHED;
}
