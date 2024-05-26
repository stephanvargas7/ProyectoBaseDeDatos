package com.corhuila.tallercarros.Entity;


import jakarta.persistence.*;


@Entity
@Table(name = "reparacion")
public class Reparacion {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "num_reparacion", length = 50, nullable = false)
        private String num_reparacion;
    @Column(name = "descripcion", length = 50, nullable = false)
    private String descripcion;
    @Column(name = "fecha_entrada", length = 50, nullable = false)
    private String fecha_entrada;
    @Column(name = "fecha_salida", length = 50, nullable = false)
    private String fecha_salida;
    @Column(name = "horas", length = 50, nullable = false)
    private String horas;


    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "carroId", nullable = false)

    private Carro carroId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNum_reparacion() {
        return num_reparacion;
    }

    public void setNum_reparacion(String num_reparacion) {
        this.num_reparacion = num_reparacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public Carro getCarroId() {
        return carroId;
    }

    public void setCarroId(Carro carroId) {
        this.carroId = carroId;
    }
}
