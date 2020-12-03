package com.example.funi;

public class QuizObserver extends Observer {
    public int numCorrect;
    public int numIncorrect;

    public QuizObserver(QuizInterface quiz) {
        this.quiz = quiz;
        this.quiz.attach(this);
    }

    @Override
    public void updateCorrectAnswers() {
        numCorrect += 1;
    }

    @Override
    public void updateIncorrectAnswers() {
        numIncorrect += 1;
    }
}
