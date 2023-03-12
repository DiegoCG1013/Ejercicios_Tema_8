package Ejercicio_1;

public class Dado {
    private int caras;
    private int ultimoValor;

    public Dado(int caras) {
        this.caras = caras;
    }

    public Dado() {
        caras = 6;
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    public int getUltimoValor() {
        return ultimoValor;
    }

    public void Tirar() {
        ultimoValor = (int) (Math.random() * caras + 1);
    }
}
