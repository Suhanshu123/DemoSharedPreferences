package com.example.suhanshu.demosharedpreferences;

public class ModelClass  {
    String username_model;
    String password_model;

    public ModelClass() {
    }

    public ModelClass(String username_model, String password_model) {
        this.username_model = username_model;
        this.password_model = password_model;
    }

    public String getUsername_model() {
        return username_model;
    }

    public void setUsername_model(String username_model) {
        this.username_model = username_model;
    }

    public String getPassword_model() {
        return password_model;
    }

    public void setPassword_model(String password_model) {
        this.password_model = password_model;
    }
}
