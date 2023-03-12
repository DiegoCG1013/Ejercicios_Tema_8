package Ejercicio_2;

public class Video extends Obra {
    private int duracion;

    public Video(String titulo, String autor, int duracion) {
        super(titulo, autor);
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return titulo + " de " + autor + " (" + duracion/60 + "h" + duracion % 60 + ")";
    }
}
