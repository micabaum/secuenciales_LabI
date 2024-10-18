/*Ejercicio 7: Calculadora de Índice de Felicidad
Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
índice de felicidad basado en esos factores.*/

import java.util.Scanner;
public class Nivel_Felicidad {

    static double satisfaccion = 0.3;
    static double estres = -0.2;
    static double salud = 0.2;
    static double sueño = 0.2;
    static double relaciones = 0.1;

        public static void main(String[] args) {
            String[] factores = {"Nivel de satisfacción con la vida", "Nivel de estrés", "Nivel de salud", "Calidad del sueño", "Relaciones sociales"};

            Scanner scanner = new Scanner(System.in);
            int nivel_felicidad = 0;
            for (int i = 0; i < factores.length; i++) {
                System.out.print("Califica tu " + factores[i] + " (1-10): ");
                int puntuacion = scanner.nextInt();
                nivel_felicidad += puntuacion * satisfaccion;
                nivel_felicidad += puntuacion * estres;
                nivel_felicidad += puntuacion * salud;
                nivel_felicidad += puntuacion * sueño;
                nivel_felicidad += puntuacion * relaciones;
            }

            // Imprimimos el resultado
            System.out.println("Tu índice de felicidad es: " + nivel_felicidad);
        }
    }

