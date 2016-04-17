package com.kav.vote;

/**
 * Created by kav on 01.04.2016.
 */
public class Elector extends User {
    private boolean voted = false;

    Elector(String _name, String _login, String _password) {
        super(_name, _login, _password);
    }

    public void vote() {
        voted = true;
    }

    public boolean isVoted() {
        return voted;
    }
}
