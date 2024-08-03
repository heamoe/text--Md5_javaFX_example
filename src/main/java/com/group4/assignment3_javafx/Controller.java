package com.group4.assignment3_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField inputField;

    @FXML
    private Button processButton;

    @FXML
    private TextArea resultTextArea;

    @FXML
    private void initialize() {
        resultTextArea.setText("Result will be displayed here.");

        processButton.setOnAction(e -> {
            String inputText = inputField.getText();
            if (inputText.isEmpty()) {
                resultTextArea.setText("Please enter some text.");
                return;
            }

            String hashedText = Model.md5Hash(inputText);
            resultTextArea.setText(hashedText);
        });
    }
}
