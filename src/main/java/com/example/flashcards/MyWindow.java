package com.example.flashcards;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class MyWindow {
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Button btn = new Button("new window");
        btn.setOnAction(event ->Window.NewWindow("Second Window") );
        root.getChildren().add(btn);

        Scene scene = new Scene(root,600,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("baseWindow");
        primaryStage.show();
    }
}
