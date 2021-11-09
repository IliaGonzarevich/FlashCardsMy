package com.example.flashcards;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Window {
    public static void NewWindow(String title) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        Pane pane = new Pane();
        Button btn = new Button("close");
        btn.setOnAction(event-> window.close());
        pane.getChildren().add(btn);
        Scene scene = new Scene(pane,100,100);
        window.setScene(scene);
        window.setTitle(title);
        window.showAndWait();
    }
}
