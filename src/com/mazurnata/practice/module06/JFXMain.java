package com.mazurnata.practice.module06;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
//        button.setOnAction(new EventHandler<ActionEvent>() { //удобнее использовать вложенный анонимный класс
//            @Override                                        //для одной кнопки
//            public void handle(ActionEvent event) {
//                System.out.println("joj");
//            }
//        });   //задаем действия для кнопки
        button.setOnAction(e -> {
            System.out.println("1");
            System.out.println("2");
        });
        StackPane layuot = new StackPane();
        layuot.getChildren().add(button);
        Scene scene = new Scene(layuot, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

//    @Override //для
//    public void handle(ActionEvent event) { //прописываем условия для кнопки
//        // можем пропис
//        if (event.getSource() == button) {
//            System.out.println("Ayaa");//так не делают!!
//        }
//    }
}
