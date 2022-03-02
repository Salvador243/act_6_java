package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese El Nombre Del Estudiante: ");
        String s = in.nextLine();
        e.imprimir(s);
    }
}
