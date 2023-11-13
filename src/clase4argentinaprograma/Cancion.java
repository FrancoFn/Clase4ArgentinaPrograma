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
class Cancion {
    private EstadoCancion estado;
    private String icono;
    private String leyenda;
    private int likes;
    private int dislikes;

    public Cancion() {
        this.estado = new EstadoNormal(this);
    }

    public EstadoCancion getEstado() {
        return estado;
    }

    public void setEstado(EstadoCancion estado) {
        this.estado = estado;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getLeyenda() {
        return leyenda;
    }

    public void setLeyenda(String leyenda) {
        this.leyenda = leyenda;
    }

    

    public void insertarIcono() {
        estado.insertarIcono();
    }

    public void insertarLeyenda(String artista, String album, String titulo, int reproducciones, int likes, int dislikes, Date ultimaReproduccion) {
        estado.insertarLeyenda(artista, album, titulo, reproducciones, likes, dislikes, ultimaReproduccion);
    }

    public void evaluarReproducciones(int reproducciones) {
        estado.evaluarReproducciones(reproducciones);
    }

    public boolean evaluarLikes(int likes, int dislikes) {
        // Lógica para evaluar si la canción está en tendencia basada en likes y dislikes
        return likes > dislikes;
    }

    public void ultimaReproduccion(Date ultimaReproduccion) {
        estado.ultimaReproduccion(ultimaReproduccion);
    }

    public void mostrarDetalle() {
        System.out.println(icono + " - " + leyenda);
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

   
    
}

