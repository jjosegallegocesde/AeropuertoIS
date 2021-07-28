/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuertois;

import controladores.ControladorPropietario;
import java.util.Scanner;
import modelos.Propietario;
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
        
        
        //crear objeto de tipo vista
        VistaPropietario vistaPropietario = new VistaPropietario();
        Propietario propietario = vistaPropietario.activarVista();
        
        //llamar al controlador
        ControladorPropietario controladorPropietario = new ControladorPropietario();
        controladorPropietario.registrarPropietario(propietario);
        
        
       
        
        
    }
    
}
