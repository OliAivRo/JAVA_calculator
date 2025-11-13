package com.example.java_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Objects;

public class CalculatorController {
    @FXML
    private Label displayScreen;

    @FXML
    protected void onButtonClick(ActionEvent event) {

        Button clickedButton = (Button) event.getSource();
        String displayText = displayScreen.getText();


        if (Objects.equals(clickedButton.getText(), "C")) {
            displayScreen.setText("");
        } else if (Objects.equals(clickedButton.getText(), "=")) {
            int result = 0;
        } else {
            displayScreen.setText(displayText + " " + clickedButton.getText());
        }


    }

}
