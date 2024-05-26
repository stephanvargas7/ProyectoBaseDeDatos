package com.corhuila.tallercarros.Service;

import com.corhuila.tallercarros.Entity.Piezas;
import com.corhuila.tallercarros.IRepository.IPiezasRepository;
import com.corhuila.tallercarros.IService.IPiezasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PiezasService implements IPiezasService {

    @Autowired
    private IPiezasRepository repository;

    @Override
    public List<Piezas> findAll(){
        return repository.findAll();
    }
    @Override
    public Optional<Piezas> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Piezas save(Piezas piezas) {
        return repository.save(piezas);
    }

    @Override
    public void update(Piezas piezas, Long id) {
        Optional<Piezas> ps = repository.findById(id);
        if (!ps.isEmpty()){
            Piezas PiezasUpdate = new Piezas();
            PiezasUpdate.setId(id);
            PiezasUpdate.setDescripcion(piezas.getDescripcion());
            PiezasUpdate.setReferencia(piezas.getReferencia());
            PiezasUpdate.setPrecio(piezas.getPrecio());

            repository.save(PiezasUpdate);
        }else{
            System.out.println("No se encuentra registrada esta pieza");
        }
    }

    @Override
    public void delete(Long id) {repository.deleteById(id);
    }
}
