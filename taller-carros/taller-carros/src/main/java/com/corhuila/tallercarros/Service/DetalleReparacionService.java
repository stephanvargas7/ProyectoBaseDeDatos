package com.corhuila.tallercarros.Service;

import com.corhuila.tallercarros.Entity.DetalleReparacion;
import com.corhuila.tallercarros.IRepository.IDetalleReparacionRepository;
import com.corhuila.tallercarros.IService.IDetalleReparacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleReparacionService implements IDetalleReparacionService {

    @Autowired
    private IDetalleReparacionRepository repository;

    @Override
    public List<DetalleReparacion> findAll(){
        return repository.findAll();
    }
    @Override
    public Optional<DetalleReparacion> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public DetalleReparacion save(DetalleReparacion detallereparacion) {
        return repository.save(detallereparacion);
    }

    @Override
    public void update(DetalleReparacion detalleReparacion, Long id) {
        Optional<DetalleReparacion> ps = repository.findById(id);
        if (!ps.isEmpty()){
            DetalleReparacion DetalleReparacionUpdate = new DetalleReparacion();
            DetalleReparacionUpdate.setId(id);
            DetalleReparacionUpdate.setUnidades_reparadas(detalleReparacion.getUnidades_reparadas());
            DetalleReparacionUpdate.setPiezasId(detalleReparacion.getPiezasId());
            DetalleReparacionUpdate.setReparacionId(detalleReparacion.getReparacionId());

            repository.save(DetalleReparacionUpdate);
        }else{
            System.out.println("No se encuentra registrado el detalle de esta repaarcion");
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
