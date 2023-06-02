/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.salonclases;

import java.util.Scanner;

/**
 *
 * @author MSIBRAVO
 */
public class Asiento {

    public Asiento(int numeroAsiento, String tipoAsiento) {
    }
    public static void Asiento(){
       System.out.println("Ingrese el número del asiento: ");
        Scanner scanner = new Scanner(System.in);
        int numeroAsiento = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea
        System.out.print("Ingrese el tipo de asiento: ");
        String tipoAsiento = scanner.nextLine();
        Asiento asiento = new Asiento(numeroAsiento, tipoAsiento); 
    }
    
    
}
