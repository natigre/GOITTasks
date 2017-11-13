package com.mazurnata.practice.module06.confirmWindow;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ConfirmWindowsFX extends Application{
    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Вплывающие окна");


        button = new Button("Do it");
        button.setPrefSize(120, 60);
        button.setOnAction(e -> {
            boolean result = ConfirmWindow.display("window of confiem", "do you really want it?");
            System.out.println(result);

        });

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
        window.show();
    }
}
