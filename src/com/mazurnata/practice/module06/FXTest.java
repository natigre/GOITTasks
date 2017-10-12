package com.mazurnata.practice.module06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class FXTest extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane(); //сщздаем пустую панель
        Line line = new Line(10,10, 300,300); //создаем линию
        root.getChildren().addAll(line); //кладем линию в пустую панель

        Scene scene = new Scene(root);  //создаем сцену и кладем внутрь root (пустую панельку)
        primaryStage.setScene(scene);   // привязываем окно программы к нашей сцене

        primaryStage.show();
    }
}
