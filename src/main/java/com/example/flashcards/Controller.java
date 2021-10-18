package com.example.flashcards;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Button ilyaBtn;

    @FXML
    private Label ilyaLbl;

    @FXML
    private Button vladBtn;

    @FXML
    private Label vladLbl;


    @FXML
    private Button tonyaBtn;

    @FXML
    private Label tonyaLbl;
    
    @FXML
    void initialize(){
        ilyaBtn.setOnMouseClicked(mouseEvent -> {
            ilyaLbl.setText("Ilya is here!");
        });
        
        vladBtn.setOnMouseClicked(mouseEvent -> {
            vladLbl.setText("Vlad is here!");
        });
        
        tonyaBtn.setOnMouseClicked(mouseEvent -> {
            tonyaLbl.setText("Tonya is here!");
        });
    }
}
