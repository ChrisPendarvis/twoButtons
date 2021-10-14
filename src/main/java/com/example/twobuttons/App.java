package com.example.twobuttons;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class App {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}