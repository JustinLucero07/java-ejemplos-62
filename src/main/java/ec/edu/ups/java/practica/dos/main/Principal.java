/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.java.practica.dos.main;

import ec.edu.ups.java.practica.dos.clases.Cliente;
import ec.edu.ups.java.practica.dos.clases.Directivo;
import ec.edu.ups.java.practica.dos.clases.Empresa;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("094984000","0151156", "PEPITO", "CALLE VIEJA","PEPITO@ADHSJSHAJDKSA");
        
        Empresa empresaUno = new Empresa("051656156000", "salesianos . in");
        empresaUno.agregarEmpleado(1000.26, "fghgh02", "Juan", "calle nueva", "juanfjhajfhjkaf");
        empresaUno.agregarEmpleado(625.26, "fghgh03", "diego", "calle nueva 1", "diegofjhajfhjkaf");
        empresaUno.agregarEmpleado(585.65, "fghgh25", "carlos", "calle nueva 2", "carlosjhajfhjkaf");
        
        
        empresaUno.agregarDirectivo("jefe", 2000, "006550", "jose", "direccion 6", "josejkdsajdjskla");
        
        empresaUno.agrgarSubordinadoDitectivo("fghgh02", "006550");
        
        System.out.println("Datos empresa: "+ empresaUno.toString());
        
    }
}
