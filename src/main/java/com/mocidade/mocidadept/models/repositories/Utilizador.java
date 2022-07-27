package com.mocidade.mocidadept.models.repositories;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "utilizador")
public class Utilizador {

    @Id  //Obrigatório possuir ID
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name = "user_id") private int id;
    @Column(name = "user_name") private String username;
    @Column(name = "user_password") private String password;
    @Column(name = "user_creation_date") private String data;
    @Column(name = "user_tipo_id") private int role;
    

    public Utilizador(){


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
}

