package com.corhuila.tallercarros.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "carro")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "marca", length = 50, nullable = false)
    private String marca;
    @Column(name = "modelo", length = 50, nullable = false)
    private String modelo;
    @Column(name = "color", length = 50, nullable = false)
    private String color;
    @Column(name = "km", length = 50, nullable = false)
    private String km;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ClienteId", nullable = false)

    private Cliente clienteId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public Cliente getClienteId() {
        return clienteId;
    }

    public void setClienteId(Cliente clienteId) {
        this.clienteId = clienteId;
    }
}
