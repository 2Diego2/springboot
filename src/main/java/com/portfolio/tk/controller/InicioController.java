
package com.portfolio.tk.controller;

import com.portfolio.tk.entity.Inicio;
import com.portfolio.tk.service.InicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("inicio")
@CrossOrigin(origins = "https://portfolio-tk.onrender.com")
public class InicioController {
    @Autowired
    private InicioService inicioService;

    @GetMapping("/inicio")
    public String mostrarInicio(Model model) {
        try {
            Inicio inicio = inicioService.getInicio();
            model.addAttribute("inicio", inicio);
        } catch (SQLException e) {
            // Manejar el error adecuadamente
            e.printStackTrace();
        }
        return "inicio";
    }

    @PostMapping("/inicio/update")
    public String actualizarInicio(@ModelAttribute("inicio") Inicio inicio) {
        try {
            inicioService.updateInicio(inicio);
        } catch (SQLException e) {
            // Manejar el error adecuadamente
            e.printStackTrace();
        }
        return "redirect:/inicio";
    }
}
