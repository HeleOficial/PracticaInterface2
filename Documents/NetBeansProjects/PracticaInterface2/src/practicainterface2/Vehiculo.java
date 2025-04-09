/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicainterface2;

/**
 *
 * @author EIMY TATIANA CORAL M
 */
public abstract class Vehiculo {
    protected int velocidadActual;
    protected int velocidadMaxima;
    
    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public abstract void acelerar(int velocidad);
    public abstract void frenar(int velocidad);
    
    public void imprimir() {
        System.out.println("Velocidad actual: " + velocidadActual);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }
}
