package com.mazurnata.hometasks.module06.snowman;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class DrawingSnowman extends Application {
    private static int countOfCircles;
    private static int minRadius;
    private static int maxRadius;

    private Pane root = new Pane();
    public Circle[] circles;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Drawing snowman");

        Button btnDrawCircles = new Button();
        btnDrawCircles.setText("Draw circles");
        btnDrawCircles.setTranslateX(20);
        btnDrawCircles.setTranslateY(100);

        Button btnSetColors = new Button();
        btnSetColors.setText("Paint circles");
        btnSetColors.setTranslateX(20);
        btnSetColors.setTranslateY(130);

        Button btnSetColorsRed = new Button();
        btnSetColorsRed.setText("Painting in red");
        btnSetColorsRed.setTranslateX(20);
        btnSetColorsRed.setTranslateY(160);

        Button btnSetGradient = new Button();
        btnSetGradient.setText("Gradient");
        btnSetGradient.setTranslateX(20);
        btnSetGradient.setTranslateY(190);

        Label numberOfCirclesLabel = new Label("Number of circles: ");
        numberOfCirclesLabel.setTranslateX(20);
        numberOfCirclesLabel.setTranslateY(10);

        TextField numberOfCirclesField = new TextField();
        numberOfCirclesField.setText("3");
        numberOfCirclesField.setTranslateX(160);
        numberOfCirclesField.setTranslateY(10);

        Label minRadiusOfCirclesLabel = new Label("Min radius of circle: ");
        minRadiusOfCirclesLabel.setTranslateX(20);
        minRadiusOfCirclesLabel.setTranslateY(40);

        TextField minRadiusOfCirclesField = new TextField();
        minRadiusOfCirclesField.setText("15");
        minRadiusOfCirclesField.setTranslateX(160);
        minRadiusOfCirclesField.setTranslateY(40);

        Label maxRadiusOfCirclesLabel = new Label("Max radius of circle: ");
        maxRadiusOfCirclesLabel.setTranslateX(20);
        maxRadiusOfCirclesLabel.setTranslateY(70);

        TextField maxRadiusOfCirclesField = new TextField();
        maxRadiusOfCirclesField.setText("45");
        maxRadiusOfCirclesField.setTranslateX(160);
        maxRadiusOfCirclesField.setTranslateY(70);

        btnDrawCircles.setOnAction(e -> {
            minRadius = Integer.parseInt(minRadiusOfCirclesField.getText());
            maxRadius = Integer.parseInt(maxRadiusOfCirclesField.getText());
            countOfCircles = Integer.parseInt(numberOfCirclesField.getText()) + 3;
            drawCircles();
        });

        btnSetColors.setOnAction(e -> setColorCircles());
        btnSetColorsRed.setOnAction(e -> setColorCirclesRed());
        btnSetGradient.setOnAction(e -> setGradient());

        root.getChildren().addAll(btnDrawCircles, btnSetColors, numberOfCirclesField, numberOfCirclesLabel,
                minRadiusOfCirclesLabel, minRadiusOfCirclesField, maxRadiusOfCirclesLabel,
                maxRadiusOfCirclesField, btnSetColorsRed, btnSetGradient);

        Scene scene = new Scene(root, 700, 650);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawCircles() {
        clearCircles();
        circles = new Circle[countOfCircles];
        for (int i = 0; i < countOfCircles; i++) {
            root.getChildren().remove(circles[i]);
            circles[i] = new Circle();
            circles[i].setTranslateX(400);
            if (i > 3) {
                double yRadius = minRadius + Math.random() * maxRadius;
                double yTranslateY;
                if (i == 4) {
                    yTranslateY = circles[0].getTranslateY() + circles[0].getRadius() + yRadius;
                } else {
                    yTranslateY = circles[i - 1].getTranslateY() + circles[i - 1].getRadius() + yRadius;
                }
                circles[i].setTranslateY(yTranslateY);
                circles[i].setRadius(yRadius);
            } else {
                drawHeadCircles(i);
            }
            root.getChildren().add(circles[i]);
            setColorCircle(i);
        }
    }

    private void drawHeadCircles(int i) {
        if (i == 0) {
            circles[i].setTranslateY(50);
            circles[i].setRadius(35);
        } else if (i == 1) {
            circles[i].setTranslateY(35);
            circles[i].setTranslateX(390);
            circles[i].setRadius(5);
        } else if (i == 2) {
            circles[i].setTranslateY(35);
            circles[i].setTranslateX(410);
            circles[i].setRadius(5);
        } else if (i == 3) {
            circles[i].setTranslateY(55);
            circles[i].setTranslateX(400);
            circles[i].setRadius(7);
        }
    }

    private void clearCircles() {
        if (circles != null && circles.length > 0) {
            root.getChildren().removeAll(circles);
        }
    }

    private void setColorCircles() {
        for (int i = 0; i < countOfCircles; i++) {
            setColorCircle(i);
        }
    }

    private void setColorCircle(int i) {
        Random randomValue = new Random();
        Color color = Color.color(randomValue.nextDouble(), randomValue.nextDouble(), randomValue.nextDouble(),1f);
        circles[i].setFill(Paint.valueOf(color.toString()));
    }

    private void setColorCirclesRed() {
        for (int i = 0; i < countOfCircles; i++) {
            circles[i].setFill(Paint.valueOf("red"));
        }
    }

    private Paint randomColor(float transparency) {
        Color color = Color.color(0f,0f,0f, transparency);
        return Paint.valueOf(color.toString());
    }

    private void setGradient() {
        if (circles.length != 0) {
            float transperency = 1f / circles.length;
            float step = transperency;
            for (int i = 0; i < circles.length; i++) {
                if (transperency > 1f) transperency = 1.5f;
                circles[i].setFill(randomColor(transperency));
                transperency += step;
            }
        }
    }
}
