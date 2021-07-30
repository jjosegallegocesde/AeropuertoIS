/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import modelos.Hangar;

/**
 *
 * @author Juan
 */
public class VistaHangar {
    
    public void activarVista(Hangar hangar){
        
        System.out.println("*********");
        System.out.println("LOS DATOS DEL HANGAR");
        
        System.out.println("");
        
        System.out.print("Cupos totales del hangar: "+hangar.getCuposTotales());
        System.out.println("");
        System.out.println("Cupos Disponibles: "+hangar.getCuposDisponibles());
        System.out.println("");
        System.out.println("Cupos Reservados: "+hangar.getCuposReservados());
        
    }
    
}
