package com.example.assignment8neu;

import javafx.scene.control.Alert;

public class CalcPlugin implements Plugin {
    private InputProvider application;

    public void setApplication(InputProvider app) {
        this.application = app;
    }

    public String getButtonText() {
        return "calculate";
    }

    public String getInitialText() {
        return "10 / 2 + 6";
    }

    public void buttonClicked() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("");
        alert.setHeaderText(null);
        alert.setContentText("The result of " + application.getInput() + " is 11");

    }

    public String getApplicationTitle() {
        return "My Great Calculator";
    }
}
