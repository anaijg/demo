package com.aulafx.prueba1.modelo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// este es el inicio de la aplicación (tiene el main)
public class AppPersonas extends Application { // no se toca
    @Override
    public void start(Stage stage) throws IOException { // esto no se cambia
        FXMLLoader fxmlLoader = new FXMLLoader(AppPersonas.class.getResource("/com/aulafx/prueba1/personas-view.fxml")); // aquí cambiamos la ruta del fxml; lo demás no se toca
        Scene scene = new Scene(fxmlLoader.load(), 565, 260); // definimos el tamaño que queremos, lo demás no cambia

        stage.setScene(scene); // esto no se toca
        stage.show(); // esto no se toca
    }

    public static void main(String[] args) { // esto no se cambia
        launch();
    }
}