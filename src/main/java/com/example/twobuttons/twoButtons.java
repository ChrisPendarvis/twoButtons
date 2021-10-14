package com.example.twobuttons;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

/**
 * JavaFX App
 */
public class twoButtons extends Application {

    @Override
    public void start(Stage stage) {

        var label = new Label("Button 1 displays a logo, button 2 displays a different one.");
        Button button1 = new Button("Google");
        button1.setLayoutX(400);
        button1.setLayoutY(250);

        Button button2 = new Button("Yahoo");
        button2.setLayoutX(400);
        button2.setLayoutY(350);

        Group gp = new Group(label, button1, button2);
        button1.setOnAction(event -> {
            try {
                showImageOne();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        });


        button2.setOnAction(event->
        {   try {
            showImageTwo();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        });

        var scene = new Scene(gp, 800, 800);
        stage.setScene(scene);
        stage.show();
    }
    public void showImageOne() throws FileNotFoundException {
        Image img1 = new Image(new FileInputStream("C:/Users/Chris/Pictures/google.png"));
        ImageView view1 = new ImageView(img1);
        VBox vbox1 = new VBox();
        vbox1.setAlignment(Pos.CENTER);
        vbox1.getChildren().add(view1);
        Stage stage1 = new Stage();
        stage1.setScene(new Scene(vbox1));
        stage1.show();

    }
    private void showImageTwo() throws FileNotFoundException
    {
        Image img2 = new Image(new FileInputStream("C:/Users/Chris/Pictures/yahoo.png"));
        ImageView view2 = new ImageView(img2);
        VBox vbox2 = new VBox();
        vbox2.setAlignment(Pos.CENTER);
        vbox2.getChildren().add(view2);
        Stage stage2 = new Stage();
        stage2.setScene(new Scene(vbox2));
        stage2.show();
    }

    int clicks1 = 0;
    int clicks2 = 0;


    public static void main(String[] args) {
        launch();
    }

}





