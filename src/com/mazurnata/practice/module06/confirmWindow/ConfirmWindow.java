package com.mazurnata.practice.module06.confirmWindow;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmWindow {

    static boolean answer;

    public static boolean display(String title, String massege) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);    //блокирует взаимаодействие пользователя с другими окнами
        window.setTitle(title);
        window.setMinWidth(350);    //указываем мин ширину окна
        window.setMinHeight(200);   //указываем мин высоту

        Label label = new Label(massege);
        label.setFont(Font.font(20));   //увеличили размер шрифта

        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });

        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene); //инициализируем окно
        window.showAndWait();

        return answer;
    }
}
