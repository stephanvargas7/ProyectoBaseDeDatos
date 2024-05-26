package com.corhuila.tallercarros.IRepository;

import com.corhuila.tallercarros.Entity.Reparacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReparacionRepository extends JpaRepository<Reparacion, Long> {
}
