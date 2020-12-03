package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class PreschoolReadingDecorator extends QuizDecorator{
    public PreschoolReadingDecorator(QuizInterface decoratedQuiz) {
        super(decoratedQuiz);
        setQuestions(decoratedQuiz);
    }

    private QuizInterface setQuestions(QuizInterface decoratedQuiz) {
        decoratedQuiz.addQuestion("A", new ArrayList<>(Arrays.asList("A", "B", "C", "D")), "a");
        decoratedQuiz.addQuestion("E", new ArrayList<>(Arrays.asList("E", "F", "G", "H")), "e");
        decoratedQuiz.addQuestion("I", new ArrayList<>(Arrays.asList("I", "J", "K", "L")), "i");
        decoratedQuiz.addQuestion("M", new ArrayList<>(Arrays.asList("M", "N", "O", "P")), "m");
        decoratedQuiz.addQuestion("Q", new ArrayList<>(Arrays.asList("Q", "R", "S", "T")), "q");
        decoratedQuiz.addQuestion("U", new ArrayList<>(Arrays.asList("U", "V", "W", "X")), "u");
        decoratedQuiz.addQuestion("Y", new ArrayList<>(Arrays.asList("Y", "Z", "A", "B")), "y");
        decoratedQuiz.addQuestion("ABCD", new ArrayList<>(Arrays.asList("ACBD","ABCD","ADCB","BACD")), "abcd");
        decoratedQuiz.addQuestion("EFGH", new ArrayList<>(Arrays.asList("EFGH","HGFE","FGHE","EGFH")), "efgh");
        decoratedQuiz.addQuestion("IJKL", new ArrayList<>(Arrays.asList("LKJI","KJIL","IKJL","IJKL")), "ijkl");
        return decoratedQuiz;
    }

}
