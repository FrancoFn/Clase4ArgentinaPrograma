/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4argentinaprograma;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Franco Scaramuzzino
 */
class EstadoEnTendencia implements EstadoCancion {
    private final Cancion cancion;
    int likes, dislikes;

    EstadoEnTendencia(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public void insertarIcono() {
        cancion.setIcono(Icono.FIRE.texto());
    }

    @Override
    public void insertarLeyenda(String artista, String album, String titulo, int reproducciones, int likes, int dislikes, Date ultimaReproduccion) {
        cancion.setLeyenda(titulo + " - " + artista + " (" + album + " - " + 2002 + ")");
    }

    @Override
    public void evaluarReproducciones(int reproducciones) {
        // No se usa
    }

    @Override
    public void evaluarLikes(int likes, int dislikes) {
        // No se usa
    }

  @Override
    public void ultimaReproduccion(Date ultimaReproduccion) {
        long horasPasadas = calcularHorasPasadas(ultimaReproduccion);
        if (horasPasadas > 24) {
            cancion.setEstado(new EstadoNormal(cancion));
        }
    }

    private long calcularHorasPasadas(Date ultimaReproduccion) {
        // Fecha y hora actual
        Date fechaActual = new Date();

        // Crear objeto Calendar
        Calendar calendarUltimaReproduccion = Calendar.getInstance();
        Calendar calendarFechaActual = Calendar.getInstance();

        // Establecer las fechas
        calendarUltimaReproduccion.setTime(ultimaReproduccion);
        calendarFechaActual.setTime(fechaActual);

        // Milisegundos
        long diferenciaEnMillis = calendarFechaActual.getTimeInMillis() - calendarUltimaReproduccion.getTimeInMillis();

        // Convertimos horas
        long horasPasadas = diferenciaEnMillis / (60 * 60 * 1000);

        return horasPasadas;
    }
}
