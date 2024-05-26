package com.corhuila.tallercarros.IService;

import com.corhuila.tallercarros.Entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {


    List<Cliente> findAll();
    Optional<Cliente> findById(Long id);
    Cliente save(Cliente cliente);
    void update(Cliente cliente, Long id);
    void delete(Long id);
}
