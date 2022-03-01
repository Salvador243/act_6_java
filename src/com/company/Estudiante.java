package com.company;
import java.util.Scanner;
public class Estudiante {

    public double promedio(double[] calificaciones) {
        double[] promedio = calificaciones;
        double prom = 0;
        double tem = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            tem += calificaciones[i];
        }
        prom = (tem / calificaciones.length);
        return prom;
    }

    public String calificacion(double promedio) {
        if (promedio <= 50) {
            return "F";
        } else if (promedio >= 51 && promedio <= 60) {
            return "E";
        } else if (promedio >= 61 && promedio <= 70) {
            return "D";
        } else if (promedio >= 71 && promedio <= 80) {
            return "C";
        } else if (promedio >= 81 && promedio <= 90) {
            return "B";
        } else if (promedio >= 91) {
            return "A";
        }
        return "Hubo un error";
    }
    public void imprimir (String nombre){
        double[] calificaciones = new double[5];
        Scanner in = new Scanner(System.in);

        System.out.println("Nombre del Estudiante: " + nombre);
        for(int i = 0; i < 5; i++){
            System.out.print("Calificacion " + (i+1) +": ");
            calificaciones[i] = in.nextDouble();
        }
        double prom = promedio(calificaciones);
        System.out.println("Promedio: " + prom);
        System.out.println("Calificacion: " + calificacion(prom));
    }
}
