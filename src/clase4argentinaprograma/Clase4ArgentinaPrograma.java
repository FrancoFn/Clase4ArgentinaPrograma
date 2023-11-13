/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4argentinaprograma;

import java.util.Date;

/**
 *
 * @author Franco Scaramuzzino
 */
public class Clase4ArgentinaPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Caso de prueba 1
        Cancion cancionDeColdplay = new Cancion();
        cancionDeColdplay.insertarIcono();
        cancionDeColdplay.insertarLeyenda("Coldplay", "A Rush of Blood to the head", "The Scientist", 500, 1000, 200, new Date());
        cancionDeColdplay.mostrarDetalle();

        // Caso de prueba 2
        cancionDeColdplay.evaluarReproducciones(1100);
        cancionDeColdplay.insertarIcono();
        cancionDeColdplay.insertarLeyenda("Coldplay", "A Rush of Blood to the head", "The Scientist", 1100, 1000, 200, new Date());
        cancionDeColdplay.mostrarDetalle();

        // Caso de prueba 3
        cancionDeColdplay.evaluarLikes(0, 6000);
        cancionDeColdplay.insertarIcono();
        cancionDeColdplay.insertarLeyenda("Coldplay", "A Rush of Blood to the head", "The Scientist", 1100, 1000, 6000, new Date());
        cancionDeColdplay.mostrarDetalle();

        // Caso de prueba 4
        cancionDeColdplay.evaluarReproducciones(60000);
        cancionDeColdplay.evaluarLikes(25000, 0);
        cancionDeColdplay.insertarIcono();
        cancionDeColdplay.insertarLeyenda("Coldplay", "A Rush of Blood to the head", "The Scientist", 60000, 25000, 0, new Date());
        cancionDeColdplay.mostrarDetalle();

        // Caso de prueba 5
        cancionDeColdplay.ultimaReproduccion(new Date(System.currentTimeMillis() - (26 * 60 * 60 * 1000))); // Última reproducción hace más de 24 horas
        cancionDeColdplay.insertarIcono();
        cancionDeColdplay.insertarLeyenda("Coldplay", "A Rush of Blood to the head", "The Scientist", 60000, 25000, 0, new Date());
        cancionDeColdplay.mostrarDetalle();
    }

}
