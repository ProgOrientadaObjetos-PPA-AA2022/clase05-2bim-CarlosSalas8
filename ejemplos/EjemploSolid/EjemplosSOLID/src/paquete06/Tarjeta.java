/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author SALA I
 */
public class Tarjeta {

//tipo tarjeta (nombre,banco,cupo maximo)
    private String banco;
    private double cupoMaximo;

    public Tarjeta(String ban, double cupo) {

        banco = ban;
        cupoMaximo = cupo;
    }

    public void establecerBanco(String ban) {
        banco = ban;
    }

    public void establecerCupoMaximo(double cupo) {
        cupoMaximo = cupo;
    }

    public String obtenerBanco() {
        return banco;
    }

    public double obtenerCupoMaximo() {
        return cupoMaximo;
    }

}
