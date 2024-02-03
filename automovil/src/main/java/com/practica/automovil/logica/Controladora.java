
package com.practica.automovil.logica;

  // @author :) Guerr
import com.practica.automovil.persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String model, String brand, String color, String engine, String patent, int numberDoors) {
        
        Automovil auto = new Automovil(model, model, color, color, patent, numberDoors);
        
        controlPersis.addCar(auto);

    }
    
    

}
