package ar.edu.unju.fi.tpfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.tpfinal.entity.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local, Integer>{
    
}
