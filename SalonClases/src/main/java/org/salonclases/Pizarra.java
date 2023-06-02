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
public class Pizarra extends Objetos{
    private String nombreObjeto;

    @Override
    public String getNombreObjeto() {
        return nombreObjeto;
    }

    @Override
    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    @Override
    public String toString() {
        return "Pizarra{" + "nombreObjeto=" + nombreObjeto + '}';
    }
    
    public static void nombreObjeto(){
        List<String> nombre = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 1; i++) {
            System.out.println("Que objeto es: ");
            String cosa = scanner.nextLine();
            nombre.add(cosa);
            System.out.println(nombre);
        }
    }
    
}
    
   
    

