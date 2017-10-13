package com.mazurnata.practice.module06;

import com.mazurnata.practice.module4.RecursionFactorialExample;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class AdvancedFXMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private void calcFact(int n, Pane root) {
        for (int i = 0; i < n; i++) {
            int x = i + 1;
            int fact = RecursionFactorialExample.factorial(x);

            Text textArea = new Text("Factorial" + x + " " + fact);
            textArea.setTranslateX(10);
            textArea.setTranslateY(100 + 30 * i);
            root.getChildren().add(textArea);
        }
    }

    private void initView(Pane root) {

        TextField inputTextField = new TextField("10");
        inputTextField.setTranslateX(10);
        inputTextField.setTranslateY(10);

        Button button = new Button("Go");
        button.setTranslateX(400);
        button.setTranslateY(10);
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int n = Integer.parseInt(inputTextField.getText());

                calcFact(n, root);
            }
        });

        root.getChildren().addAll(inputTextField, button);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        initView(root);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setX(Screen.getPrimary().getBounds().getWidth() - primaryStage.getWidth());

        primaryStage.show();
    }
}
