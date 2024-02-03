
package com.practica.automovil.persistencia;

import com.practica.automovil.logica.Automovil;



public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void addCar(Automovil auto) {
        
        autoJpa.create(auto);   
        
    }




}
