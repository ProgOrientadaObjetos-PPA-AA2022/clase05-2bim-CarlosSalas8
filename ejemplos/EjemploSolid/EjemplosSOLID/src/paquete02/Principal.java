/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        //1. Crear 3 estudinates
        //2.Agregar  una ArrayList
        //Generar el objeto de tipo Operaciones Estudiantes
        // Presenta EL toString de Opreaciones Estudinates
        
        Persona estudiantes1 = new Persona("Carlos Salas", 18);
        Persona estudiantes2 = new Persona("Ainara Salas",20);
        Persona estudiantes3 = new Persona("Joe Churo",20);
        
        ArrayList<Persona> estudiantes = new ArrayList<>();
        estudiantes.add(estudiantes1);
        estudiantes.add(estudiantes2);
        estudiantes.add(estudiantes3);
        
        OperacionesEstudiantes opE = new OperacionesEstudiantes();
        
        opE.establecerEstudiante(estudiantes);
        opE.establecerPromedioEdades();
        opE.establecerPromedioCualitativos();
        System.out.printf("%s\n",opE);
        
        
        
        
    }
}
