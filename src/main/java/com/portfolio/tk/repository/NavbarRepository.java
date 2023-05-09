package com.portfolio.tk.repository;

import com.portfolio.tk.entity.Navbar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NavbarRepository {
    private Connection connection;

    public NavbarRepository(Connection connection) {
        this.connection = connection;
    }

    public Navbar getNavbar() throws SQLException {
        String query = "SELECT * FROM navbar";
        PreparedStatement statement = connection.prepareStatement(query);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            Navbar navbar = new Navbar();
            navbar.setIdNavbar(resultSet.getInt("id_navbar"));
            navbar.setLinkLinkedin(resultSet.getString("link_linkedin"));
            navbar.setLinkGithub(resultSet.getString("link_github"));
            navbar.setLinkCodepen(resultSet.getString("link_codepen"));
            navbar.setEditar((resultSet.getInt("editar") == 1));
            navbar.setBorrar((resultSet.getInt("borrar") == 1));
            return navbar;
        }

        return null;
    }

    public void updateNavbar(Navbar navbar) throws SQLException {
        String query = "UPDATE navbar SET link_linkedin = ?, link_github = ?, link_codepen = ?, editar = ?, borrar = ? WHERE id_navbar = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, navbar.getLinkLinkedin());
        statement.setString(2, navbar.getLinkGithub());
        statement.setString(3, navbar.getLinkCodepen());
        statement.setInt(4, navbar.isEditar() ? 1 : 0);
        statement.setInt(5, navbar.isBorrar() ? 1 : 0);
        statement.setInt(6, navbar.getIdNavbar());

        statement.executeUpdate();
    }
}
