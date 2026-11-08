package com.ejemplo.iaaact1t4.models.dto;

public class MateriaDTO {
    private String nombre, area;

    public MateriaDTO() {
    }

    public MateriaDTO(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }
}