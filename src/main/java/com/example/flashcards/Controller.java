package com.example.flashcards;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Controller {

    @FXML
    private Button clickThat;

    @FXML
    private AnchorPane anchor1;

    @FXML
    private AnchorPane anchor2;

    @FXML
    private Button button;

    @FXML
    private ToggleGroup radioGroup;

    @FXML
    private RadioButton radio1;

    @FXML
    private RadioButton radio2;

    @FXML
    Questions[] questions = new Questions[] {
            new Questions("Логика - наука?", new String[] {"Да", "Нет"}),
            new Questions("Политология наука?", new String[] {"Да", "Нет"})
    };

    private int nowQuestion = 0;
    private int correctAnswer;

    public int getNowQuestion() {
        return nowQuestion;
    }

    @FXML
    void initialize() {

        anchor2.setVisible(false);
        radio1.setText(questions[0].getAnswers()[1]);
        radio2.setText(questions[0].getAnswers()[0]);
        button.setText(questions[0].getQuestion());

        button.setOnAction(event -> {
            //нажали на кнопку

            RadioButton selectedRadio = (RadioButton) radioGroup.getSelectedToggle();
            if (selectedRadio != null) {
                String toggleGroupValue = selectedRadio.getText();

                if (toggleGroupValue.equals(questions[nowQuestion].correctAnswer())){
                    correctAnswer++;
                }

                if(nowQuestion +1 != questions.length){
                    nowQuestion++;

                    button.setText(questions[nowQuestion].getQuestion());
                    String[] answers = questions[nowQuestion].getAnswers();

                    List<String> stringList = Arrays.asList(answers);
                    Collections.shuffle(stringList);

                    radio1.setText(stringList.get(0));
                    radio2.setText(stringList.get(1));

                    selectedRadio.setSelected(false);
                } else{
                    anchor1.setVisible(false);
                    anchor2.setVisible(true);

                }
            }

        });


    }
}
