package com.portfolio.tk.service;

import com.portfolio.tk.entity.Navbar;
import com.portfolio.tk.repository.NavbarRepository;
import java.sql.Connection;
import java.sql.SQLException;

public class NavbarService {
    private final NavbarRepository navbarRepository;

    public NavbarService(Connection connection) {
        navbarRepository = new NavbarRepository(connection);
    }

    public Navbar getNavbar() throws SQLException {
        return navbarRepository.getNavbar();
    }

    public void updateNavbar(Navbar navbar) throws SQLException {
        navbarRepository.updateNavbar(navbar);
    }
}

