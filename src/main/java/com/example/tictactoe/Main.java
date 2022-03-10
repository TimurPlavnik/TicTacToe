package com.example.tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("mainGame.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 186, 186);
        FXMLLoader WinLoader = new FXMLLoader(Main.class.getResource("WinScreen.fxml"));
        Scene WinScreen = new Scene(WinLoader.load(), 186, 186);
        Controller Controller= fxmlLoader.getController();
        Controller.setWinScreen(WinScreen);
        Control control=new Control();
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();

    }
}