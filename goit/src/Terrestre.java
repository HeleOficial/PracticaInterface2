/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juanm
 */

   public class Terrestre extends Vehiculo implements Motor {
    private int cantidadLlantas;
    private String usoVehiculo; // militar o civil

    public Terrestre(int velocidadActual, int velocidadMaxima, int cantidadLlantas, String usoVehiculo) {
        super(velocidadActual, velocidadMaxima);
        this.cantidadLlantas = cantidadLlantas;
        this.usoVehiculo = usoVehiculo;
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }
} 

