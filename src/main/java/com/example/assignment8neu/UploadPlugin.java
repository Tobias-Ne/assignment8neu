package com.example.assignment8neu;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class UploadPlugin implements Plugin { // TODO: Problem: 2 buttons necessary
    private InputProvider application;

    public void setApplication(InputProvider app) {
        this.application = app;
    }

    public String getButtonText() {
        return "upload";
    }

    public String getInitialText() {
        return "";
    }

    public void buttonClicked() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("");
        alert.setHeaderText(null);
        alert.setContentText("Datei auswählen");
        alert.show();
    }

    public String getApplicationTitle() {
        return "File Uploader";
    }
}
