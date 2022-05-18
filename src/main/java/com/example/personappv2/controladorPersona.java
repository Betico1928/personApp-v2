package com.example.personappv2;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;

public class controladorPersona
{
    // interfazConexion
    @FXML
    private Button botonConectarse;
    @FXML
    private Label usernameBaseDeDatos;


    // Inferfaz Telefono
    @FXML // fx:id="botonEliminar"
    private Button botonEliminar; // Value injected by FXMLLoader

    @FXML // fx:id="botonGuardar"
    private Button botonGuardar; // Value injected by FXMLLoader

    @FXML // fx:id="botonIrAlTelefono"
    private Button botonIrAlTelefono; // Value injected by FXMLLoader

    @FXML // fx:id="botonSalir"
    private Button botonSalir; // Value injected by FXMLLoader

    @FXML // fx:id="botonX"
    private Button botonX; // Value injected by FXMLLoader

    @FXML // fx:id="radioFemenino"
    private RadioButton radioFemenino; // Value injected by FXMLLoader

    @FXML // fx:id="radioMasculino"
    private RadioButton radioMasculino; // Value injected by FXMLLoader

    @FXML // fx:id="radioOtro"
    private RadioButton radioOtro; // Value injected by FXMLLoader

    @FXML // fx:id="textoApellido"
    private TextField textoApellido; // Value injected by FXMLLoader

    @FXML // fx:id="textoCedula"
    private TextField textoCedula; // Value injected by FXMLLoader

    @FXML // fx:id="textoContactos"
    private TextArea textoContactos; // Value injected by FXMLLoader

    @FXML // fx:id="textoNombre"
    private TextField textoNombre; // Value injected by FXMLLoader

    @FXML // fx:id="tituloApellido"
    private Text tituloApellido; // Value injected by FXMLLoader

    @FXML // fx:id="tituloCedula"
    private Text tituloCedula; // Value injected by FXMLLoader

    @FXML // fx:id="tituloGenero"
    private Text tituloGenero; // Value injected by FXMLLoader

    @FXML // fx:id="tituloNombre"
    private Text tituloNombre; // Value injected by FXMLLoader

    // Para poner musica porque estoy aburrido
    MediaPlayer mediaPlayer;
    public void ponerMusica()
    {
        String path = "Audio.wav";
        Media media = new Media(Paths.get(path).toUri().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
}
