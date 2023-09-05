package org.dm.d2d;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.dm.GamePanel;

import java.io.IOException;

public class Starter extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Starter.class.getResource("hello-view.fxml"));

        stage.setTitle("dm");
        Image icon = new Image("racoon.png");
        stage.getIcons().add(icon);
        stage.setResizable(false);

        Scene win = new Scene(fxmlLoader.load(), 1024, 720);
        new GamePanel(win);

        stage.setScene(win);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}