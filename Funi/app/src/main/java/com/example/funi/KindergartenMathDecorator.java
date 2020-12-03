package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class KindergartenMathDecorator extends QuizDecorator {
    public KindergartenMathDecorator(QuizInterface decoratedQuiz) {
        super(decoratedQuiz);
        setQuestions(decoratedQuiz);
    }

    private QuizInterface setQuestions(QuizInterface decoratedQuiz) {
        decoratedQuiz.addQuestion("14", new ArrayList<>(Arrays.asList("14", "34", "4", "15")), "kmath1");
        decoratedQuiz.addQuestion("9", new ArrayList<>(Arrays.asList("8", "9", "7", "10")),  "kmath2");
        decoratedQuiz.addQuestion("0", new ArrayList<>(Arrays.asList("18", "1", "0", "9")), "kmath3");
        decoratedQuiz.addQuestion("39", new ArrayList<>(Arrays.asList("50", "401", "41", "39")), "kmath4");
        decoratedQuiz.addQuestion("94", new ArrayList<>(Arrays.asList("94", "95", "106", "104")), "kmath5");
        decoratedQuiz.addQuestion("100", new ArrayList<>(Arrays.asList("1", "100", "50", "10")), "kmath6");
        decoratedQuiz.addQuestion("88", new ArrayList<>(Arrays.asList("44", "4444", "88", "888")), "kmath7");
        decoratedQuiz.addQuestion("27", new ArrayList<>(Arrays.asList("21", "1", "28", "27")), "kmath8");
        decoratedQuiz.addQuestion("13", new ArrayList<>(Arrays.asList("13", "130", "1000", "10")), "kmath9");
        decoratedQuiz.addQuestion("68", new ArrayList<>(Arrays.asList("86", "338", "68", "8")), "kmath10");
        return decoratedQuiz;
    }
}
