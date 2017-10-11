package com.mazurnata.practice.module06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class JFXMain extends Application {
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("First application");
        button = new Button("This is button");
        StackPane layuot = new StackPane();
        layuot.getChildren().add(button);
        Scene scene = new Scene(layuot, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
