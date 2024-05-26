package com.corhuila.tallercarros.IService;

import com.corhuila.tallercarros.Entity.DetalleReparacion;

import java.util.List;
import java.util.Optional;

public interface IDetalleReparacionService {


    List<DetalleReparacion> findAll();
    Optional<DetalleReparacion> findById(Long id);
    DetalleReparacion save(DetalleReparacion detallereparacion);
    void update(DetalleReparacion  detalleReparacion, Long id);
    void delete(Long id);
}
