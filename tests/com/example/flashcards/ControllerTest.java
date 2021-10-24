package com.example.flashcards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void initialize() {
        Questions[] questions = new Questions[] {
                new Questions("Логика - наука?", new String[] {"Да", "Нет"}),
                new Questions("Политология наука?", new String[] {"Да", "Нет"})
        };
        assertEquals("Логика - наука?", questions[0].getQuestion());
    }
}