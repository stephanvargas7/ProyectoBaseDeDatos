package com.corhuila.tallercarros.Service;

import com.corhuila.tallercarros.Entity.Reparacion;
import com.corhuila.tallercarros.IRepository.IReparacionRepository;
import com.corhuila.tallercarros.IService.IReparacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReparacionService implements IReparacionService {

    @Autowired
    private IReparacionRepository repository;

    @Override
    public List<Reparacion> findAll(){
        return repository.findAll();
    }
    @Override
    public Optional<Reparacion> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Reparacion save(Reparacion reparacion) {
        return repository.save(reparacion);
    }

    @Override
    public void update(Reparacion reparacion, Long id) {
        Optional<Reparacion> ps = repository.findById(id);
        if (!ps.isEmpty()){
            Reparacion reparacionUpdate = new Reparacion();
            reparacionUpdate.setId(id);
            reparacionUpdate.setNum_reparacion(reparacion.getNum_reparacion());
            reparacionUpdate.setDescripcion(reparacion.getDescripcion());
            reparacionUpdate.setFecha_entrada(reparacion.getFecha_entrada());
            reparacionUpdate.setFecha_salida(reparacion.getFecha_salida());
            reparacionUpdate.setHoras(reparacion.getHoras());
            reparacionUpdate.setCarroId(reparacion.getCarroId());


            repository.save(reparacionUpdate);
        }else{
            System.out.println("No se encuentra registrada esta reparacion");
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
