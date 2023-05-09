package com.portfolio.tk.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author germa
 */
@Entity
@Table(name = "navbar")
public class Navbar implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_navbar")
    private int idNavbar;

    @Column(name = "link_linkedin")
    private String linkLinkedin;

    @Column(name = "link_github")
    private String linkGithub;

    @Column(name = "link_codepen")
    private String linkCodepen;

    @Column(name = "editar")
    private boolean editar;

    @Column(name = "borrar")
    private boolean borrar;

    public Navbar() {
    }

    public Navbar(int idNavbar, String linkLinkedin, String linkGithub, String linkCodepen, boolean editar, boolean borrar) {
        this.idNavbar = idNavbar;
        this.linkLinkedin = linkLinkedin;
        this.linkGithub = linkGithub;
        this.linkCodepen = linkCodepen;
        this.editar = editar;
        this.borrar = borrar;
    }

    public int getIdNavbar() {
        return idNavbar;
    }

    public void setIdNavbar(int idNavbar) {
        this.idNavbar = idNavbar;
    }

    public String getLinkLinkedin() {
        return linkLinkedin;
    }

    public void setLinkLinkedin(String linkLinkedin) {
        this.linkLinkedin = linkLinkedin;
    }

    public String getLinkGithub() {
        return linkGithub;
    }

    public void setLinkGithub(String linkGithub) {
        this.linkGithub = linkGithub;
    }

    public String getLinkCodepen() {
        return linkCodepen;
    }

    public void setLinkCodepen(String linkCodepen) {
        this.linkCodepen = linkCodepen;
    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    public boolean isBorrar() {
        return borrar;
    }

    public void setBorrar(boolean borrar) {
        this.borrar = borrar;
    }
}
