package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class UserLoginPage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Login Page");
        
        Button button = new Button("Log in!");
        Label label = new Label("Please log in below");
        Scene scene = new Scene(button, 400, 200);
        
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}