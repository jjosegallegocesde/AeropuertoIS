/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.ConsultasHangaresAviones;

/**
 *
 * @author Juan
 */
public class ControladorHangarAvion {
    
    private ConsultasHangaresAviones modelo= new ConsultasHangaresAviones();
    
    
    public void matricularAvionEnHangar(String matriculaAvion){
        
        modelo.insertarAvionHangar(matriculaAvion);
        
        
    }
    
    
}
