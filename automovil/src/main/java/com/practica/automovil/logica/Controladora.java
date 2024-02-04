
package com.practica.automovil.logica;

  // @author :) Guerr
import com.practica.automovil.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String model, String brand, String color, String engine, String patent, int numberDoors) {
        
        Automovil auto = new Automovil(model, brand, color, engine, patent, numberDoors);
        
        controlPersis.addCar(auto);

    }

    public List<Automovil> traerAutos() {

        return controlPersis.traerAutos();
    }
    
    public Automovil traerAuto(int id){
        return controlPersis.traerAuto(id);
    }

    public void modificarAuto(Automovil auto, String model, String brand, String color, String engine, 
                              String patent, int numberDoors) throws Exception {
        
        auto.setColor(color);
        auto.setModelo(model);
        auto.setMarca(brand);
        auto.setMotor(engine);
        auto.setPatente(patent);
        auto.setCantPuertas(numberDoors);
        
        controlPersis.modificarAuto(auto);
    }
    

}
