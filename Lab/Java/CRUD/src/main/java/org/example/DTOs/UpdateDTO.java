package org.example.dtos;

public class UpdateDTO {;
    private String email;
    private String userName;

    public boolean validate(){
        return email != null && !email.isBlank() &&
                userName != null && !userName.isBlank();
    }

    public UpdateDTO(String email, String userName) {
        this.email = email;
        this.userName = userName;
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
