package org.example.models;

import org.example.dtos.UpdateDTO;

public class User {
    private String login;
    private String email;
    private String userName;
    private String id;

    public User(String login, String email, String userName, String id) {
        this.login = login;
        this.email = email;
        this.userName = userName;
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void update(UpdateDTO updateDTO){
        setEmail(updateDTO.getEmail());
        setUserName(updateDTO.getUserName());
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

}


