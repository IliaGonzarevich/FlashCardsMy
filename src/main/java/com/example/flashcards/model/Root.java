package com.example.flashcards.model;

import java.util.List;

public class Root {

    private List<Questions> questions;

    public List<Questions> getQuestions() {
        return questions;
    }

    @Override
    public String toString() {
        return "Root{" +
                "questions=" + questions +
                '}';
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }
}
