/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22025.clase4;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Persona {
    
    public int cedula;
    public String nombre;
    public int edad;
    public double salario;
    public Carro carro;
    
    
    /*
    Esto es un metodo que no devuelve nada y grita un mensaje
    */
    public void gritarFrase(){
        JOptionPane.showMessageDialog(null, "DEJE QUE EL PATO NADE "+ nombre );
    }
    
    /**
     * Es metodo que se utiliza para mentir sobre nuestra edad
     * @return el valor que devuelve varia de la edad
     */
    public int mentiraEdad(){
        if (edad < 18)
            return edad + 5;
        else if (edad > 35)
            return edad - 5;
        else
            return edad;
    }
    
    /**
     * Esto metodo de ejemplo para que mostrar el javaDOC
     * @param parametro1 este parametro se utiliza para saber que
     * @return el valor que devuelve es de practica
     */
    
    
    public String metodoEjemploJavaDoc(String parametro1){
    
        return null;
    
    }
    
    
    
    
    
}
