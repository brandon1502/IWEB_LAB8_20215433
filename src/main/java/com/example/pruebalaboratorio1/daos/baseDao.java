package com.example.pruebalaboratorio1.daos;

import com.example.pruebalaboratorio1.beans.pelicula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class baseDao {

    public Connection getConnection() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=America/Lima";
        String username = "root";
        String password = "root";

        return DriverManager.getConnection(url, username, password);

    }

    public boolean validarBorrado(pelicula movie) {
        boolean validador = true;
        return validador;
    }





}

