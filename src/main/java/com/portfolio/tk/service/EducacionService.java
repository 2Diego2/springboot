package com.portfolio.tk.service;

import com.portfolio.tk.entity.Educacion;
import com.portfolio.tk.repository.EducacionRepository;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducacionService {

    private final EducacionRepository educacionRepository;

    @Autowired
    public EducacionService(EducacionRepository educacionRepository) {
        this.educacionRepository = educacionRepository;
    }

    public List<Educacion> getEducaciones(int sobremiId) throws SQLException {
        return educacionRepository.getEducacionesBySobremiId(sobremiId);
    }

    public void updateEducacion(Educacion educacion) throws SQLException {
        educacionRepository.updateEducacion(educacion);
    }

    public void eliminarEducacion(int idEducacion) throws SQLException {
        educacionRepository.eliminarEducacion(idEducacion);
    }
}
