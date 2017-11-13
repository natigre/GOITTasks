package com.mazurnata.practice.module06;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class DicerctDrawDemo extends Application {
    GraphicsContext gc;
    Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.BLACK};
    int colorIdx = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //присваиваем заголовок подмосткам
        //рисование прямо на холсте
        primaryStage.setTitle("Draw Directly to a Canvas");

        //использовать панель поточной компоновки FlowPane
        //в качестве корневого узла
        FlowPane root = new FlowPane();

        //расположить узлы по центру
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 450, 450);
        primaryStage.setScene(scene);

        //создать холст
        Canvas canvas = new Canvas(400, 400);

        //получить графический конкекст холста
        gc = canvas.getGraphicsContext2D();

        //создать экранную кнопку
        Button btnChangeColor = new Button("Change Color");

        //обработать события действия от кнопки Change Color
        btnChangeColor.setOnAction((ActionEvent e) -> {

            //задать цвет обводки
            gc.setStroke(colors[colorIdx]);
            gc.setFill(colors[colorIdx]);

            //перерисоавть линию, текст и заполненный прямоугольник новым цветом
            //При этом цвет остальных узлов графа сцены останется без изменения
            gc.strokeLine(0,0,200,200);
            gc.fillText("This is drawn on the canvas", 60, 50);

            //это рисуется на холсте
            gc.fillRect(100, 320,300, 40);

            //изменить цвет
            colorIdx++;
            if (colorIdx == colors.length) {
                colorIdx = 0;
            }
        });

        //нарисовать на холсте графические объекты первоначально выводимые на экран
        gc.strokeLine(0, 0, 200, 200);
        gc.strokeOval(100, 100, 200, 200);
        gc.strokeRect(0, 200, 50, 200);
        gc.fillOval(0, 0, 20, 20);
        gc.fillRect(100, 320, 300, 40);

        //задать шрифт размером 20 и воспроизести текст
        gc.setFont(new Font(20));
        gc.fillText("This is drawn on the canvas", 60, 50);

        //ввести холст и кнопку в граф сцены
        root.getChildren().addAll(canvas, btnChangeColor);
        primaryStage.show();
    }
}
