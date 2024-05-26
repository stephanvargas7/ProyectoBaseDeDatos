package com.corhuila.tallercarros.IRepository;

import com.corhuila.tallercarros.Entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarroRepository extends JpaRepository<Carro, Long> {


}
