/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.Date;

/**
 *
 * @author PC6
 */
public class Empleado extends Persona {
    float salario;
    Date fecha_ent;

    public Empleado() {
        this.salario = salario;
        this.fecha_ent = fecha_ent;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getFecha_ent() {
        return fecha_ent;
    }

    public void setFecha_ent(Date fecha_ent) {
        this.fecha_ent = fecha_ent;
    }
    
    
}
