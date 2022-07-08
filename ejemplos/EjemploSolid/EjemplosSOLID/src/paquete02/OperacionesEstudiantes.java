/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioEdadesCualitativos;
    // private double edadminima;
    /*
    promedioEdadesCualitativos
    promedio jovenes: mayor igual a 0 y menor a 21
    promedio adulto mayor a 21
    */
    
    public void establecerPromedioCualitativos(){
        
        if(promedioEdades >= 0 && promedioEdades <= 21){
            
             promedioEdadesCualitativos = "Promedio Joven";

        }else{
            if(promedioEdades > 21){
                promedioEdadesCualitativos = "Promedio Adulto";
            
            }
          
        }
    
    }
    
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        
        for(Persona e: obtenerEstudiante()){
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }
    
    public String obtenerPromedioCualitativo(){
        return promedioEdadesCualitativos;
    
    }
    
    /*
    public double promedioEdades(ArrayList<Persona> lista){
        double promedio = 0;
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = lista.get(i).obtenerEdad();
        }
        promedio = suma/lista.size();
        return promedio;
    }
    */
     @Override
    public String toString(){
        
        String cadena = String.format("Estudiante");
          for(Persona e: obtenerEstudiante()){
            cadena = String.format("%s\n%s",cadena,e.obtenerNombre());          
            
        }        

        cadena = String.format("%s\n"
                + "Promedio Edades: %.2f\n"
                + "Promedio Edades Cualitativos : %s\n",
                cadena,
                promedioEdades,
                promedioEdadesCualitativos);
        return cadena;
    }
    
}
