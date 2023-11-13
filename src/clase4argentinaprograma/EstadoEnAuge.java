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

class EstadoEnAuge implements EstadoCancion {
    private final Cancion cancion;

    public EstadoEnAuge(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public void insertarIcono() {
        cancion.setIcono(Icono.ROCKET.texto());
    }

    @Override
    public void insertarLeyenda(String artista, String album, String titulo, int reproducciones, int likes, int dislikes, Date ultimaReproduccion) {
        cancion.setLeyenda(artista + " - " + titulo + " (" + album + " - " + 2002 + ")");
    }

    public void evaluarReproducciones(int reproducciones) {
        int likes = cancion.getLikes(); // Obtener likes de la canción
        int dislikes = cancion.getDislikes(); // Obtener dislikes de la canción

        if (reproducciones > 50000 && cancion.evaluarLikes(likes, dislikes)) {
            cancion.setEstado(new EstadoEnTendencia(cancion));
        }
    }

    @Override
    public void evaluarLikes(int likes, int dislikes) {
        if (dislikes >= 5000) {
            cancion.setEstado(new EstadoNormal(cancion));
        }
    }

    @Override
    public void ultimaReproduccion(Date ultimaReproduccion) {
        // No se usa
    }
}
