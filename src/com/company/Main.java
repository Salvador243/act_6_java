package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        Scanner in = new Scanner(System.in);
        System.out.print("Nombre del estudiante: ");
        String s = in.nextLine();
        e.imprimir(s);
    }
}
