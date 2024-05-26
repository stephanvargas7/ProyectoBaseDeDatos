package com.corhuila.tallercarros.Controller;

import com.corhuila.tallercarros.Entity.Cliente;
import com.corhuila.tallercarros.IService.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/cliente")
public class ClienteController {

    @Autowired
    private IClienteService service;

    @GetMapping()
    public List<Cliente> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping()
    public Cliente save(@RequestBody Cliente cliente) {
        return service.save(cliente);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody Cliente cliente, @PathVariable Long id) {
        service.update(cliente, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
