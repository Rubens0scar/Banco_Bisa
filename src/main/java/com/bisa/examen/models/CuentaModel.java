package com.bisa.examen.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cuenta")
public class CuentaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String cuenta;

    @Column
    private Number balance_inicial;

    @Column
    private Number balance_final;

    @Column
    private String estado;

    @Column
    private Long id_user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public Number getBalance_inicial() {
        return balance_inicial;
    }

    public void setBalance_inicial(Number balance_inicial) {
        this.balance_inicial = balance_inicial;
    }

    public Number getBalance_final() {
        return balance_final;
    }

    public void setBalance_final(Number balance_final) {
        this.balance_final = balance_final;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

   
}
