package com.example.flashcards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingClassTest {

    @Test
    void getName() {
        TestingClass test = new TestingClass("LaLaLa");
        assertEquals("LaLaLa", test.getName());
    }

    @Test
    void DoAnithing() {
        TestingClass test2 = new TestingClass();
        assertTrue(test2.doAnything());
    }
}
