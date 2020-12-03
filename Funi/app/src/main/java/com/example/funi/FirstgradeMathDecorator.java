package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstgradeMathDecorator extends QuizDecorator {
    public FirstgradeMathDecorator(QuizInterface decoratedQuiz) {
        super(decoratedQuiz);
        setQuestions(decoratedQuiz);
    }

    private QuizInterface setQuestions(QuizInterface decoratedQuiz) {
        decoratedQuiz.addQuestion("900", new ArrayList<>(Arrays.asList("1000", "890", "899", "900")), "firstmath1");
        decoratedQuiz.addQuestion("650", new ArrayList<>(Arrays.asList("660", "640", "650", "670")), "firstmath2");
        decoratedQuiz.addQuestion("8", new ArrayList<>(Arrays.asList("8", "18", "0", "9")), "firstmath3");
        decoratedQuiz.addQuestion("800", new ArrayList<>(Arrays.asList("800", "700", "600", "750")), "firstmath4");
        decoratedQuiz.addQuestion("251", new ArrayList<>(Arrays.asList("151", "250", "251", "351")), "firstmath5");
        decoratedQuiz.addQuestion("700", new ArrayList<>(Arrays.asList("600", "700", "800", "7")), "firstmath6");
        decoratedQuiz.addQuestion("700", new ArrayList<>(Arrays.asList("600", "700", "800", "722")), "firstmath7");
        decoratedQuiz.addQuestion("300", new ArrayList<>(Arrays.asList("300", "200", "100", "400")), "firstmath8");
        decoratedQuiz.addQuestion("71", new ArrayList<>(Arrays.asList("71", "72", "62", "61")), "firstmath9");
        decoratedQuiz.addQuestion("333", new ArrayList<>(Arrays.asList("332", "333", "323", "322")), "firstmath10");
        return decoratedQuiz;
    }
}
