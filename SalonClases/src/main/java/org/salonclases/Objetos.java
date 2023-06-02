/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.salonclases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MSIBRAVO
 */
public class Objetos extends SalonClases{
    public String marca;
    public String numeroObjetos;
    private String nombreObjeto;
    
    @Override
    public String toString() {
        return "Objetos{" + "marca=" + marca + ", numeroObjetos=" +
                numeroObjetos + ", nombreObjeto=" + nombreObjeto + '}';
    }
    
    
    public static void marca(){
        List<String> marca = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 1; i++) {
            System.out.println("De que marca es objeto? ");
            String cosa = scanner.nextLine();
            marca.add(cosa);
            System.out.println(marca);
            
            
        }
    }
    public static void numeroObjetos(){
        List<String> cantidad = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 1; i++) {
            System.out.println("Cuantos hay?: ");
            String cosa = scanner.nextLine();
            cantidad.add(cosa);
            System.out.println(cantidad);
        }
    }
    public static void nombreObjeto(){
        List<String> nombre = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 1; i++) {
            System.out.println("Que objeto es? ");
            String cosa = scanner.nextLine();
            nombre.add(cosa);
            System.out.println(nombre);
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroObjetos() {
        return numeroObjetos;
    }

    public void setNumeroObjetos(String numeroObjetos) {
        this.numeroObjetos = numeroObjetos;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    
        
        
    
}
    
    

