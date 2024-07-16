/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;

import java.util.Scanner;
public class Ej10_mostrarElVectorAyB {
   public static void main(String[] args) {
        String[] E = {"Carla", "Jhoselin", "Mariana", "Soledad"};
        int[] P = {90, 59, 100, 10};

        // a) Listar alumnos con sus notas
        System.out.println("Listado de alumnos y notas:");
        for (int i = 0; i < E.length; i++) {
            System.out.println("Alumno: " + E[i] + " - Nota: " + P[i]);
        }

        // b) Mostrar mejores estudiantes
        System.out.println("\nMejores estudiantes:");
        for (int i = 0; i < E.length; i++) {
            if (P[i] > 80) {
                System.out.println("Alumno: " + E[i] + " - Nota: " + P[i]);
            }
        }

        // c) Mostrar alumnos que aprobaron la materia
        System.out.println("\nAlumnos que aprobaron la materia:");
        for (int i = 0; i < E.length; i++) {
            if (P[i] >= 60) {
                System.out.println("Alumno: " + E[i] + " - Nota: " + P[i]);
            }
        }

        // d) Ordenar lista de estudiantes por nombre y nota
       // Arrays.sort(E);
        int temp;
        for (int i = 0; i < E.length - 1; i++) {
            for (int j = i + 1; j < E.length; j++) {
                if (E[i].compareTo(E[j]) > 0) {
                    String tempStr = E[i];
                    E[i] = E[j];
                    E[j] = tempStr;
                    temp = P[i];
                    P[i] = P[j];
                    P[j] = temp;
                }
            }
        }

        // Mostrar lista ordenada
        System.out.println("\nLista de alumnos ordenada por nombre y nota:");
        for (int i = 0; i < E.length; i++) {
            System.out.println("Alumno: " + E[i] + " - Nota: " + P[i]);
        }

        // e) Dar de baja a los alumnos con nota menor que 15
        System.out.println("\nAlumnos dados de baja:");
        for (int i = 0; i < E.length; i++) {
            if (P[i] < 15) {
                System.out.println("Alumno: " + E[i] + " - Nota: " + P[i]);
                E[i] = "";
                P[i] = 0;
            }
        }
    }
 
}
