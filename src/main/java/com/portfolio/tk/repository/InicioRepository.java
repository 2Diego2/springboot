
package com.portfolio.tk.repository;

import com.portfolio.tk.entity.Inicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InicioRepository {
    private Connection connection;

    public void updateInicio(Inicio inicio) throws SQLException {
    String query = "UPDATE inicio SET logo = ?, link_pagina = ? WHERE id_inicio = ?";
    PreparedStatement statement = connection.prepareStatement(query);
    statement.setString(1, inicio.getLogo());
    statement.setString(2, inicio.getLinkPagina());
    statement.setInt(3, inicio.getIdInicio());

    statement.executeUpdate();
}

    public InicioRepository(Connection connection) {
        this.connection = connection;
    }

    public Inicio getInicio() throws SQLException {
        String query = "SELECT * FROM inicio";
        PreparedStatement statement = connection.prepareStatement(query);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            Inicio inicio = new Inicio();
            inicio.setIdInicio(resultSet.getInt("id_inicio"));
            inicio.setLogo(resultSet.getString("logo"));
            inicio.setLinkPagina(resultSet.getString("link_pagina"));
            return inicio;
        }

        return null;
    }
}