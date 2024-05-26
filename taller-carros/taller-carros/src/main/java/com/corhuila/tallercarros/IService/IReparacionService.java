package com.corhuila.tallercarros.IService;

import com.corhuila.tallercarros.Entity.Reparacion;

import java.util.List;
import java.util.Optional;

public interface IReparacionService {



    List<Reparacion> findAll();
    Optional<Reparacion> findById(Long id);
    Reparacion save(Reparacion reparacion);
    void update(Reparacion reparacion, Long id);
    void delete(Long id);
}
