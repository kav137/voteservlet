package com.kav.vote;

/**
 * Created by kav on 01.04.2016.
 */
public class Candidate {
    private String name;
    private int voices = 0;

    Candidate(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    public int getVoices() {
        return voices;
    }

    public void voteFor() {
        voices++;
    }
}
