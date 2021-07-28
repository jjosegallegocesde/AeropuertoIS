/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;


        
/**
 *
 * @author Juan
 */
public class BaseDatos {
    
    //ATRIBUTOS
    private static final String URL="jdbc:mysql://localhost/aeropuertois";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    
  
    //METODOS
    public Connection conectarBD(){
        
        Connection conexion=null;
       
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(URL,USUARIO,PASSWORD);
            System.out.println("Exito conectandose a la BD");
            return conexion;
            
            
        }catch(Exception error){
            System.out.println("Tenemos problemas "+error);
            return null;
        }
            
    }
    
}
