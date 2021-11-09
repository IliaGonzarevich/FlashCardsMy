package com.example.flashcards;

import javafx.fxml.FXML;

public class FirstController {

    @FXML
    protected void showWindow() throws Exception {
        Second second = new Second();
        second.showWindow();
    }
}
