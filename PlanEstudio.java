/*Ejercicio 6: Generador de Planes de Estudio
Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un
plan de estudio semanal distribuyendo esas horas en diferentes materias.*/

import java.util.Scanner;

public class PlanEstudio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas horas al día podés estudiar? ");
        float horasPorDia = scanner.nextFloat();

        System.out.print("¿Cuántos días a la semana estudiar? ");
        int diasSemana = scanner.nextInt();

        System.out.print("¿Cuántas materias debés estudiar por semana? ");
        int numeroMaterias = scanner.nextInt();


        float horasSemana = horasPorDia * diasSemana;
        float horasPorMateriaYDia = horasSemana / (numeroMaterias * diasSemana);


        System.out.println("\nPlan de estudio semanal:");
        for (int dia = 1; dia <= diasSemana; dia++) {
            System.out.println("Día " + dia + ":");
            for (int materia = 1; materia <= numeroMaterias; materia++) {
                System.out.println("  Materia " + materia + ": " + horasPorMateriaYDia + " horas");
            }
        }
    }
}