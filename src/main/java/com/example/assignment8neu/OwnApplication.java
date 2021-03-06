package com.example.assignment8neu;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class OwnApplication extends Stage implements InputProvider {
    private Plugin plugin;
    private TextField textfield;

    public OwnApplication(Plugin p) {
        this.plugin = p;
        p.setApplication(this);
        init();
    }

    public void init() {
        BorderPane contentPane = new BorderPane();
        //contentPane.setBorder(); // TODO
        Button button = new Button();
        if (plugin != null)
            button.setText(plugin.getButtonText());
        else
            button.setText("ok");
        contentPane.setRight(button);
        textfield = new TextField("");
        if (plugin != null)
            textfield.setText(plugin.getInitialText());
        textfield.setPrefSize(200,20);
        contentPane.setLeft(textfield);
        if (plugin != null)
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    plugin.buttonClicked();
                }
            });
        if (plugin.getApplicationTitle() == "File Uploader") {
            Button button2 = new Button();
            button2.setText("search files");
            contentPane.setCenter(button2);
            button2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("");
                    alert.setHeaderText(null);
                    alert.setContentText("choose file");
                    alert.show();
                }
            });
        }
        this.setScene(new Scene(contentPane));
        this.setTitle(plugin.getApplicationTitle());
    }

    public String getInput() { return textfield.getText(); }
}

