package com.mazurnata.practice.module06.alertWindow;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AlertWindowsFX extends Application{
    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Вплывающие окна");


        button = new Button("1");
        button.setPrefSize(120, 60);
        button.setOnAction(e -> AlertWindow.display("pop-ups", "it's work"));

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
        window.show();
    }
}
