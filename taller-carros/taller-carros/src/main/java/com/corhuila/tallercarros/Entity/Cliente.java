package com.corhuila.tallercarros.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "nombre", length = 50, nullable = false)
        private String nombre;
         @Column(name = "apellido", length = 50, nullable = false)
        private String apellido;
         @Column(name = "direccion", length = 50, nullable = false)
        private String direccion;
        @Column(name = "telefono", length = 50, nullable = false)
         private String telefono;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
