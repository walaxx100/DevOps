package com.example.devops.dto;

import lombok.Data;

@Data
public class ClienteDto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private double altura;
    private double peso;
    private String dui;
    private int edad;
}
