package com.corhuila.tallercarros.Service;

import com.corhuila.tallercarros.IRepository.ICarroRepository;
import com.corhuila.tallercarros.IService.ICarroService;
import com.corhuila.tallercarros.Entity.Carro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroService  implements ICarroService{

    @Autowired
    private ICarroRepository repository;

    @Override
    public List<Carro> findAll(){
        return repository.findAll();
    }
    @Override
    public Optional<Carro> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Carro save(Carro carro) {
        return repository.save(carro);
    }

    @Override
    public void update(Carro carro, Long id) {
        Optional<Carro> ps = repository.findById(id);
        if (!ps.isEmpty()){
            Carro carroUpdate = new Carro();
            carroUpdate.setId(id);
            carroUpdate.setMarca(carro.getMarca());
            carroUpdate.setModelo(carro.getModelo());
            carroUpdate.setColor(carro.getColor());
            carroUpdate.setKm(carro.getKm());
            carroUpdate.setClienteId(carro.getClienteId());

            repository.save(carroUpdate);
        }else{
            System.out.println("No se encuentra registrado el carro");
        }
    }

    @Override
    public void delete(Long id) {

        repository.deleteById(id);
    }
}

