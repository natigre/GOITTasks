package com.mazurnata.practice.module07.player;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;



public class Mediaplayer extends Application {
    String fileName;
    MediaPlayer player;
    Button playButton = new Button("Play");
    Button stopButton = new Button("Stop");
    Label name = new Label("file path");
    TextField path = new TextField();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Подключем css стили
        Application.setUserAgentStylesheet(getClass().getResource("style.css").toExternalForm());
        VBox box = new VBox();
        box.getStyleClass().add("box"); //Получаем класс из .css файла
        name.getStyleClass().add("name");
        path.getStyleClass().add("path");
        playButton.getStyleClass().add("play");
        stopButton.getStyleClass().add("stop");
        box.getChildren().addAll(name, path, playButton, stopButton);

        playButton.setOnAction(arg0 -> {
            fileName = path.getText();
            String allName = "file: /// " + fileName;
            Media media = new Media(allName);
            player = new MediaPlayer(media);
            player.setAutoPlay(true);

        });

        stopButton.setOnAction(arg0 -> player.stop());

        Scene scene = new Scene(box, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
