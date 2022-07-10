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
        String entrada;

        ArrayList<Transporte> tp = new ArrayList<Transporte>();

        do {

            System.out.println("Ingrese la opcion que desea\n"
                    + "1. Trasnporte Bus\n"
                    + "2. Transporte Taxi\n"
                    + "3.Transporte Aereo\n"
                    + "4. Transporte Maritimo\n");
            opciones = sc.nextInt();

            switch (opciones) {
                case 1:
                    if (opciones == 1) {

                        TransporteBus bus = new TransporteBus();

                        System.out.println("Ingrese el Nombre de la Cooperativa Buses: ");
                        sc.nextLine();
                        String nombre = sc.nextLine();

                        bus.establecerCooperativaBus(nombre);

                        bus.establecerTarifa();

                        tp.add(bus);

                    }
                    break;

                case 2:

                    if (opciones == 2) {

                        TransporteTaxi taxi = new TransporteTaxi();

                        System.out.println("Ingrese el Nombre de la Cooperativa Taxi: ");
                        sc.nextLine();
                        String nombre = sc.nextLine();
                        taxi.establecerCooperativaTaxi(nombre);
                        taxi.establecerTarifa();

                        tp.add(taxi);

                    }

                    break;

                case 3:

                    if (opciones == 3) {

                        TransporteAereo aereo = new TransporteAereo();

                        System.out.println("Ingrese el Nombre de la Cooperativa Aereo: ");
                        sc.nextLine();
                        String nombre = sc.nextLine();
                        aereo.establecerTransporteAereo(nombre);
                        aereo.establecerTarifa();

                        tp.add(aereo);

                    }
                    break;

                case 4:

                    if (opciones == 4) {

                        TransporteMaritimo maritimo = new TransporteMaritimo();

                        System.out.println("Ingrese el Nombre de la Cooperativa Maritima: ");
                        sc.nextLine();
                        String nombre = sc.nextLine();
                        maritimo.establecerTransporteMaritimo(nombre);
                        maritimo.establecerTarifa();

                        tp.add(maritimo);

                    }
                    break;

                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
            System.out.println("¿Desea ingresar más transportes?\n"
                    + "Pulse S para seguir ingresando o N para salir");
            entrada = sc.nextLine();

        }while (entrada.equals("S"));

            TiposTransporte tipos = new TiposTransporte();
            tipos.establecerTransportes(tp);
            tipos.establecerPromedioTarifas();

            System.out.printf("%s", tipos);
        
    }
}
