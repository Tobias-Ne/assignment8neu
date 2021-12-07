package com.example.assignment8neu;

import javafx.scene.control.Alert;

public class PingPlugin implements Plugin {
    private InputProvider application;

    public void setApplication(InputProvider app) {
        this.application = app;
    }

    public String getButtonText() {
        return "ping";
    }

    public String getInitialText() {
        return "127.0.0.1";
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
