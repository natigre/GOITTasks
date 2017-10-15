package com.mazurnata.practice.module06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXLabelDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Demonstrate a JavaFX Label");

        FlowPane root= new FlowPane();
        Scene scene = new Scene(root, 300,200);
        primaryStage.setScene(scene);

        //создаем метку
        Label label = new Label("This is a JavaFX label");

        //вводим метку в граф сцены
        root.getChildren().add(label);

        //удалить метку со сцены
//        root.getChildren().remove(label);

        primaryStage.show();
    }
}
