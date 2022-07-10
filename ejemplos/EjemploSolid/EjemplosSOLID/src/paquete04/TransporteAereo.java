/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;



/**
 *
 * @author SALA I
 */
public class TransporteAereo extends Transporte {

    private String transporteAereo;
    private double tarifa;

    public void establecerTransporteAereo(String n) {
        transporteAereo = n;
    }

    public void establecerTarifa() {
        tarifa = 350.0 + (350.0 * 0.3);
    }

    public String obtenerTransporteAereo() {
        return transporteAereo;
    }

    public double obtenerTarifa() {
        return tarifa;
    }
    @Override
     public String toString(){
            String cadena = String.format("Cooperativa Aereo: %s\n "
                +"Tarifa: $%.2f\n",
                transporteAereo,
                tarifa);
        return cadena;
    }
}
