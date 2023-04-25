/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.practica.dos.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Empresa {
    private String ruc;
    private String razonSocial;
    
    //atributo de relacion de composicion
    
    private List<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }
    
    public Empresa(String ruc, String razonSocial) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.empleados = new ArrayList<>();
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    public void agregarEmpleado(double sueldo,String cedula,String nombre, String direccion,String cooreoElectronico){
        Empleado empleado = new Empleado(sueldo, cedula, nombre, direccion, cooreoElectronico);
        this.empleados.add(empleado);
    }

    @Override
    public String toString() {
        return "Empresa{" + "ruc=" + ruc + ", razonSocial=" + razonSocial + ", empleados=" + empleados + '}';
    }
    
}
