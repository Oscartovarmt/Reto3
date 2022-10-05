package com.doctors.model;

import javax.persistence.*;

@Entity
@Table(name = "usersAdmin")

public class AdminUsersModel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Integer id;
    private String name;
    private String email;
    private String password;

    public AdminUsersModel(){
    }

    public AdminUsersModel(Integer id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AdminUsersModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                '}';
    }




}
