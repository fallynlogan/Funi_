package com.example.funi;
import java.util.ArrayList;
import java.util.Iterator;

public interface QuizInterface {
    void addQuestion(String answer, ArrayList<String> answerChoices, String question);
    QuizInterface getQuiz();
    Question getCurrentQuestion();
    Question getNextQuestion();
    Question checkAnswer(String chosenAnswer);
    Boolean getHasEnded();
    void notifyAllObservers(Boolean correct);
    void attach(Observer observer);
}
