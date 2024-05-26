package com.corhuila.tallercarros.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "detallereparacion")
public class DetalleReparacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "unidades_reparadas", length = 50, nullable = false)
    private String unidades_reparadas;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "piezasId", nullable = false)

    private Piezas piezasId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "reparacionId", nullable = false)

    private Reparacion reparacionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnidades_reparadas() {
        return unidades_reparadas;
    }

    public void setUnidades_reparadas(String unidades_reparadas) {
        this.unidades_reparadas = unidades_reparadas;
    }

    public Piezas getPiezasId() {
        return piezasId;
    }

    public void setPiezasId(Piezas piezasId) {
        this.piezasId = piezasId;
    }

    public Reparacion getReparacionId() {
        return reparacionId;
    }

    public void setReparacionId(Reparacion reparacionId) {
        this.reparacionId = reparacionId;
    }
}
