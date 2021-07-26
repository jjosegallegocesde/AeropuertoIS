/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuertois;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Juan
 */
public class BaseDatos {
    
    //ATRIBUTOS
    private static final String URL="jdbc:mysql://localhost/aeropuertois";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    
    private PreparedStatement sentenciaSQL;
    
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
    
    public void insertarPropietario(String cedula, String nombres, int metodoPago){
        
        //1. Establecer nocexion con BD
        Connection conexion=conectarBD();
        
        String consulta="INSERT INTO propietarios(cedula,nombres,metodo_pago)"
                + "VALUES(?,?,?)";
        //2. INTENTO LLEVAR DATOS
        try{
            
            //3. Asociarl el PS a la conexion
            sentenciaSQL=conexion.prepareStatement(consulta);
            
            //4. Diferenciar la consulta (Personalizar)
             sentenciaSQL.setString(1,cedula);
             sentenciaSQL.setString(2, nombres);
             sentenciaSQL.setInt(3, metodoPago);
             
             //5. Ejecutar la consulta
             int resultado=sentenciaSQL.executeUpdate();
             
             //6. validar el resultado
             if(resultado>0){
                 System.out.println("Exito registrando el propietario"); 
             }else{
                 System.out.println("Error al agregar el registro");
             }
            
        }catch(Exception error){
             System.out.println("No se puedo registrar el propietario: "+error);
             
        }finally{
            
            try{
                conexion.close();
            }catch(Exception error){
                System.out.println("error: "+error);
            }
            
        }
        
        
        
    }
    
    
   
}
