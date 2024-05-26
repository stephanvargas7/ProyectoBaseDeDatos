package com.corhuila.tallercarros.IService;

import com.corhuila.tallercarros.Entity.Piezas;

import java.util.List;
import java.util.Optional;

public interface IPiezasService {



    List<Piezas> findAll();
    Optional<Piezas> findById(Long id);
    Piezas save(Piezas piezas);
    void update(Piezas piezas, Long id);
    void delete(Long id);
}
