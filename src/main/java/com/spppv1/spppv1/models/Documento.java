package com.spppv1.spppv1.models;

public class Documento {
    private Long id;
    private String nombre;
    private String descripcion;
    private String fechaEntrega;

    public Documento(Long id) {
        this.id = id;
    }

    public Documento(Long id, String nombre, String descripcion, String fechaEntrega) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
