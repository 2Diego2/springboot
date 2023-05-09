package com.portfolio.tk.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "skills")
public class Skills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_skills")
    private int idSkills;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "habilidad_blanda_nombre")
    private String habilidadBlandaNombre;

    @Column(name = "habilidad_blanda_porcentaje")
    private double habilidadBlandaPorcentaje;

    @Column(name = "habilidad_dura_nombre")
    private String habilidadDuraNombre;

    @Column(name = "habilidad_dura_porcentaje")
    private double habilidadDuraPorcentaje;

    @Column(name = "editar")
    private int editar;

    @Column(name = "borrar")
    private int borrar;

    // Getters y setters

    public int getIdSkills() {
        return idSkills;
    }

    public void setIdSkills(int idSkills) {
        this.idSkills = idSkills;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidadBlandaNombre() {
        return habilidadBlandaNombre;
    }

    public void setHabilidadBlandaNombre(String habilidadBlandaNombre) {
        this.habilidadBlandaNombre = habilidadBlandaNombre;
    }

    public double getHabilidadBlandaPorcentaje() {
        return habilidadBlandaPorcentaje;
    }

    public void setHabilidadBlandaPorcentaje(double habilidadBlandaPorcentaje) {
        this.habilidadBlandaPorcentaje = habilidadBlandaPorcentaje;
    }

    public String getHabilidadDuraNombre() {
        return habilidadDuraNombre;
    }

    public void setHabilidadDuraNombre(String habilidadDuraNombre) {
        this.habilidadDuraNombre = habilidadDuraNombre;
    }

    public double getHabilidadDuraPorcentaje() {
        return habilidadDuraPorcentaje;
    }

    public void setHabilidadDuraPorcentaje(double habilidadDuraPorcentaje) {
        this.habilidadDuraPorcentaje = habilidadDuraPorcentaje;
    }

    public int getEditar() {
        return editar;
    }

    public void setEditar(int editar) {
        this.editar = editar;
    }

    public int getBorrar() {
        return borrar;
    }

    public void setBorrar(int borrar) {
        this.borrar = borrar;
    }
}
