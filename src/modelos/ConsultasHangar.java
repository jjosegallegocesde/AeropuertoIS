/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Juan
 */
public class ConsultasHangar extends BaseDatos {
    
    //ATRIBUTOS
    private PreparedStatement sentenciaSQL;
    private ResultSet resultadoConsulta;
    
    
    //METODOS
    public Hangar BuscarHangar(){
        
        //0. Crear un objeto de tipo Hangar
        Hangar hangar = new Hangar();
        
        //1. Establecer nocexion con BD
        Connection conexion=conectarBD();
        
        //2. Definir el string con la consulta SQL
        String consulta="SELECT * FROM hangares";
        
        //3. Intento hacer lo que estoy programando
        try{
            
            //4. Decile a BD que se prepare con tu consulta
            sentenciaSQL=conexion.prepareStatement(consulta);
            
            //5. Ejecuto la consulta
            resultadoConsulta=sentenciaSQL.executeQuery();
            
            //6. Depuro los datos que llegan
            if(resultadoConsulta.next()){
                
                hangar.setCodigoHangar(resultadoConsulta.getInt("codigo_hangar"));
                hangar.setCuposTotales(resultadoConsulta.getInt("cupos_totales"));
                hangar.setCuposDisponibles(resultadoConsulta.getInt("cupos_disponibles"));
                hangar.setCuposReservados(resultadoConsulta.getInt("cupos_reservados"));
                
                return hangar;
                
            }else{
                return null;
            }
            
            
            
        }catch(Exception error){
            System.out.println("Error cosnultando registro: "+error);
            return null;
            
        }finally{
            
            try{
                conexion.close(); 
            }catch(Exception error){
                System.out.println("error: "+error);
            }
            
        }
        
    }
    
    
    public void actualizarHangar(Hangar hangar){
        
        
        
 
        //1. Establecer nocexion con BD
        Connection conexion=conectarBD();
        
        
         //2. Definir el string con la consulta SQL
        String consulta="UPDATE hangares SET cupos_disponibles=?, cupos_reservados=? WHERE codigo_hangar=160";
        
        
        try{
            
            sentenciaSQL=conexion.prepareStatement(consulta);
            
            sentenciaSQL.setInt(1,hangar.getCuposDisponibles());
            sentenciaSQL.setInt(2,hangar.getCuposReservados());
            
            int resultado=sentenciaSQL.executeUpdate();
            
            
            
            
            
            
        }catch(Exception error){
            
            System.out.println("Error actualizando el registro: "+error);
            
        }finally{
            
             try{
                conexion.close(); 
            }catch(Exception error){
                System.out.println("error: "+error);
            }
            
        }
        
        
    }
    
    
    
}
