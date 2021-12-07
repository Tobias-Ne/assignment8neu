package com.example.assignment8neu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/ // TODO: I dont think this is necessary (was from template), dont know what fxmlLoader does though
        new OwnApplication(new CalcPlugin()).show(); // WHUT
    }

    public static void main(String[] args) {
        launch();
    }
}