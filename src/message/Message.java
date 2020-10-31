/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import java.io.Serializable;
import user.User;

/**
 *
 * @author Imanol
 */
public class Message implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private User user;
    private TypeMessage type;

    public Message(User user, TypeMessage type) {
        this.user = user;
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public TypeMessage getType() {
        return type;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setType(TypeMessage type) {
        this.type = type;
    }

}
