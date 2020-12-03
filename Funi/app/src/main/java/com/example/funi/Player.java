package com.example.funi;

public class Player {
    public String playerName;
    public String gradeLevel;
    public String subject;
    public Double time;
    public int numCorrect;

    public Player(String playerName, String gradeLevel, String subject, Double time, int numIncorrect) {
        this.playerName = playerName;
        this.gradeLevel = gradeLevel;
        this.subject = subject;
        this.time = time;
        this.numCorrect = (20 - numIncorrect);
    }

    public String getDescription() {
        return (playerName + " " + numCorrect + " " + time);
    }

}
