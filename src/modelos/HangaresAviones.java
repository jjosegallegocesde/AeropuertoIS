/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Date;

/**
 *
 * @author Juan
 */
public class HangaresAviones {
    
    private int codgiHangar;
    private String matriculaAvion;
    private Date fechaIngreso;
    private int numeroCelda;

    public int getCodgiHangar() {
        return codgiHangar;
    }

    public void setCodgiHangar(int codgiHangar) {
        this.codgiHangar = codgiHangar;
    }

    public String getMatriculaAvion() {
        return matriculaAvion;
    }

    public void setMatriculaAvion(String matriculaAvion) {
        this.matriculaAvion = matriculaAvion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getNumeroCelda() {
        return numeroCelda;
    }

    public void setNumeroCelda(int numeroCelda) {
        this.numeroCelda = numeroCelda;
    }
    
    
    
    
    
    
}
