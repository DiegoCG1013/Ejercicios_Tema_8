package Ejercicio_2;

public class Libro extends Obra {
    private int numPaginas;

    public Libro(String titulo, String autor, int numPaginas) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return titulo + " de " + autor + " (" + numPaginas + " páginas)";
    }

}
