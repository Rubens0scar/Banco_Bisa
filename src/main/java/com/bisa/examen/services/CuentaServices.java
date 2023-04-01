package com.bisa.examen.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bisa.examen.models.CuentaModel;
import com.bisa.examen.repositories.ICuentaRepository;

@Service
public class CuentaServices {
    @Autowired
    ICuentaRepository cuentaRepository;

    public ArrayList<CuentaModel> getCuenta(){
        return (ArrayList<CuentaModel>) cuentaRepository.findAll();
    }

    public Optional<CuentaModel> getCuentaById(Long id){
        return cuentaRepository.findById(id);
    }

    public CuentaModel saveCuenta(CuentaModel cuenta){
        return cuentaRepository.save(cuenta);
    }

    public Optional<CuentaModel> getById(Long id){
        return cuentaRepository.findById(id);
    }

    public CuentaModel updateById(CuentaModel request, Long id){
        CuentaModel cuenta = cuentaRepository.findById(id).get();

        cuenta.setBalance_final(request.getBalance_final());
        cuenta.setEstado(request.getEstado());

        return cuenta;
    }   

    public Boolean deleteUser(Long id){
        try {
            cuentaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
