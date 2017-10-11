package com.mazurnata.practice.module06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MultiWindowApplication extends Application{
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        //first window
        Label label1 = new Label("Hi, you are in first window");
        Button button1 = new Button("Portal to second window");
        button1.setOnAction(e -> window.setScene(scene2));
        VBox layout1 = new VBox(20); //вертикальная разметка
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 300);


        //second window
        Label label2 = new Label("It's second window");
        Button button2 = new Button("This is the second window");
        button2.setOnAction(e -> window.setScene(scene1));
        HBox layout2 = new HBox(20);
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2, 200, 300);

        //указывает какое окно будет показываться парвым
        window.setScene(scene1);
        window.setTitle("Our multi window");
        window.show();
    }
}
