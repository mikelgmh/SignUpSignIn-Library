/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Iker
 */
public class User implements Serializable{

    private Integer id;
    private String login;
    private String email;
    private String fullName;
    private UserStatus status;
    private UserPrivilege privilege;
    private String password;
    private Date lastAccess;
    private Date lastPasswordChange;

    public User(Integer id, String login, String email, String fullName, UserStatus status, UserPrivilege privilege, String password, Date lastAccess, Date lastPasswordChange) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.fullName = fullName;
        this.status = status;
        this.privilege = privilege;
        this.password = password;
        this.lastAccess = lastAccess;
        this.lastPasswordChange = lastPasswordChange;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public void setPrivilege(UserPrivilege privilege) {
        this.privilege = privilege;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    public void setLastPasswordChange(Date lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }

    public UserStatus getStatus() {
        return status;
    }

    public UserPrivilege getPrivilege() {
        return privilege;
    }

    public String getPassword() {
        return password;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public Date getLastPasswordChange() {
        return lastPasswordChange;
    }
}