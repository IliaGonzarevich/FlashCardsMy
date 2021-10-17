package com.example.flashcards;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Button Ilyabtn;

    @FXML
    private Label Ilyalbl;



    @FXML
    void initialize(){
        Ilyabtn.setOnMouseClicked(mouseEvent -> {
            Ilyalbl.setText("Ilya is here!");
        });

    }
}