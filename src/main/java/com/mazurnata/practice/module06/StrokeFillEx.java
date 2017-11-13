package com.mazurnata.practice.module06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class StrokeFillEx extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        Canvas canvas = new Canvas(500,500);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        doDrawing(graphicsContext);

        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 500,450, Color.WHITESMOKE);

        primaryStage.setTitle("Stroke and Fill");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void doDrawing(GraphicsContext graphicsContext) {
        graphicsContext.setStroke(Color.FORESTGREEN);
        graphicsContext.setLineWidth(5);
        graphicsContext.strokeOval(30, 30, 80, 80);
        graphicsContext.setFill(Color.FORESTGREEN);
        graphicsContext.fillOval(130, 30, 80, 80);
    }
}
