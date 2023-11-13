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

interface EstadoCancion {
    void insertarIcono();

    void insertarLeyenda(String artista, String album, String titulo, int reproducciones, int likes, int dislikes, Date ultimaReproduccion);

    void evaluarReproducciones(int reproducciones);

    void evaluarLikes(int likes, int dislikes);

    void ultimaReproduccion(Date ultimaReproduccion);
}

