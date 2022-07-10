/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author SALA I
 */
public class TransporteMaritimo extends Transporte {
    
    private String transporteMritimo;
    private double tarifa;

    public void establecerTransporteMaritimo(String n) {
        transporteMritimo = n;
    }

    public void establecerTarifa() {
        tarifa = 250.0 + (250.0 * 0.3);
    }

    public String obtenerTransporteMaritimo() {
        return transporteMritimo;
    }

    public double obtenerTarifa() {
        return tarifa;
    }
    @Override
     public String toString() {
        String cadena = String.format("Cooperativa Maritima: %s\n "
                +"Tarifa: $%.2f\n",
                transporteMritimo,
                tarifa);
        return cadena;
    }
}
    
    
    

