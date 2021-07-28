/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.Avion;
import modelos.ConsultasAvion;

/**
 *
 * @author Juan
 */
public class ControladorAvion {
    
    private ConsultasAvion modelo = new ConsultasAvion();
    
    public void registrarAvion(Avion avion){
        
        modelo.insertarAvion(avion);
        
    }
    
}
