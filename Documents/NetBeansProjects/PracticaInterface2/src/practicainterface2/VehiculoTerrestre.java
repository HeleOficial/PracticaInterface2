/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicainterface2;

/**
 *
 * @author Juanm
 */
public class VehiculoTerrestre extends Vehiculo implements Motor {
    public VehiculoTerrestre(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }
    
    @Override
    public void acelerar(int velocidad) {
        velocidadActual = Math.min(velocidadActual + velocidad, velocidadMaxima);
    }
    
    @Override
    public void frenar(int velocidad) {
        velocidadActual = Math.max(velocidadActual - velocidad, 0);
    }
    
    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }
}
