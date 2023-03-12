package Ejercicio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del primer jugador");
        JugadorGuerra jugador1 = new JugadorGuerra(sc.nextLine());
        System.out.println("Ingrese el nombre del segundo jugador");
        JugadorGuerra jugador2 = new JugadorGuerra(sc.nextLine());
        do{
            JugadorGuerra.enfrentamiento(jugador1, jugador2);
        }while(jugador1.getFichas() > 0 && jugador2.getFichas() > 0);
        if(jugador1.getFichas() == 0){
            System.out.println("Ganador: " + jugador2.getNombre());
        }else{
            System.out.println("Ganador: " + jugador1.getNombre());
        }

    }
}
