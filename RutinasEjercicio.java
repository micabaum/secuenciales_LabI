/*Ejercicio 3: Generador de Rutinas de Ejercicio
Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
duraciones.*/

import java.util.Scanner;
public class RutinasEjercicio {
    int opcion = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Ingrese la opción correcta según su nivel de condición física:\n1. Principiante\n2. Intermedio \n3.Avanzado\n");
            int opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.print("La rutina recomendada para ustede es:\n Lunes: caminata de 40 minutos. \n Martes: Ejercicios de fuerza con mancuernas\n Miércoles: caminata de 20 minutos y ejercicios aeróbicos 20 minutos\n Jueves: ejercicios de fuerza estilo funcional\n Viernes: Caminata 40 minutos, correr 10 minutos");
            } else if (opcion == 2) {
                System.out.print("La rutina recomendada para ustede es:\n Lunes: caminata de 40 minutos. \n Martes: Ejercicios de fuerza con mancuernas\n Miércoles: caminata de 20 minutos y ejercicios aeróbicos 20 minutos\n Jueves: ejercicios de fuerza estilo funcional\n Viernes: Caminata 40 minutos, correr 10 minutos");
            } else if (opcion == 3) {
                System.out.print("La rutina recomendada para ustede es:\n Lunes: caminata de 40 minutos. \n Martes: Ejercicios de fuerza con mancuernas\n Miércoles: caminata de 20 minutos y ejercicios aeróbicos 20 minutos\n Jueves: ejercicios de fuerza estilo funcional\n Viernes: Caminata 40 minutos, correr 10 minutos");
            } else {
                System.out.print("La opción ingresada no es correcta.");
            }

        }

        }
    }


