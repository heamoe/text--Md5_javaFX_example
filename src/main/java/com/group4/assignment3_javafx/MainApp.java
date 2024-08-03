package com.group4.assignment3_javafx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
//created by Subekshya Chhetri Bista, Rajneesh Goyal, Zhaorui Zhang.
//2024/8/10
public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainView.fxml"));
            Scene scene = new Scene(loader.load(), 800, 800);
            primaryStage.setTitle("group 4 assignment 3");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
