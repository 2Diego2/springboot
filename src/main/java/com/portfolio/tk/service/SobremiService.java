package com.portfolio.tk.service;

import com.portfolio.tk.entity.Sobremi;
import com.portfolio.tk.repository.SobremiRepository;

import java.sql.Connection;
import java.sql.SQLException;

public class SobremiService {
    private final SobremiRepository sobremiRepository;

    public SobremiService(Connection connection) {
        sobremiRepository = new SobremiRepository(connection);
    }

    public Sobremi getSobremi(int sobremiId) throws SQLException {
        return sobremiRepository.getSobremiById(sobremiId);
    }

    public void updateSobremi(Sobremi sobremi) throws SQLException {
        sobremiRepository.updateSobremi(sobremi);
    }
}
