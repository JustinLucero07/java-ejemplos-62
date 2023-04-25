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
public class Directivo extends Empleado {
    private String categoria;
    
    //Atributo de relacion
    private List<Empleado> subordinados;

    public Directivo() {
        this.subordinados = new ArrayList<>();
    }

    public Directivo(String categoria, List<Empleado> subordinados, double sueldo, String cedula, String nombre, String direccion, String correoElectronico) {
        super(sueldo, cedula, nombre, direccion, correoElectronico);
        this.categoria = categoria;
        this.subordinados = subordinados;
        this.subordinados = new ArrayList<>();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void agregarSubordinado(Empleado empleado){
        this.subordinados.add(empleado);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Directivo{" + "categoria=" + categoria + ", subordinados=" + subordinados + '}';
    }
    
    
}
