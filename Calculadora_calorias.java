/*Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
ejercicio.*/


import java.util.Scanner;
public class Calculadora_calorias {
    static double correr = 4.5;
    static double nadar = 9.0;
    static double bicicleta = 8.0;
    static double calorias = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su peso, en Kg: ");
        float peso = sc.nextFloat();
        System.out.print("Ingrese el ejercicio realizado: \n1.Correr \n2.Nadar \n3. Andar en bicicleta\n");
        double calorias=0;
        int opcion = sc.nextInt();
        System.out.println("Ingrese los minutos realizados de ejercicio: ");
        int duracion = sc.nextInt();
    if (opcion == 1) {
        calorias = correr * peso * duracion * 0.0175;
    }
    else if (opcion== 2) {
        calorias = nadar * peso * duracion * 0.0175;
    }
    else if (opcion== 3) {
        calorias = bicicleta * peso * duracion * 0.0175;
    }
    else if (opcion != '1' && opcion != '2' && opcion != '3') {
         System.out.println("La opción ingresada no es correcta.");
    }
        System.out.println("El total de calorías quemadas es:" + calorias); {

        }
    }

    }

