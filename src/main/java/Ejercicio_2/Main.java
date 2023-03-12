package Ejercicio_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Obra> obras = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();

        do {
            System.out.println("-- Menú --\n\n1 - Mostrar clientes\n\n2 - Crear clientes\n\n3 - Crear una obra\n" +
                    "\n4 - Crear un pedido\n\n5 - Mostrar pedidos\n\n6 - Salir");
            String option = sc.nextLine();
            switch (option) {
                case "1" :
                    mostrarClientes(clientes);
                    break;
                case "2" :
                    crearClientes(clientes);
                    break;
                case "3" :
                    crearObra(obras);
                    break;
                case "4" :
                    crearPedido(clientes, obras);
                    break;
                case "5" :
                    mostrarPedidos(clientes);
                    break;
                case "6" :
                    return;
            }
        } while (true);
    }
    public static void mostrarClientes(ArrayList<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            System.out.println("-" + cliente);
        }
    }
    public static void crearClientes(ArrayList<Cliente> clientes) {
        System.out.println("Nombre del cliente: ");
        String name = sc.nextLine();
        clientes.add(new Cliente(name));
    }
    public static void crearObra(ArrayList<Obra> obras) {
        System.out.println("Título de la obra: ");
        String titulo = sc.nextLine();
        System.out.println("Autor de la obra: ");
        String autor = sc.nextLine();
        System.out.println("Tipo de obra (1 - Libro, 2 - Video): ");
        String tipo = sc.nextLine();
        if (tipo.equals("1")) {
            System.out.println("Número de páginas: ");
            int numPaginas = sc.nextInt();
            sc.nextLine();
            obras.add(new Libro(titulo, autor, numPaginas));
        } else if (tipo.equals("2")) {
            System.out.println("Duración (en minutos): ");
            int duracion = sc.nextInt();
            sc.nextLine();
            obras.add(new Video(titulo, autor, duracion));
        } else {
            System.out.println("Opción no válida");
        }
    }
}
