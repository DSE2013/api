// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.xebia.wartelist.domain;

import com.xebia.wartelist.domain.Notification;
import com.xebia.wartelist.domain.User;
import java.util.Set;

privileged aspect User_Roo_JavaBean {
    
    public String User.getEmail() {
        return this.email;
    }
    
    public void User.setEmail(String email) {
        this.email = email;
    }
    
    public String User.getPassword() {
        return this.password;
    }
    
    public void User.setPassword(String password) {
        this.password = password;
    }
    
    public String User.getName() {
        return this.name;
    }
    
    public void User.setName(String name) {
        this.name = name;
    }
    
    public String User.getRole() {
        return this.role;
    }
    
    public void User.setRole(String role) {
        this.role = role;
    }
    
    public Set<Notification> User.getNotification() {
        return this.notification;
    }
    
    public void User.setNotification(Set<Notification> notification) {
        this.notification = notification;
    }
    
}
