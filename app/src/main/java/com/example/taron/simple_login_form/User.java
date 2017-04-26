package com.example.taron.simple_login_form;

/**
 * Created by Taron on 04/24/17.
 */
public class User {

    public int id;
    public String username;
    public String password;
    public String fullName;

    public User(int id, String username, String password, String fullName) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.id = id;
    }
}
