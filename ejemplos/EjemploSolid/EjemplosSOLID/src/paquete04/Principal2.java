/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Principal2 {

    //Agregar por teclado n numero de transporte
    //Bus, taxi, aereo, maritimo
    //el usuario decide cuandot termina
    // Crear tipos transporte
    // Presentar un reporte de los transporte
    /*
        Transporte Bus: $1.00
        Transporte Bus: $1.00
        Transporte Bus: $1.00
        Promedio : ?

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opciones;

        ArrayList<Transporte> tp = new ArrayList<Transporte>();

        System.out.println("Ingrese la opcion que desea"
                + "1. Trasnporte Bus"
                + "2. Transporte Taxi"
                + "3.Transporte Aereo"
                + "4. Transporte Maritimo");
        opciones = sc.nextInt();

        switch (opciones) {
            case 1:
                if (opciones == 1) {

                    TransporteBus bus = new TransporteBus();

                    System.out.println("Ingrese el Nombre de la Cooperativa: ");
                    String nombre = sc.nextLine();
                    bus.establecerCooperativaBus(nombre);

                    bus.establecerTarifa();
                    
                    tp.add(bus);

                }
                break;

            case 2:

                if (opciones == 2) {

                    TransporteTaxi taxi = new TransporteTaxi();

                    System.out.println("Ingrese el Nombre de la Cooperativa: ");
                    String nombre = sc.nextLine();
                    taxi.establecerCooperativaTaxi(nombre);
                    taxi.establecerTarifa();
                    
                    tp.add(taxi);

                }

                break;

            case 3:

                if (opciones == 3) {

                    TransporteAereo aereo = new TransporteAereo();

                    System.out.println("Ingrese el Nombre de la Cooperativa: ");
                    String nombre = sc.nextLine();
                    aereo.establecerTransporteAereo(nombre);
                    aereo.establecerTarifa();
                    
                    tp.add(aereo);

                }
                break;

            case 4:

                if (opciones == 4) {

                    TransporteMaritimo maritimo = new TransporteMaritimo();

                    System.out.println("Ingrese el Nombre de la Cooperativa: ");
                    String nombre = sc.nextLine();
                    maritimo.establecerTransporteMaritimo(nombre);
                    maritimo.establecerTarifa();
                    
                    tp.add(maritimo);

                } else {
                    System.out.println("Opcion incorrecta");
                }

        }
        System.out.println("Si desesa continuar ingresando Transportes Digite la"
                + "palabra S, por su contrario Digite la palabra N");

        String entrada = sc.nextLine();
        
        while (entrada.equals("S")) {
            

        }           

    }
}
