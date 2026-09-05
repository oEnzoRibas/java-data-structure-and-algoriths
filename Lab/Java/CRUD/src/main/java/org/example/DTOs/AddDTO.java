package org.example.dtos;

public class AddDTO {;

    private String login;
    private String email;
    private String userName;

    public boolean validate(){
        return login != null && !login.isBlank() &&
                email != null && !email.isBlank() &&
                userName != null && !userName.isBlank();
    }

    public AddDTO(String login, String email, String userName) {
        this.login = login;
        this.email = email;
        this.userName = userName;
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
}
