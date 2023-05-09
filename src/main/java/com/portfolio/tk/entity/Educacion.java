package com.portfolio.tk.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "educacion")
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_educacion")
    private int idEducacion;

    @Column(name = "nombre_institucion")
    private String nombreInstitucion;

    @Column(name = "logo_institucion")
    private String logoInstitucion;

    @Column(name = "nivel_estudios")
    private String nivelEstudios;

    @ManyToOne
    @JoinColumn(name = "sobremi_id_sobremi")
    private Sobremi sobremi;

    @Column(name = "editar")
    private int editar;

    @Column(name = "borrar")
    private int borrar;

    public Educacion() {
    }

    public Educacion(int idEducacion, String nombreInstitucion, String logoInstitucion, String nivelEstudios, Sobremi sobremi, int editar, int borrar) {
        this.idEducacion = idEducacion;
        this.nombreInstitucion = nombreInstitucion;
        this.logoInstitucion = logoInstitucion;
        this.nivelEstudios = nivelEstudios;
        this.sobremi = sobremi;
        this.editar = editar;
        this.borrar = borrar;
    }

    public int getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(int idEducacion) {
        this.idEducacion = idEducacion;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getLogoInstitucion() {
        return logoInstitucion;
    }

    public void setLogoInstitucion(String logoInstitucion) {
        this.logoInstitucion = logoInstitucion;
    }

    public String getNivelEstudios() {
        return nivelEstudios;
    }

    public void setNivelEstudios(String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    public Sobremi getSobremi() {
        return sobremi;
    }

    public void setSobremi(Sobremi sobremi) {
        this.sobremi = sobremi;
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