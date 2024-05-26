package com.corhuila.tallercarros.IService;

import com.corhuila.tallercarros.Entity.Carro;

import java.util.List;
import java.util.Optional;

public interface ICarroService {

    List<Carro> findAll();
    Optional<Carro> findById(Long id);
    Carro save(Carro carro);
    void update(Carro carro, Long id);
    void delete(Long id);
}
