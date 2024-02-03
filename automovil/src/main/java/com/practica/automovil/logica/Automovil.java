
package com.practica.automovil.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 
 // @author :) Guerra
 
@Entity
public class Automovil implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_automovil;
    
    private String modelo;
    private String marca;
    private String color;
    private String motor;
    private String patente;
    private int cantPuertas;

    public Automovil() {
    }

    public Automovil(int id_automovil, String modelo, String marca, String color, String motor, String patente, int cantPuertas) {
        this.id_automovil = id_automovil;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.motor = motor;
        this.patente = patente;
        this.cantPuertas = cantPuertas;
    }

    public Automovil(String modelo, String marca, String color, String motor, String patente, int cantPuertas) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.motor = motor;
        this.patente = patente;
        this.cantPuertas = cantPuertas;
    }
    

    public int getId_automovil() {
        return id_automovil;
    }

    //public void setId_automovil(int id_automovil) {
    //    this.id_automovil = id_automovil;
    //}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    
    

}
