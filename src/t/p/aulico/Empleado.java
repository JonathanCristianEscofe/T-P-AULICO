/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t.p.aulico;

import java.util.ArrayList;

/**
 *
 * @author Cristian
 */
public class Empleado  {

    private int dni;
    private String nombre;
    private String Apellido;
    private String Categoria;
    private double sueldo;
    private Empresa empresa;

    public Empleado(int dni, String nombre, String Apellido, String Categoria, double sueldo, Empresa empresa) {
        
        this.dni = dni;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Categoria = Categoria;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}
