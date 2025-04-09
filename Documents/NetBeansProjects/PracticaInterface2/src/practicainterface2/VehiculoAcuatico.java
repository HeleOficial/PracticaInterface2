/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicainterface2;

/**
 *
 * @author Juanm
 */
public class VehiculoAcuatico extends Vehiculo implements Vela {
    public VehiculoAcuatico(int velocidadActual, int velocidadMaxima) {
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
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80 || velocidadViento < 10) {
            velocidadActual = 0;
        }
    }
}
    
