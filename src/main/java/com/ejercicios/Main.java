package com.ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de estudiantes aregistrar: ");
            int cantidad = sc.nextInt();
            sc.nextLine();

            List<String>estudiantes=new ArrayList<>();
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
                String nombre = sc.nextLine();
                estudiantes.add(nombre);
            }

            System.out.println("\nLista de estudiantes registrados");
            for(String estudiante : estudiantes){
                System.out.println(estudiante);
            }

            Collections.sort(estudiantes);
            System.out.println("\nLista de estudiantes organizados en forma alfabetica");
            for(String estudiante : estudiantes){
                System.out.println(estudiante);
            }

            System.out.println("\nIngrese el nombre del estudiante que desea buscar: ");
            String buscar = sc.nextLine();
            if (estudiantes.contains(buscar)) {
                System.out.println("el estudiante "+ buscar + "esta en la lista");
            }else{
                System.out.println("El estudiante " + buscar + "no esta en la lista");
            }
            
            sc.close();
        }
    }
}
