package com.example.funi;

import java.util.ArrayList;

public abstract class QuizDecorator implements QuizInterface{
    protected QuizInterface decoratedQuiz;

    public QuizDecorator(QuizInterface decoratedQuiz) {
        this.decoratedQuiz = decoratedQuiz;
    }

    public void addQuestion(String answer, ArrayList<String> answerChoices, String question) {
        decoratedQuiz.addQuestion(answer, answerChoices, question);
    }

    public Question getCurrentQuestion() {
        return decoratedQuiz.getCurrentQuestion();
    }

    public QuizInterface getQuiz() {
        return decoratedQuiz.getQuiz();
    }

    public Boolean getHasEnded() {
        return decoratedQuiz.getHasEnded();
    }

    public Question getNextQuestion() {
       return decoratedQuiz.getNextQuestion();
    }

    public Question checkAnswer(String chosenAnswer) {
        return decoratedQuiz.checkAnswer(chosenAnswer);
    }

    public void attach(Observer observer) {
        decoratedQuiz.attach(observer);
    }

    public void notifyAllObservers(Boolean correct) {
        decoratedQuiz.notifyAllObservers(correct);
    }
}
