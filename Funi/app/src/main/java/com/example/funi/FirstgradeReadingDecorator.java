package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstgradeReadingDecorator extends QuizDecorator{
    public FirstgradeReadingDecorator(QuizInterface decoratedQuiz) {
        super(decoratedQuiz);
        setQuestions(decoratedQuiz);
    }

    private QuizInterface setQuestions(QuizInterface decoratedQuiz) {
        //question 1
        decoratedQuiz.addQuestion("truck", new ArrayList<>(Arrays.asList("truck", "truk", "trruck", "trukc")), "truck");
        //question 2
        decoratedQuiz.addQuestion("popcorn", new ArrayList<>(Arrays.asList("pepcorn", "popcorn", "popkorn", "poppcorn")), "popcorn");
        //question 3
        decoratedQuiz.addQuestion("flower", new ArrayList<>(Arrays.asList("phlawer", "flawer", "flower", "phlower")), "flower");
        //question 4
        decoratedQuiz.addQuestion("star", new ArrayList<>(Arrays.asList("star", "starr", "stare", "stir")), "star");
        //question 5
        decoratedQuiz.addQuestion("cake", new ArrayList<>(Arrays.asList("kake", "cake", "cakke", "caake")), "cake");
        //question 6
        decoratedQuiz.addQuestion("eyes", new ArrayList<>(Arrays.asList("iyes", "eeyes", "eyees", "eyes")), "eyes");
        //question 7
        decoratedQuiz.addQuestion("fire", new ArrayList<>(Arrays.asList("fire", "fyer", "phire", "phyer")), "fire");
        //question 8
        decoratedQuiz.addQuestion("house", new ArrayList<>(Arrays.asList("howse", "hose", "house", "hoose")), "house");
        //question 9
        decoratedQuiz.addQuestion("lock", new ArrayList<>(Arrays.asList("lock", "locc", "look", "lick")), "lock");
        //question 10
        decoratedQuiz.addQuestion("panda", new ArrayList<>(Arrays.asList("panduh", "panda", "pandu", "pande")), "panda");
        return decoratedQuiz;
    }

}
