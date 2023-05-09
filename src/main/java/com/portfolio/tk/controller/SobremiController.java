package com.portfolio.tk.controller;

import com.portfolio.tk.entity.Sobremi;
import com.portfolio.tk.service.SobremiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

/**
 *
 * @author germa
 */
@RestController
@RequestMapping("sobremi")
@CrossOrigin(origins = "http://localhost:4200")
public class SobremiController {
    private final SobremiService sobremiService;

    @Autowired
    public SobremiController(SobremiService sobremiService) {
        this.sobremiService = sobremiService;
    }

    @PutMapping("/edit")
    public String updateSobremi(@RequestBody Sobremi sobremi) {
        try {
            sobremiService.updateSobremi(sobremi);
            return "El sobremi se actualizó con éxito";
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error al actualizar el sobremi";
        }
    }
}
