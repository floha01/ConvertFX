package de.floha01.convertfx.convertfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ConvertFX");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/view.fxml"));
        stage.setTitle("ConvertFX");
        stage.setScene(new Scene(root));
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
