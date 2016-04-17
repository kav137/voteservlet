package com.kav.vote;

/**
 * Created by kav on 01.04.2016.
 */
public class User {
    private String name;
    private String login;
    private String password;

    public User(String _name, String _login, String _password) {
        name = _name;
        login = _login;
        password = _password;
    }

    public boolean signUp(String _login, String _password) {
        if (login.equals(_login) && password.equals(_password)) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }
}
