package com.corhuila.tallercarros.Controller;

import com.corhuila.tallercarros.Entity.Reparacion;
import com.corhuila.tallercarros.IService.IReparacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/reparacion")
public class ReparacionController {

    @Autowired
    private IReparacionService service;

    @GetMapping()
    public List<Reparacion> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Reparacion> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping()
    public Reparacion save(@RequestBody Reparacion reparacion) {
        return service.save(reparacion);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody Reparacion reparacion, @PathVariable Long id) {
        service.update(reparacion, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
