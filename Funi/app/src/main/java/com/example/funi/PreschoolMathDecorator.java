package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class PreschoolMathDecorator extends QuizDecorator {
    public PreschoolMathDecorator(QuizInterface decoratedQuiz) {
        super(decoratedQuiz);
        setQuestions(decoratedQuiz);
    }

    private QuizInterface setQuestions(QuizInterface decoratedQuiz) {
        decoratedQuiz.addQuestion("1", new ArrayList<>(Arrays.asList("0", "1", "2", "3")), "math1");
        decoratedQuiz.addQuestion("4", new ArrayList<>(Arrays.asList("3", "8", "4", "2")), "math4");
        decoratedQuiz.addQuestion("9", new ArrayList<>(Arrays.asList("6", "7", "9", "4")), "math9");
        decoratedQuiz.addQuestion("6", new ArrayList<>(Arrays.asList("9", "2", "6", "5")), "math6");
        decoratedQuiz.addQuestion("3", new ArrayList<>(Arrays.asList("3", "5", "9", "4")), "math3");
        //decoratedQuiz.addQuestion("10", new ArrayList<>(Arrays.asList("0", "2", "1", "10")), "math10");
        decoratedQuiz.addQuestion("5", new ArrayList<>(Arrays.asList("0", "7", "10", "5")), "math5");
        decoratedQuiz.addQuestion("7", new ArrayList<>(Arrays.asList("0", "7", "4", "2")), "math7");
        decoratedQuiz.addQuestion("2", new ArrayList<>(Arrays.asList("2", "3", "4", "5")), "math2");
        decoratedQuiz.addQuestion("8", new ArrayList<>(Arrays.asList("7", "8", "9", "10")), "math8");
        return decoratedQuiz;
    }
}
