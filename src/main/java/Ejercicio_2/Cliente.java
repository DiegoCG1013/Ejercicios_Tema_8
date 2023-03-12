package Ejercicio_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String name;

    public Cliente(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
