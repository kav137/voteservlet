package com.kav.vote;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kav on 01.04.2016.
 */
public class Voting {
    private String title;
    private ArrayList<Candidate> candidates;

    Voting(String _title, ArrayList<Candidate> list) {
        title = _title;
        candidates = list;
    }

    public String getTitle() {
        return title;
    }

    public Candidate getCandidate(String name) {
        for (Candidate cand : candidates) {
            if (cand.getName().equals(name)) {
                return cand;
            }
        }
        throw new IllegalStateException();
    }

    public ArrayList<Candidate> getCandidates() {
        return candidates;
    }

    public void AddCandidate(Candidate cand) {
        candidates.add(cand);
    }
}
