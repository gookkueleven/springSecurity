package com.example.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserModel {

    @JsonIgnore
    private int Id;

    @JsonProperty(value = "user")
    private String user;

    @JsonProperty(value = "pass")
    private String pass;
}
