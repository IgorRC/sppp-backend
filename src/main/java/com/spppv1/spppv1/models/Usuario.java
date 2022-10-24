package com.spppv1.spppv1.models;

public class Usuario {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String pasword;

    public Usuario(String nombre, String apellido, String email, String pasword) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.pasword = pasword;
    }

    public Usuario(Long id, String nombre, String apellido, String email, String pasword) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.pasword = pasword;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
}
