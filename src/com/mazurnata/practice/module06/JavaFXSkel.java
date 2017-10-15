package com.mazurnata.practice.module06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXSkel extends Application{
    public static void main(String[] args) {
        System.out.println("Запуск JavaFX- приложения");
        //запуск приложения
        launch(args);
    }

    @Override
    public void init() throws Exception {
        System.out.println("в теле метода init()");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("в теле метода start()");

        //присвоить заголовок подмосткам
        primaryStage.setTitle("JavaFX Skeleton");

        //создать корневой узел. Тут используется
        //панель поточной компоновки
        FlowPane root = new FlowPane();

        //создать сцену
        Scene scene = new Scene(root, 300, 200);

        //установить сцену на подмостках
        primaryStage.setScene(scene);

        //показать подмостки
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("в теле метода stop()");
    }
}
