package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondgradeReadingDecorator extends QuizDecorator{
    public SecondgradeReadingDecorator(QuizInterface decoratedQuiz) {
        super(decoratedQuiz);
        setQuestions(decoratedQuiz);
    }

    private QuizInterface setQuestions(QuizInterface decoratedQuiz) {
        decoratedQuiz.addQuestion("library", new ArrayList<>(Arrays.asList("library", "liebrary", "lybrary", "librari")), "library");
        decoratedQuiz.addQuestion("pirate", new ArrayList<>(Arrays.asList("pirate", "pilot", "pyrate", "pirit")), "pirate");
        decoratedQuiz.addQuestion("officer", new ArrayList<>(Arrays.asList("oficer", "officer", "offiser", "ophicer")), "officer");
        decoratedQuiz.addQuestion("printer", new ArrayList<>(Arrays.asList("prenter", "printer", "prentir", "printa")), "printer");
        decoratedQuiz.addQuestion("science", new ArrayList<>(Arrays.asList("siense", "seyeince", "syence", "science")), "science");
        decoratedQuiz.addQuestion("walking", new ArrayList<>(Arrays.asList("walking", "wahking", "walcing", "wallking")), "walking");
        decoratedQuiz.addQuestion("chicken", new ArrayList<>(Arrays.asList("chiken", "chicken", "thicken", "chikken")), "chicken");
        decoratedQuiz.addQuestion("factory", new ArrayList<>(Arrays.asList("factory", "facktory", "facrty", "phactory")), "factory");
        decoratedQuiz.addQuestion("kitchen", new ArrayList<>(Arrays.asList("citchen", "kitchen", "kittchen", "cittchen")), "kitchen");
        decoratedQuiz.addQuestion("treasure", new ArrayList<>(Arrays.asList("tregure", "trehjur", "treasure", "tresure")), "treasure");
        return decoratedQuiz;
    }

}
