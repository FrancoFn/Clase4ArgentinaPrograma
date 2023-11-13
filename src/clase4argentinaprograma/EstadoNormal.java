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

class EstadoNormal implements EstadoCancion {
    private final Cancion cancion;

    EstadoNormal(Cancion cancion) {
        this.cancion = cancion;
    }

    

    @Override
    public void insertarIcono() {
        cancion.setIcono(Icono.MUSICAL_NOTE.texto());
    }

    @Override
    public void insertarLeyenda(String artista, String album, String titulo, int reproducciones, int likes, int dislikes, Date ultimaReproduccion) {
        cancion.setLeyenda(artista + " - " + album + " - " + titulo);
    }

    @Override
    public void evaluarReproducciones(int reproducciones) {
        if (reproducciones > 1000) {
            cancion.setEstado(new EstadoEnAuge(cancion));
        }
    }

    @Override
    public void evaluarLikes(int likes, int dislikes) {
        // No se usa
    }

    @Override
    public void ultimaReproduccion(Date ultimaReproduccion) {
        // No se usa
    }
}

