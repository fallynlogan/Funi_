package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondgradeMathDecorator extends QuizDecorator {
    public SecondgradeMathDecorator(QuizInterface decoratedQuiz) {
        super(decoratedQuiz);
        setQuestions(decoratedQuiz);
    }

    private QuizInterface setQuestions(QuizInterface decoratedQuiz) {
        // question 1
        decoratedQuiz.addQuestion("195", new ArrayList<>(Arrays.asList("951", "519", "195", "150")), "secondmath1");
        //question 2
        decoratedQuiz.addQuestion("600", new ArrayList<>(Arrays.asList("660", "640", "650", "670")), "secondmath2");
        // question 3
        decoratedQuiz.addQuestion("210", new ArrayList<>(Arrays.asList("610", "710", "810", "210")), "secondmath3");
        // question 4
        decoratedQuiz.addQuestion("807", new ArrayList<>(Arrays.asList("710", "702", "87", "807")), "secondmath4");
        //question 5
        decoratedQuiz.addQuestion("306", new ArrayList<>(Arrays.asList("706", "806", "306", "506")), "secondmath5");
        // question 6
        decoratedQuiz.addQuestion("100", new ArrayList<>(Arrays.asList("100", "200", "300", "10")), "secondmath6");
        //question 7
        decoratedQuiz.addQuestion("20", new ArrayList<>(Arrays.asList("20", "10", "100", "200")), "secondmath7");
        //question 8
        decoratedQuiz.addQuestion("70", new ArrayList<>(Arrays.asList("170", "180", "80", "70")), "secondmath8");
        // question 9
        decoratedQuiz.addQuestion("9", new ArrayList<>(Arrays.asList("999", "99", "9", "8")), "secondmath9");
        // question 10
        decoratedQuiz.addQuestion("2", new ArrayList<>(Arrays.asList("12", "21", "2", "5")), "secondmath10");
        // question 11
        decoratedQuiz.addQuestion("6", new ArrayList<>(Arrays.asList("6", "7", "66", "77")), "secondmath11");
        // question 12
        decoratedQuiz.addQuestion("2", new ArrayList<>(Arrays.asList("6", "3", "2", "4")), "secondmath12");
        return decoratedQuiz;
    }
}
