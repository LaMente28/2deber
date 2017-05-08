/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author PC6
 */
public class Estudiante extends Persona{
        
    Scanner leer = new Scanner(System.in);
    String status;
    
    public Estudiante() {
        this.status = "";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    void status(){
        System.out.println("INGRESE EL CURSO DEL ESTUDIANTE: ");
        status = leer.next();
    }
}
