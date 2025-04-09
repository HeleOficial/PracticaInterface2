/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicainterface2;

/**
 *
 * @author EIMY TATIANA CORAL M
 */
public class PracticaInterface2 {
    public static void main(String[] args) {
        VehiculoTerrestre camioneta = new VehiculoTerrestre(50, 180);
        VehiculoAcuatico motoAcuatica = new VehiculoAcuatico(50, 110);
        VehiculoTerrestre moto = new VehiculoTerrestre(50,250);
        
        
        System.out.println("Camioneta:");
        camioneta.imprimir();
        
        System.out.println("\nMoto acuática:");
        motoAcuatica.imprimir();
        
        System.out.println("\nmoto terrestre:");
        moto.imprimir();
    }
    
}
        

