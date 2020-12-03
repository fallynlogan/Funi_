package com.example.funi;

import java.util.ArrayList;
import java.util.Arrays;

public class ThirdgradeReadingDecorator extends QuizDecorator{
    public ThirdgradeReadingDecorator(QuizInterface decoratedQuiz) {
        super(decoratedQuiz);
        setQuestions(decoratedQuiz);
    }

    private QuizInterface setQuestions(QuizInterface decoratedQuiz) {
        //butterfly.png
        decoratedQuiz.addQuestion("butterfly", new ArrayList<>(Arrays.asList("buterfly", "butterfly", "betterfly", "butterfli")), "butterfly");
        //banana.png
        decoratedQuiz.addQuestion("banana", new ArrayList<>(Arrays.asList("baannaanna", "banana", "bahnahnah", "bannana")), "banana");
        //sandwich.png
        decoratedQuiz.addQuestion("sandwich", new ArrayList<>(Arrays.asList("sandwhich", "sanwich", "sandwich", "sandwitch")), "sandwich");
        //jellyfish.png
        decoratedQuiz.addQuestion("jellyfish", new ArrayList<>(Arrays.asList("jellyfesh", "jellifish", "jallyfish", "jellyfish")), "jellyfish");
        //globe.png
        decoratedQuiz.addQuestion("globe", new ArrayList<>(Arrays.asList("globe", "gloobe", "glob", "glowb")), "globe");
        //airport.png
        decoratedQuiz.addQuestion("airport", new ArrayList<>(Arrays.asList("aerport", "airport", "aeroport", "aireport")), "airport");
        //farmer.png
        decoratedQuiz.addQuestion("farmer", new ArrayList<>(Arrays.asList("phamir", "farmir", "farmer", "pharmer")), "farmer");
        //birthday.png
        decoratedQuiz.addQuestion("birthday", new ArrayList<>(Arrays.asList("burthday", "berthday", "birfday", "birthday")), "birthday");
        //backpack.png
        decoratedQuiz.addQuestion("backpack", new ArrayList<>(Arrays.asList("bacpac", "backpack", "bakpak", "baacpack")), "backpack");
        //mountain.png
        decoratedQuiz.addQuestion("mountain", new ArrayList<>(Arrays.asList("Mountan", "Mowntain", "Mountain", "Mowntin")), "mountain");
        return decoratedQuiz;
    }

}
