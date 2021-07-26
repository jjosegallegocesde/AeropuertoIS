/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuertois;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class AeropuertoIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //USAR LA CLASE BASEDATOS (CREAR UN OBJETO)
        Scanner entrada = new Scanner(System.in);
        BaseDatos bd = new BaseDatos();
        
        System.out.println("Bienvenido al hanagr 160");
        
        System.out.println("Digite la cedula del propietario: ");
        String cedula=entrada.next();
        
        System.out.println("Digite los nombres del propietario");
        String nombres=entrada.next();
        
        System.out.println("Digite el metodo de pago (1 o 2)");
        int metodo=entrada.nextInt();
        
        bd.insertarPropietario(cedula, nombres, metodo);
        
       
        
        
    }
    
}
