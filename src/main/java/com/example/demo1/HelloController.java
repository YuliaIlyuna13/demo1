package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private TextField text1;
    @FXML
    private TextArea ar;


    @FXML
    public void clickButton1(ActionEvent event1){

        String s=text1.getText();
        ar.appendText(s+"\n");
                text1.setText("");
    }

    @FXML
    private void enterPress(ActionEvent event){
        text1.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode()==KeyCode.ENTER){
            String n = text1.getText();
                ar.appendText(n+"\n");
                text1.setText("");
            }
        });
    }


    public void initialize(URL url, ResourceBundle resourceBundle){
        ar.setEditable(false);
        text1.requestFocus();
    }
}