package Ejercicio_2;

public class Pedido {
    private Cliente cliente;
    private Obra obra;

    public Pedido(Cliente cliente, Obra obra) {
        this.cliente = cliente;
        this.obra = obra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "- " + obra;
    }
}
