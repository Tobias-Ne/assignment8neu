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
        alert.setContentText("The ping to " + application.getInput() + " is 0ms");
        alert.show();

    }

    public String getApplicationTitle() {
        return "Ping";
    }
}
