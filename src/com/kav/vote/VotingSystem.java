package com.kav.vote;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by kav on 01.04.2016.
 */
public class VotingSystem {
    private ArrayList<Elector> users = new ArrayList<>();
    private Voting currentVoting;

    protected void AddUser(Elector elector) {
        users.add(elector);
    }

    public void addCandidate(Candidate cand) {
        currentVoting.AddCandidate(cand);
    }

    public Voting getVoting() {
        return currentVoting;
    }

    public void setVoting(Voting voting) {
        currentVoting = voting;
    }

    protected Elector FindUser(String _login) {
        for (Elector user : users) {
            if (user.getLogin().equals(_login)) {
                return user;
            }
        }
        return null;
    }

    protected HashMap getResult() {
        HashMap<String, Integer> results = new HashMap<>();
        for (Candidate cand : currentVoting.getCandidates()) {
            results.put(cand.getName(), cand.getVoices());
        }
        return results;
    }
}
