package com.dataimage.m3_lab3.model;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "paterno")
    private String paterno;
    @Column(name = "materno")
    private String materno;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "email")
    private String email;
    @OneToOne(mappedBy = "persona", fetch = FetchType.LAZY)
    private Usuario usuario;

    public Persona() {
    }

    public Persona(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    

}
