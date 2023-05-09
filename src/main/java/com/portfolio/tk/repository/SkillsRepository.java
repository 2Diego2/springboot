package com.portfolio.tk.repository;

import com.portfolio.tk.entity.Skills;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;

@Repository
public class SkillsRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Skills> getAllSkills() throws SQLException {
        return entityManager.createQuery("SELECT s FROM Skills s", Skills.class)
                .getResultList();
    }

    public void updateSkills(Skills skills) throws SQLException {
        entityManager.merge(skills);
    }
}
