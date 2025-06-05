/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c22025.clase4;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C22025Clase4 {
    
    
    public String nombreEmpresa = "Sistema patitos SA";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona kata = new Persona();
        Persona juan = new Persona();
        Persona julia = new Persona();
        Carro carro = new Carro();
        carro.marca="BYD";
        
        
        juan.cedula=22;
        juan.nombre="Juan C A";
        juan.salario=1000000;
        juan.edad=16;
        juan.gritarFrase();
        juan.carro=carro;
        JOptionPane.showMessageDialog(null, "EDAD: "+juan.mentiraEdad());
        JOptionPane.showMessageDialog(null, "EDADCorrecta: "+juan.edad);
         JOptionPane.showMessageDialog(null, "El carro de Juan: "+juan.carro.marca);
        
        
                
        
        kata.cedula=11;
        kata.nombre="Katalina C A";
        kata.salario=500000;
        kata.edad=23;
        kata.gritarFrase();
    }
    
}
