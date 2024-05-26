package com.corhuila.tallercarros.IRepository;

import com.corhuila.tallercarros.Entity.Piezas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPiezasRepository extends JpaRepository<Piezas, Long> {
}
