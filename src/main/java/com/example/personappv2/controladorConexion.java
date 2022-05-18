package com.example.personappv2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.sql.*;

public class controladorConexion
{

    @FXML
    private Button botonConectarse;

    @FXML
    private Label usernameBaseDeDatos;

    @FXML
    void getConnection (ActionEvent event)
    {

    }
    public Connection databaseLink;
    public Connection getConnection() throws SQLException
    {
        String dataBaseUser = "root";
        String databasePassword = "macbookpro13";
        String url = "jdbc:mysql://localhost:3306/tallerFinal_db";


        String datosNombre = "";
        String datosApellido = "";
        String datosGenero = "";
        String datoCedula = "";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, dataBaseUser, databasePassword);
            System.out.println("La base se pudo conectar bien :)");
        }
        catch (Exception e) {e.printStackTrace();}




        // Hablar con la Base De Datos (Hola jajaja)
        Statement statement = databaseLink.createStatement();
        ResultSet ResultadoStatement = statement.executeQuery ("SELECT * FROM tallerFinal_Persona");

        // Que imprima la base de datos cual Epson Ecotank
        while (ResultadoStatement.next())
        {
            System.out.println (ResultadoStatement.getString (1) + " " + ResultadoStatement.getString (2)+ " " + ResultadoStatement.getString (3)+ ResultadoStatement.getInt(4));
        }
        return databaseLink;
    }


}

