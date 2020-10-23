/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.util.Date;

/**
 *
 * @author Iker
 */
public class User {

    private Integer id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private Boolean status;
    private Integer privilege;
    private String password;
    private Date lastAccess;
    private Date lastPasswordChange;

    public User(Integer id, String firstName, String lastName, String email, String fullName, Boolean status, Integer privilege, String password, Date lastAccess, Date lastPasswordChange) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public void setUsername(String login) {
        this.username = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setPrivilege(Integer privilege) {
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

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }

    public Boolean getStatus() {
        return status;
    }

    public Integer getPrivilege() {
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
