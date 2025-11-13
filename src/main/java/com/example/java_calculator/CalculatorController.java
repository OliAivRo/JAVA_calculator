package com.example.java_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {
    @FXML
    private Label displayScreen;

    @FXML
    private Label calculationSequence;

    private double num1;
    private boolean num1Stored;

    private double num2;
    private boolean num2Stored;

    private String operator;
    private boolean operatorStored;


    public void onNumberClick(ActionEvent event) {

        Button clickedButton = (Button) event.getSource();
        String displayText = calculationSequence.getText();
        String buttonText = clickedButton.getText();

        if (!num1Stored) {
            num1 = Double.parseDouble(buttonText);
            num1Stored = true;
            calculationSequence.setText(buttonText);
        } else if (!num2Stored) {
            num2 = Double.parseDouble(buttonText);
            num2Stored = true;
            // TODO: f(x) to calculate
            // TODO: f(x) to add/remove to calculationSequence
            double result = num1 + num2;
            calculationSequence.setText(Double.toString(num1) + " " + operator + " " + Double.toString(num2));
            displayScreen.setText(Double.toString(result));
        }
    }

    public void onOperatorClick(ActionEvent event) {

        Button clickedButton = (Button) event.getSource();
        String displayText = displayScreen.getText();
        String buttonText = clickedButton.getText();

        switch (buttonText) {
            case "CE":
                if (num1Stored && num2Stored) {
                    num2Stored = false;
                    calculationSequence.setText(Double.toString(num1) + " " + operator);
                    displayScreen.setText("");
                } else if (num1Stored && operatorStored) {
                    operatorStored = false;
                    operator = "";
                    calculationSequence.setText(Double.toString(num1));
                } else if (num1Stored) {
                    num1Stored = false;
                    calculationSequence.setText("");
                }
                break;
            case "+":
                operatorStored = true;
                operator = buttonText;
                calculationSequence.setText(Double.toString(num1) + " " + operator);
                break;
        }


    }

}
