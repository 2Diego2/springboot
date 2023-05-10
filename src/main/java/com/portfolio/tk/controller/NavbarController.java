package com.portfolio.tk.controller;

import com.portfolio.tk.entity.Navbar;
import com.portfolio.tk.service.NavbarService;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/navbar")
@CrossOrigin(origins = "http://localhost:4200")
public class NavbarController {
    @Autowired
    private NavbarService navbarService;

    @GetMapping("navbar")
    public String mostrarNavbar(Model model) {
        try {
            Navbar navbar = navbarService.getNavbar();
            model.addAttribute("navbar", navbar);
        } catch (SQLException e) {
        
            e.printStackTrace();
        }
        return "navbar";
    }

    @PostMapping("/navbar/update")
    public String actualizarNavbar(@ModelAttribute("navbar") Navbar navbar) {
        try {
            navbarService.updateNavbar(navbar);
        } catch (SQLException e) {
            // Manejar el error adecuadamente
            e.printStackTrace();
        }
        return "redirect:/navbar";
    }
}