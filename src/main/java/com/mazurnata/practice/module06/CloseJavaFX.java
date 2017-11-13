package com.mazurnata.practice.module06;

import com.mazurnata.practice.module06.confirmWindow.ConfirmWindow;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CloseJavaFX extends Application{

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Close the window");

        //закрытие программы общее(через крестик)
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        button = new Button("Close");
        button.setPrefSize(120, 60);

        button.setOnAction(e -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 400,300);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram() {       //закрытие программы через кнопку
//        System.out.println("OK");
//        window.close();
        Boolean answer = ConfirmWindow.display("Внимание", "Точно хочешь выйти?");
        if (answer) {
            System.out.println("OK");
            window.close();
        }
    }
}
