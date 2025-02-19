package edu.farmingdale.csc311_classwork;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader root1 = new FXMLLoader(HelloApplication.class.getResource("splashscreen.fxml"));
        Scene scene = new Scene(root1.load(), 320, 240);

        stage.setScene(scene);


        stage.show();


        FXMLLoader root2 = new FXMLLoader(HelloApplication.class.getResource("loginScreen.fxml"));
        Scene scene2 = new Scene(root2.load());
        stage.setScene(scene2);
    }

    public static void main(String[] args) {
        launch();
    }
}