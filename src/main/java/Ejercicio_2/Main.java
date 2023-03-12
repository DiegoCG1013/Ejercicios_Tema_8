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
                    crearPedido(clientes, obras, pedidos);
                    break;
                case "5" :
                    mostrarPedidos(clientes, pedidos);
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
        System.out.println("--- Fin de la lista ---");
    }
    public static void crearClientes(ArrayList<Cliente> clientes) {
        System.out.println("Nombre del cliente: ");
        String name = sc.nextLine();
        clientes.add(new Cliente(name));
        System.out.println("--- Cliente creado ---");
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
            try {
                int numPaginas = sc.nextInt();
                sc.nextLine();
                obras.add(new Libro(titulo, autor, numPaginas));
                System.out.println("--- Obra creada ---");
            } catch (Exception e) {
                System.out.println("Número de páginas no válido");
            }
        } else if (tipo.equals("2")) {
            System.out.println("Duración (en minutos): ");
            try {
                int duracion = sc.nextInt();
                sc.nextLine();
                obras.add(new Video(titulo, autor, duracion));
                System.out.println("--- Obra creada ---");
            } catch (Exception e) {
                System.out.println("Duración no válida");
            }
        } else {
            System.out.println("Opción no válida");
        }
    }
    public static void crearPedido(ArrayList<Cliente> clientes, ArrayList<Obra> obras, ArrayList<Pedido> pedidos) {
        System.out.println("¿Qué cliente quiere hacer el pedido?");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i));
        }
        try {
            int cliente = sc.nextInt();
            if (cliente < 1 || cliente > clientes.size())
                throw new Exception("Cliente no válido");
            sc.nextLine();
            System.out.println("¿Qué obra quiere pedir?");
            for (int i = 0; i < obras.size(); i++) {
                System.out.println((i + 1) + ". " + obras.get(i));
            }
            int obra = sc.nextInt();
            if (obra < 1 || obra > obras.size())
                throw new Exception("Obra no válida");
            sc.nextLine();
            pedidos.add(new Pedido(clientes.get(cliente - 1), obras.get(obra - 1)));
            System.out.println("--- Pedido creado ---");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void mostrarPedidos(ArrayList<Cliente> clientes, ArrayList<Pedido> pedidos) {
        for (Cliente cliente : clientes) {
            System.out.println(cliente + " ha pedido: ");
            for (Pedido pedido : pedidos) {
                if (pedido.getCliente().equals(cliente)) {
                    System.out.println(pedido);
                }
            }
        }
        System.out.println("--- Fin de la lista ---");
    }
}
