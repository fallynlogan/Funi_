package com.example.funi;

public abstract class Observer {
    protected QuizInterface quiz;
    public abstract void updateCorrectAnswers();
    public abstract void updateIncorrectAnswers();
}
