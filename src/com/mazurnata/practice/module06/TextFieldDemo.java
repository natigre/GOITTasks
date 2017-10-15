package com.mazurnata.practice.module06;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TextFieldDemo extends Application{
    TextField tf;
    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Demonstrate a TextField");
        FlowPane root = new FlowPane(10,10);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 230, 140);
        primaryStage.setScene(scene);

        //создать метку, извещающую о содержимом текстового поля
        response = new Label("Search String:");

        //создать кнопку для получения текста
        Button btnGetText = new Button("Get Search String");

        //создать текстовое поле
        tf = new TextField("Enter Search String");
        //ввести строку запроса

        //задать предпочтительное количество столбцов
        tf.setPrefColumnCount(15);

        //Обработать события действия от текстового поля
        //События действия генерируются при нажатиии клавиши Enter,
        //когда фокус ввода находиться в текстовом поле
        //в таком случае получается и отображается текст, введенный в текстовом поле
        tf.setOnAction(e -> {response.setText("Searching String: " + tf.getText());
        //строка запроса на поиск информации
        });

        //получить текст из текстового поля, если нажата клавиша Ентер, а затем отобразить его
        btnGetText.setOnAction(e -> {
            response.setText("Searching String: " + tf.getText());
        });

        //использовать разделитель, чтобы улучшить порядок расположения элементов управления
        Separator separator = new Separator();
        separator.setPrefWidth(180);

        root.getChildren().addAll(tf, btnGetText, separator, response);

        primaryStage.show();
    }
}
