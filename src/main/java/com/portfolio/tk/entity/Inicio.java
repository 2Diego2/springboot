package com.portfolio.tk.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author germa
 */
@Entity
@Table(name = "inicio")
public class Inicio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inicio")
    private int idInicio;

    @Column(name = "logo")
    private String logo;

    @Column(name = "link_pagina")
    private String linkPagina;

    public Inicio() {
    }

    public Inicio(int idInicio, String logo, String linkPagina) {
        this.idInicio = idInicio;
        this.logo = logo;
        this.linkPagina = linkPagina;
    }

    public int getIdInicio() {
        return idInicio;
    }

    public void setIdInicio(int idInicio) {
        this.idInicio = idInicio;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLinkPagina() {
        return linkPagina;
    }

    public void setLinkPagina(String linkPagina) {
        this.linkPagina = linkPagina;
    }
}