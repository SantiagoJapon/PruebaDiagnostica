/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.salonclases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MSIBRAVO
 */
public class SalonClases{

    public static void main(String[] args) {
       
       Pizarra salon1 = new Pizarra();
       salon1.marca();
       salon1.getMarca();
       salon1.getNumeroObjetos();
       System.out.println(salon1);
       
       Monitor salon2 = new Monitor();
       salon2.marca();
       salon2.numeroObjetos();
       
       salon2.getNumeroObjetos();
       salon2.getNombreObjeto();
        System.out.println(salon2);
        
        Extintor salon3 = new Extintor();
        salon3.marca = "Cuerpo de bomberos de loja";
        salon3.numeroObjetos ();
        System.out.println(salon3);
        
    }
   
}

