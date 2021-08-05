/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuertois;

import controladores.ControladorAvion;
import controladores.ControladorHangar;
import controladores.ControladorHangarAvion;

import controladores.ControladorPropietario;
import java.util.Scanner;
import modelos.Avion;
import modelos.Hangar;
import modelos.Propietario;
import vistas.VistaAvion;
import vistas.VistaPropietario;

/**
 *
 * @author Juan
 */
public class AeropuertoIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Buscar info del hangar
        ControladorHangar controladorHangar= new ControladorHangar();
        Hangar hangar=controladorHangar.consultarInformacionHangar();
        
        //1. Preguntar si tengo cupos disponibles en el hangar
        if(hangar.getCuposDisponibles()>0){
            
            //2. Registro en BD el propietario
            VistaPropietario vistaPropietario = new VistaPropietario();
            Propietario propietario = vistaPropietario.activarVista();
            ControladorPropietario controladorPropietario = new ControladorPropietario();
            controladorPropietario.registrarPropietario(propietario);
            
            //3. Registro en BD el avion
            VistaAvion vistaAvion = new VistaAvion();
            Avion avion = vistaAvion.activarVista();
            ControladorAvion controladorAvion = new ControladorAvion();
            controladorAvion.registrarAvion(avion);
            
            //4. Matricular en BD (hangares-aviones) el avion en el hangar
            ControladorHangarAvion controladorHangarAvion = new ControladorHangarAvion();
            controladorHangarAvion.matricularAvionEnHangar(avion.getMatricula());
            
            //5. Actualizar los cupos dispoibles y reservados en la BD (TABLA HANGAR)
            controladorHangar.actualizarHangar(hangar);
            
            
            
            
        }else{
            
            System.out.println("No tenemos cupos disponibles");
            
        }
        
        
        //crear objeto de tipo vista (Propietario)
        /*
        
        //llamar al controlador
       
        */
        
        
        //crear objeto de tipo vista (Avion)
        /*
        
        //llamar controlador
        
        */
        
        
        
       
        
        
    }
    
}
