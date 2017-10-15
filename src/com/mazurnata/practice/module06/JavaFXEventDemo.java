package com.mazurnata.practice.module06;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXEventDemo extends Application {
    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Demonstrate JavaFX Button and Event");

        /*
        Использовать панель поточной компоновки FlowPane
        в качестве коренного узла. Установить промежутки
        между элементами управления по горизонтали и
        по вертикали = 10
         */
        FlowPane root = new FlowPane(10, 10);

        //выровнять элементы управления по центру сцены
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 300, 300);

        //установить сцену на подмосткам
        primaryStage.setScene(scene);

        //создать метку
        response = new Label("Push a Button");

        //создать две экранные кнопки
        Button btnAlpha = new Button("Alpha");
        Button btnBeta = new Button("Beta");

        //обработать события действия от кнопки Alpha
        btnAlpha.setOnAction(e -> {
            response.setText("Alpha was pressed");
            //нажата кнопка Alpha
        });

        //обработать события действия от кнопки Beta
        btnBeta.setOnAction(e -> response.setText("Beta was pressed"));

        //ввести метку и кнопки в граф сцены
        root.getChildren().addAll(btnAlpha, btnBeta, response);
        primaryStage.show();
    }
}
