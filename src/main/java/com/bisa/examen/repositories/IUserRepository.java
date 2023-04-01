package com.bisa.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bisa.examen.models.UserModel;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long>{
    
}
