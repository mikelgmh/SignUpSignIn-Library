/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import user.User;

/**
 *
 * @author 2dam
 */
public interface Signable {
    
    public User signIn(User user);
    public User signUp(User user);
    
}
