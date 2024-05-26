package com.corhuila.tallercarros.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "piezas")
public class Piezas {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "referencia", length = 50, nullable = false)
        private String referencia;
        @Column(name = "descripcion", length = 50, nullable = false)
        private String descripcion;

        @Column(name = "precio", length = 50, nullable = false)
        private String precio;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getReferencia() {
            return referencia;
        }

        public void setReferencia(String referencia) {
            this.referencia = referencia;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getPrecio() {
            return precio;
        }

        public void setPrecio(String precio) {
            this.precio = precio;
        }
    }
