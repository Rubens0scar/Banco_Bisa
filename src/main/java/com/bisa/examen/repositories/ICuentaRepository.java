package com.bisa.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bisa.examen.models.CuentaModel;

@Repository
public interface ICuentaRepository extends JpaRepository<CuentaModel, Long>{
    
}
