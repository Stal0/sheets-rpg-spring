package com.stalixo.charsheetspring.dto.request;

import com.stalixo.charsheetspring.domain.User;

import java.io.Serializable;

public class UserRequestDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String email;

    public UserRequestDTO() {
    }

    public UserRequestDTO(User obj) {
        this.username = obj.getUsername();
        this.email = obj.getEmail();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
