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
    private Button Vladbtn;

    @FXML
    private Label Vladlbl;


    @FXML
    private Button Tonyabtn;

    @FXML
    private Label Tonyalbl;
    
    @FXML
    void initialize(){
        Ilyabtn.setOnMouseClicked(mouseEvent -> {
            Ilyalbl.setText("Ilya is here!");
        });
        
        Vladbtn.setOnMouseClicked(mouseEvent -> {
            Vladlbl.setText("Vlad is here!");
        });
        
        Tonyabtn.setOnMouseClicked(mouseEvent -> {
            Tonyalbl.setText("Tonya is here!");
        });
    }
}
