package com.portfolio.tk.controller;

import com.portfolio.tk.entity.Educacion;
import com.portfolio.tk.service.EducacionService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("educacion")
@CrossOrigin(origins = "https://portfolio-tk.onrender.com")
public class EducacionController {

    private final EducacionService educacionService;

    @Autowired
    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }

    @GetMapping("/{sobremiId}")
    public ResponseEntity<List<Educacion>> getEducacionesBySobremiId(@PathVariable int sobremiId) {
        try {
            List<Educacion> educaciones = educacionService.getEducaciones(sobremiId);
            return ResponseEntity.ok(educaciones);
        } catch (SQLException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/edit")
    public ResponseEntity<String> updateEducacion(@RequestBody Educacion educacion) {
        try {
            educacionService.updateEducacion(educacion);
            return ResponseEntity.ok("La educación se actualizó con éxito");
        } catch (SQLException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

   @DeleteMapping("/eliminar")
public ResponseEntity<String> eliminarEducacion(@RequestParam int idEducacion) {
    try {
        educacionService.eliminarEducacion(idEducacion);
        return ResponseEntity.ok("La educación se eliminó con éxito");
    } catch (SQLException e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}


}
