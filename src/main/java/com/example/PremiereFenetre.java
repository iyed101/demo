package com.example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class PremiereFenetre extends Application {
    @Override
    public void start(Stage primaryStage) {
    Group root = new Group();
    Line ligne = new Line(50, 50, 200, 50);
    ligne.setStroke(Color.RED);
    root.getChildren().add(ligne);
    Rectangle rectangle = new Rectangle(20, 100, 150, 100);  
    rectangle.setFill(Color.BLUE); 
    root.getChildren().add(rectangle);
    Circle cercle = new Circle(300, 200, 50);
    cercle.setFill(Color.GREEN);
    root.getChildren().add(cercle);
    Scene scene = new Scene(root, 500, 500, Color.WHITE);
    primaryStage.setTitle("Ma première fenêtre");
    primaryStage.setScene(scene);
    primaryStage.show();
    }
    public static void main(String[] args) {
    launch(args);
    }
}
