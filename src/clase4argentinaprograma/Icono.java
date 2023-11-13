/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4argentinaprograma;

/**
 *
 * @author Franco Scaramuzzino
 */
public class Icono {
    public static Icono MUSICAL_NOTE = new Icono(new int[]{0x1F3B5});
    public static Icono ROCKET = new Icono(new int[]{0x1F680});
    public static Icono FIRE = new Icono(new int[]{0x1F525});
    private int[] internalEncoding;

    Icono(int[] internalEncoding) {
        this.internalEncoding = internalEncoding;
    }

    public String texto() {
        return new String(internalEncoding, 0, internalEncoding.length);
    }
}
/*public class Icono {
    public static Icono MUSICAL_NOTE = new Icono("\uD83C\uDFB5");
    public static Icono ROCKET = new Icono("\uD83D\uDE80");
    public static Icono FIRE = new Icono("\uD83D\uDD25");
    private String unicode;

    private Icono(String unicode) {
        this.unicode = unicode;
    }

    public String texto() {
        return unicode;
    }
}*/

