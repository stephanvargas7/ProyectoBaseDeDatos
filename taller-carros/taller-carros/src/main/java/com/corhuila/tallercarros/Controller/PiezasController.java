package com.corhuila.tallercarros.Controller;

import com.corhuila.tallercarros.Entity.Piezas;
import com.corhuila.tallercarros.IService.IPiezasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/piezas")
public class PiezasController {

    @Autowired
    private IPiezasService service;

    @GetMapping()
    public List<Piezas> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Piezas> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping()
    public Piezas save(@RequestBody Piezas piezas) {
        return service.save(piezas);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody Piezas piezas, @PathVariable Long id) {
        service.update(piezas, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
