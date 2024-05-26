package com.corhuila.tallercarros.Service;

import com.corhuila.tallercarros.Entity.Cliente;
import com.corhuila.tallercarros.IRepository.IClienteRepository;
import com.corhuila.tallercarros.IService.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteRepository repository;

    @Override
    public List<Cliente> findAll(){
        return repository.findAll();
    }
    @Override
    public Optional<Cliente> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public void update(Cliente cliente,Long id) {
        Optional<Cliente> ps = repository.findById(id);
        if (!ps.isEmpty()){
            Cliente clienteUpdate = new Cliente();
            clienteUpdate.setId(id);
            clienteUpdate.setNombre(cliente.getNombre());
            clienteUpdate.setApellido(cliente.getApellido());
            clienteUpdate.setDireccion(cliente.getDireccion());
            clienteUpdate.setTelefono(cliente.getTelefono());
            repository.save(clienteUpdate);
        }else{
            System.out.println("No se encuentra registrado el cliente en el taller");
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
