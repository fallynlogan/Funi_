package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class ThirdgradeMathDecorator extends QuizDecorator {
    public ThirdgradeMathDecorator(QuizInterface decoratedQuiz) {
        super(decoratedQuiz);
        setQuestions(decoratedQuiz);
    }

    private QuizInterface setQuestions(QuizInterface decoratedQuiz) {
        //ans 223
        decoratedQuiz.addQuestion("223", new ArrayList<>(Arrays.asList("222", "223", "332", "123")), "thirdmath1");
        // ans 440
        decoratedQuiz.addQuestion("440", new ArrayList<>(Arrays.asList("440", "640", "450", "470")), "thirdmath2");
        // ans 21
        decoratedQuiz.addQuestion("21", new ArrayList<>(Arrays.asList("51", "20", "21", "31")), "thirdmath3");
        // ans 23
        decoratedQuiz.addQuestion("23", new ArrayList<>(Arrays.asList("23", "32", "232", "323")), "thirdmath4");
        // ans 90
        decoratedQuiz.addQuestion("90", new ArrayList<>(Arrays.asList("900", "90", "800", "80")), "thirdmath5");
        // ans 25
        decoratedQuiz.addQuestion("25", new ArrayList<>(Arrays.asList("51", "25", "52", "255")), "thirdmath6");
        // ans 36
        decoratedQuiz.addQuestion("36", new ArrayList<>(Arrays.asList("63", "636", "36", "363")), "thirdmath7");
        // ans 25
        decoratedQuiz.addQuestion("25", new ArrayList<>(Arrays.asList("25", "2", "5", "52")), "thirdmath8");
        // ans 16
        decoratedQuiz.addQuestion("16", new ArrayList<>(Arrays.asList("61", "16", "51", "15")), "thirdmath9");
        // ans 7
        decoratedQuiz.addQuestion("7", new ArrayList<>(Arrays.asList("77", "7", "676", "6")), "thirdmath10");
        // ans 2
        decoratedQuiz.addQuestion("2", new ArrayList<>(Arrays.asList("222", "22", "3", "2")), "thirdmath11");
        // ans 3
        decoratedQuiz.addQuestion("3", new ArrayList<>(Arrays.asList("3", "33", "2", "22")), "thirdmath12");
        return decoratedQuiz;
    }
}
