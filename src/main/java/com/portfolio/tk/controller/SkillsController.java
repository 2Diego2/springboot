package com.portfolio.tk.controller;

import com.portfolio.tk.entity.Skills;
import com.portfolio.tk.service.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("skills")
public class SkillsController {
    private final SkillsService skillsService;

    @Autowired
    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @GetMapping
    public List<Skills> getAllSkills() {
        try {
            return skillsService.getAllSkills();
        } catch (SQLException e) {
            
        }
        return null; 
    }

    @PutMapping("/edit")
    public String updateSkills(@RequestBody Skills skills) {
        try {
            skillsService.updateSkills(skills);
            return "Las habilidades se actualizaron exitosamente";
        } catch (SQLException e) {
            
            return "Error al actualizar las habilidades";
        }
    }
}
