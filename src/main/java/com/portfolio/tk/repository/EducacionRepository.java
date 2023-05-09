package com.portfolio.tk.repository;


import com.portfolio.tk.entity.Educacion;
import com.portfolio.tk.entity.Sobremi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class EducacionRepository {
    private Connection connection;

    public EducacionRepository(Connection connection) {
        this.connection = connection;
    }

    public List<Educacion> getEducacionesBySobremiId(int sobremiId) throws SQLException {
        List<Educacion> educaciones = new ArrayList<>();

        String query = "SELECT * FROM educacion WHERE sobremi_id_sobremi = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, sobremiId);

        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Educacion educacion = new Educacion();
            educacion.setIdEducacion(resultSet.getInt("id_educacion"));
            educacion.setNombreInstitucion(resultSet.getString("nombre_institucion"));
            educacion.setLogoInstitucion(resultSet.getString("logo_institucion"));
            educacion.setNivelEstudios(resultSet.getString("nivel_estudios"));
            educacion.setSobremi(new Sobremi(resultSet.getInt("sobremi_id_sobremi"), null, null, null, null, null, 0, 0));
            educacion.setEditar(resultSet.getInt("editar"));
            educacion.setBorrar(resultSet.getInt("borrar"));
            educaciones.add(educacion);
        }

        return educaciones;
    }

    public void updateEducacion(Educacion educacion) throws SQLException {
        String query = "UPDATE educacion SET nombre_institucion = ?, logo_institucion = ?, nivel_estudios = ?, editar = ?, borrar = ? WHERE id_educacion = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, educacion.getNombreInstitucion());
        statement.setString(2, educacion.getLogoInstitucion());
        statement.setString(3, educacion.getNivelEstudios());
        statement.setInt(4, educacion.getEditar());
        statement.setInt(5, educacion.getBorrar());
        statement.setInt(6, educacion.getIdEducacion());

        statement.executeUpdate();
       
        Sobremi sobremi = educacion.getSobremi();
        if (sobremi != null) {
            String updateSobremiQuery = "UPDATE sobremi SET ... WHERE id_sobremi = ?";
            PreparedStatement updateSobremiStatement = connection.prepareStatement(updateSobremiQuery);
            
            updateSobremiStatement.setInt(1, sobremi.getIdSobremi());
            updateSobremiStatement.executeUpdate();
        }
    }

    public void eliminarEducacion(int idEducacion) throws SQLException {
        String query = "DELETE FROM educacion WHERE id_educacion = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, idEducacion);

        statement.executeUpdate();
    }
}
