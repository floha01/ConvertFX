package de.floha01.convertfx.convertfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Button btn;

    @Override
    public void start(Stage stage) throws Exception {
         stage.setTitle("ConvertFX");

         btn = new Button();
         btn.setText("Convert File");

        StackPane layout = new StackPane();
        layout.getChildren().add(btn);

        Scene scene = new Scene(layout, 400, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
