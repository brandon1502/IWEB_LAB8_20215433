package com.example.pruebalaboratorio1.daos;

import com.example.pruebalaboratorio1.beans.genero;
import com.example.pruebalaboratorio1.beans.streaming;
import com.example.pruebalaboratorio1.beans.pelicula;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class listasDao extends baseDao {

    /*
    public ArrayList<genero> listarGeneros() {
        ArrayList<genero> listaGeneros = new ArrayList<>();

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM genero");) {

            while (rs.next()) {

                genero genero = new genero();
                genero.setIdGenero(rs.getInt(1));
                genero.setIdGenero(rs.getInt(2));

                listaGeneros.add(genero);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaGeneros;
    }

    public ArrayList<streaming> listarStraming() {
        ArrayList<streaming> listaStreaming = new ArrayList<>();

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM streaming");) {

            while (rs.next()) {

                streaming streaming = new streaming();
                streaming.setIdStreaming(1);
                streaming.setNombreServicio(rs.getString(2));

                listaStreaming.add(streaming);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaStreaming;
    }

*/

}
