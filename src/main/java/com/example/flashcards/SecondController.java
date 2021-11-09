package com.example.flashcards;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.util.Objects;
import java.util.Random;

public class SecondController {

    @FXML
    private Label lblShow2;

    @FXML
    private Label variantLbl;

    @FXML
    private VBox radioVertical;

    @FXML
    private RadioButton radio1;

    @FXML
    private RadioButton radio2;

    @FXML
    private RadioButton radio3;

    @FXML
    private RadioButton radio4;

    @FXML
    private ToggleGroup radioGroup;

    @FXML
    private AnchorPane hideBottom;

    @FXML
    private VBox hideVB;

    @FXML
    private AnchorPane hideTop;

    @FXML
    private AnchorPane results;

    @FXML
    private Label resultLbl;

    @FXML
    private Separator sep;

    @FXML
    private Label lblShow;

    @FXML
    private Label lblA;

    @FXML
    private Label lblY;

    @FXML
    private Label lblN;

    @FXML
    private Label lblQ;

    @FXML
    private Label labelHideA;

    @FXML
    private ProgressBar pBar;


    Questions[] questions = new Questions[]{
            new Questions("матрица", "матрицей A размера m×n\nназывается прямоугольная таблица\nсодержащая m строк и n столбцов"),
            new Questions("матрица-строка (вектор-строка)", "матрица, содержащая одну строку,\nназывается матрицей-строкой\nили вектором-строкой."),
            new Questions("матрица-столбец (вектор-столбец)", "матрица, содержащая один столбец,\nназывается матрицей-столбцом\nили вектором-столбцом"),
            new Questions("4?", "4"),
            new Questions("5?", "5"),
            new Questions("6?", "6"),
            new Questions("7?", "7"),
            new Questions("8?", "8"),
            new Questions("9?", "9"),
            new Questions("10?", "10"),
            new Questions("11?", "11"),
            new Questions("12?", "12"),
            new Questions("13?", "13"),
            new Questions("14?", "14"),
            new Questions("15?", "15"),
            new Questions("16?", "16"),
            new Questions("17?", "17"),
            new Questions("18?", "18"),
            new Questions("19?", "19"),
            new Questions("20?", "20")
    };

    //Влад
}