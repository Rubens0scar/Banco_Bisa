package com.bisa.examen.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bisa.examen.models.CuentaModel;
import com.bisa.examen.services.CuentaServices;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {
    @Autowired
    private CuentaServices cuentaServices;

    @GetMapping
    public ArrayList<CuentaModel> getCuenta(){
        return this.cuentaServices.getCuenta();
    }

    @GetMapping(path = "/{id}")
    public Optional<CuentaModel> getCuentaById(@PathVariable Long Id){
        return this.cuentaServices.getCuentaById(Id);
    }

    @GetMapping(path = "/{id}")
    public Optional<CuentaModel> getUserById(@PathVariable Long Id){
        return this.cuentaServices.getById(Id);
    }

    @PutMapping(path = "/{id}")
    public CuentaModel updateCuentaById(@RequestBody CuentaModel request, @PathVariable("id") Long id){
        return this.cuentaServices.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.cuentaServices.deleteUser(id);

        if(ok){
            return "Cuenta con id " + id + " fue eliminado con exito";
        }else{
            return "Error al eliminar la cuenta.";
        }
    }

    // @PostMapping
    // public CuentaServices saveCuenta(@RequestBody CuentaModel cuenta){
    //     return this.cuentaServices.saveCuenta(cuenta);
    // }

}
