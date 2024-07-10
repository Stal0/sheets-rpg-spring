package com.stalixo.charsheetspring.dto;

import com.stalixo.charsheetspring.domain.User;

import java.io.Serializable;
import java.util.Objects;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String username;
    private String email;

    public UserDTO() {
    }

    public UserDTO(User obj) {
        this.id = obj.getId();
        this.username = obj.getUsername();
        this.email = obj.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
