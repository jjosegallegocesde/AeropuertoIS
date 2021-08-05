/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelos.ConsultasHangar;
import modelos.Hangar;
import vistas.VistaHangar;

/**
 *
 * @author Juan
 */
public class ControladorHangar {
    
    //ATRIBUTOS
    private ConsultasHangar modelo = new ConsultasHangar();
    private VistaHangar vista= new VistaHangar();
    
    //METODOS
    public Hangar consultarInformacionHangar(){
        Hangar hangar=modelo.BuscarHangar();
        return hangar;
        //vista.activarVista(hangar);
    }
    
    public void actualizarHangar(Hangar hangar){
        
        int cuposDisponiblesAntesMatricula=hangar.getCuposDisponibles();
        int cuposDisponiblesDespuesMatricula=cuposDisponiblesAntesMatricula-1;
        
        int cuposReservadosAntesMatricula=hangar.getCuposReservados();
        int cuposReservadosDespuesMatricula=cuposReservadosAntesMatricula+1;
        
        
        hangar.setCuposDisponibles(cuposDisponiblesDespuesMatricula);
        hangar.setCuposReservados(cuposReservadosDespuesMatricula);
        
        modelo.actualizarHangar(hangar);
        
        
        
        
    }
    
    
    
    
}
