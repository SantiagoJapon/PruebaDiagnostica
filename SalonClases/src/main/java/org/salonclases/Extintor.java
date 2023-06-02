/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.salonclases;

/**
 *
 * @author MSIBRAVO
 */
public class Extintor extends Objetos{
    private int numeroLitros;
    private String color;

    public int getNumeroLitros() {
        return numeroLitros;
    }

    public void setNumeroLitros(int numeroLitros) {
        this.numeroLitros = numeroLitros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Extintor{" + "numeroLitros=" + numeroLitros + ", color=" + color + '}';
    }
    
    
}
