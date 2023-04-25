/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.practica.dos.clases;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona{
    private String telefeno;

    public Cliente() {
    }

    public Cliente(String telefeno, String cedula, String nombre, String direccion, String correoElectronico) {
        super(cedula, nombre, direccion, correoElectronico);
        this.telefeno = telefeno;
    }

    public String getTelefeno() {
        return telefeno;
    }

    public void setTelefeno(String telefeno) {
        this.telefeno = telefeno;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Cliente{" + "telefeno=" + telefeno + '}';
    }
    
    
        
}
