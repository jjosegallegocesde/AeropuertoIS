/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuertois;

import controladores.ControladorAvion;
import controladores.ControladorPropietario;
import java.util.Scanner;
import modelos.Avion;
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
        
        
        //crear objeto de tipo vista (Propietario)
        VistaPropietario vistaPropietario = new VistaPropietario();
        Propietario propietario = vistaPropietario.activarVista();
        
        //llamar al controlador
        ControladorPropietario controladorPropietario = new ControladorPropietario();
        controladorPropietario.registrarPropietario(propietario);
        
        //crear objeto de tipo vista (Avion)
        VistaAvion vistaAvion = new VistaAvion();
        Avion avion = vistaAvion.activarVista();
        
        //llamar controlador
        ControladorAvion controladorAvion = new ControladorAvion();
        controladorAvion.registrarAvion(avion);
        
        
        
       
        
        
    }
    
}
