/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.Scanner;
import modelos.Avion;

/**
 *
 * @author Juan
 */
public class VistaAvion {
    
    public Avion activarVista(){
        
        Scanner entrada = new Scanner(System.in);
        Avion avion = new Avion();
        
        System.out.println("*********************************");
        System.out.println("Ahora diligenciemos los datos de la aeronave: ");
        
        System.out.println("Digita la matricula del avion: ");
        avion.setMatricula(entrada.next());
        
        System.out.println("Digita el modelo del avion: ");
        avion.setModelo(entrada.next());
        
        System.out.println("Digita la cedula del propietario: ");
        avion.setCedulaPropietario(entrada.next());
        
        System.out.println("Digita el tipo de contrato: (1=anual/2=mes)");
        avion.setTipoCPontrato(entrada.nextInt());
        
        return avion;
        
    }
    
}
