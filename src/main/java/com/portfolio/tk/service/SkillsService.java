package com.portfolio.tk.service;

import com.portfolio.tk.entity.Skills;
import com.portfolio.tk.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class SkillsService {
    private final SkillsRepository skillsRepository;

    @Autowired
    public SkillsService(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    public List<Skills> getAllSkills() throws SQLException {
        return skillsRepository.getAllSkills();
    }

    public void updateSkills(Skills skills) throws SQLException {
        skillsRepository.updateSkills(skills);
    }
}
