/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

/**
 *
 * @author SALA I
 */
public class APIDirectvGo implements APIMovie{

    private String apiKey;

    @Override
    public void establecerApiKey(String ak) {
        apiKey = String.format("%s%s", ak, "8569745");

    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }
    @Override
     public String toString() {
        return "Directv Go";
    }

}


