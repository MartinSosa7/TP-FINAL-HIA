package ar.edu.unju.fi.tpfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.tpfinal.entity.Novedad;

@Repository
public interface NovedadRepository extends JpaRepository<Novedad, Integer>{
    
}
