package com.corhuila.tallercarros.Controller;


import com.corhuila.tallercarros.Entity.DetalleReparacion;
import com.corhuila.tallercarros.IService.IDetalleReparacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/detallereparacion")
public class DetalleReparacionController {

    @Autowired
    private IDetalleReparacionService service;

    @GetMapping()
    public List<DetalleReparacion> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DetalleReparacion> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping()
    public DetalleReparacion save(@RequestBody DetalleReparacion detalleReparacion) {return service.save(detalleReparacion);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody DetalleReparacion detalleReparacion, @PathVariable Long id) {
        service.update(detalleReparacion, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }


}
