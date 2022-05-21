package com.example.personappv2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class aplicacionPersona extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(aplicacionPersona.class.getResource("interfazPersona.fxml"));
        Scene sceneConexion = new Scene(fxmlLoader.load());
        stage.setTitle("Interfaz Conexion a MySQL!");
        stage.setScene(sceneConexion);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}