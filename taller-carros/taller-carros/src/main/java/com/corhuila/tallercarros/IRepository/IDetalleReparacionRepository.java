package com.corhuila.tallercarros.IRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.corhuila.tallercarros.Entity.DetalleReparacion;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleReparacionRepository extends JpaRepository<DetalleReparacion, Long> {
}
