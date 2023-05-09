package com.portfolio.tk.repository;

import com.portfolio.tk.entity.Sobremi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SobremiRepository {
    private final Connection connection;

    public SobremiRepository(Connection connection) {
        this.connection = connection;
    }

   public Sobremi getSobremiById(int sobremiId) throws SQLException {
    String query = "SELECT * FROM sobremi WHERE id_sobremi = ?";
    PreparedStatement statement = connection.prepareStatement(query);
    statement.setInt(1, sobremiId);

    ResultSet resultSet = statement.executeQuery();
    if (resultSet.next()) {
        Sobremi sobremi = new Sobremi();
        sobremi.setIdSobremi(resultSet.getInt("id_sobremi"));
        sobremi.setBanner(resultSet.getString("banner"));
        sobremi.setImagenPerfil(resultSet.getString("imagen_perfil"));
        sobremi.setNombre(resultSet.getString("nombre"));
        sobremi.setApellido(resultSet.getString("apellido"));
        sobremi.setInformacion(resultSet.getString("informacion"));
        sobremi.setEditar(resultSet.getInt("editar"));
        sobremi.setBorrar(resultSet.getInt("borrar"));
        return sobremi;
    }

    return null;
}


    public void updateSobremi(Sobremi sobremi) throws SQLException {
        String query = "UPDATE sobremi SET banner = ?, imagen_perfil = ?, nombre = ?, apellido = ?, informacion = ?, editar = ?, borrar = ? WHERE id_sobremi = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, sobremi.getBanner());
        statement.setString(2, sobremi.getImagenPerfil());
        statement.setString(3, sobremi.getNombre());
        statement.setString(4, sobremi.getApellido());
        statement.setString(5, sobremi.getInformacion());
        statement.setInt(6, sobremi.getEditar());
        statement.setInt(7, sobremi.getBorrar());
        statement.setInt(8, sobremi.getIdSobremi());
        statement.executeUpdate();
    }
}
