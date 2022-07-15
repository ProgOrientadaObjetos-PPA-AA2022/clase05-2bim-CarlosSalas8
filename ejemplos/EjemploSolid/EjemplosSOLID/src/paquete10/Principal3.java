/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

/**
 *
 * @author SALA I
 */
public class Principal3 {

    // Leer los archivos
    public static void main(String[] args) {
        String nombreArchivo = "APIMovie.data";

        LecturaArchivos lectura = new LecturaArchivos(nombreArchivo);
        lectura.establecerListaCalificaciones();
        System.out.println(lectura);
    }
}