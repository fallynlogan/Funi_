package com.example.funi;

import java.util.ArrayList;

public class Question {
    private String question;
    private String answer;
    private ArrayList<String> answerChoices;

    public Question() {
        answerChoices = new ArrayList<>();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String quest) {
        question = quest;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String ans) {
        answer = ans;
    }

    public ArrayList<String> getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(ArrayList<String> ansChoices) {
        for(int i =0 ; i < ansChoices.size(); i++) {
            answerChoices.add(ansChoices.get(i));
        }
    }
}
