
package com.practica.automovil.persistencia;

import com.practica.automovil.logica.Automovil;
import java.util.List;



public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void addCar(Automovil auto) {
        
        autoJpa.create(auto);   
        
    }

    public List<Automovil> traerAutos() {

        return autoJpa.findAutomovilEntities();
    }

    public Automovil traerAuto(int id){
        return autoJpa.findAutomovil(id);
    }

    public void modificarAuto(Automovil auto) throws Exception {

            autoJpa.edit(auto);
    }



}
