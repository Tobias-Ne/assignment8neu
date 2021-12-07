package com.example.assignment8neu;

import javafx.scene.control.Alert;

public class UploadPlugin implements Plugin { // TODO: Problem: 2 buttons necessary
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
        alert.setContentText("File " + application.getInput() + " uploaded");

    }

    public String getApplicationTitle() {
        return "File Uploader";
    }
}
