package com.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "test")
public class UserEntity {

    @Id
    @JsonIgnore
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "user")
    private String user;

    @Column(name = "pass")
    private String pass;

}
