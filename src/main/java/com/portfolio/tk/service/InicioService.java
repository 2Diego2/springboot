package com.portfolio.tk.service;


import com.portfolio.tk.entity.Inicio;
import com.portfolio.tk.repository.InicioRepository;
import java.sql.Connection;
import java.sql.SQLException;

public class InicioService {
    private final InicioRepository inicioRepository;

    public InicioService(Connection connection) {
        inicioRepository = new InicioRepository(connection);
    }

    public Inicio getInicio() throws SQLException {
        return inicioRepository.getInicio();
    }

    public void updateInicio(Inicio inicio) throws SQLException {
        inicioRepository.updateInicio(inicio);
    }
}
