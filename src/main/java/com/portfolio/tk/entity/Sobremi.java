package com.portfolio.tk.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author germa
 */
@Entity
@Table(name = "sobremi")
public class Sobremi implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sobremi")
    private int idSobremi;

    @Column(name = "banner")
    private String banner;

    @Column(name = "imagen_perfil")
    private String imagenPerfil;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "informacion")
    private String informacion;

    @Column(name = "editar")
    private int editar;

    @Column(name = "borrar")
    private int borrar;

    public Sobremi() {
    }

    public Sobremi(int idSobremi, String banner, String imagenPerfil, String nombre, String apellido, String informacion, int editar, int borrar) {
        this.idSobremi = idSobremi;
        this.banner = banner;
        this.imagenPerfil = imagenPerfil;
        this.nombre = nombre;
        this.apellido = apellido;
        this.informacion = informacion;
        this.editar = editar;
        this.borrar = borrar;
    }

    public int getIdSobremi() {
        return idSobremi;
    }

    public void setIdSobremi(int idSobremi) {
        this.idSobremi = idSobremi;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(String imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
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