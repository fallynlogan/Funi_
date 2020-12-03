package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class KindergartenReadingDecorator extends QuizDecorator{
    public KindergartenReadingDecorator(QuizInterface decoratedQuiz) {
        super(decoratedQuiz);
        setQuestions(decoratedQuiz);
    }

    private QuizInterface setQuestions(QuizInterface decoratedQuiz) {
        decoratedQuiz.addQuestion("hat", new ArrayList<>(Arrays.asList("hat", "pat", "cat", "bat")), "hat");
        decoratedQuiz.addQuestion("cat", new ArrayList<>(Arrays.asList("bat", "cat", "cta", "fat")), "cat");
        decoratedQuiz.addQuestion("car", new ArrayList<>(Arrays.asList("car", "bar", "rac", "arc")), "car");
        decoratedQuiz.addQuestion("jar", new ArrayList<>(Arrays.asList("jra", "raj", "car", "jar")), "jar");
        decoratedQuiz.addQuestion("bus", new ArrayList<>(Arrays.asList("but", "bus", "sub", "bes")), "bus");
        decoratedQuiz.addQuestion("ham", new ArrayList<>(Arrays.asList("ham", "hame", "home", "hom")), "ham");
        decoratedQuiz.addQuestion("book", new ArrayList<>(Arrays.asList("cook", "book", "buuk", "cuuk")), "book");
        decoratedQuiz.addQuestion("bird", new ArrayList<>(Arrays.asList("bird", "burd", "berd", "bord")), "bird");
        decoratedQuiz.addQuestion("ball", new ArrayList<>(Arrays.asList("baull", "bawl", "ball", "boll")), "ball");
        decoratedQuiz.addQuestion("rat", new ArrayList<>(Arrays.asList("tat", "rat", "art", "tar")), "rat");
        return decoratedQuiz;
    }

}
