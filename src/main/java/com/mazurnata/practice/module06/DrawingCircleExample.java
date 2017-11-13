package com.mazurnata.practice.module06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class DrawingCircleExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(1000, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for (int i = 0; i < 100; i++) {
            drawCircle(gc,
                    RandomColor.random(0, (int) canvas.getWidth()),
                    RandomColor.random(0, (int) canvas.getHeight()),
                    RandomColor.random(10, 100));
        }

        Pane root = new Pane();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    void drawCircle(GraphicsContext gc, int x, int y, float radius) {
        gc.setStroke(RandomColor.getRandom());
        gc.setLineWidth(RandomColor.random(1, 10));
        gc.strokeOval(x + radius, y + radius, radius * 2, radius * 2);
    }

}
