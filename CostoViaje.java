/*Ejercicio 5: Calculadora de Costo de Viaje
Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
calcule e imprima el costo total del viaje.
*/

import java.util.Scanner;
public class CostoViaje {
    static float precio_combustible = 1000;
    float distancia = 0;
    float consumo = 0;
    float costo = 0;
    float cantidad_combustible =0;
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la distancia del viaje (en km)");
        float distancia = sc.nextFloat();
        System.out.println("¿Cuál es el consumo de combustible, en litros, de su vehiculo por kilómetro?");
        float consumo = sc.nextFloat();
        float cantidad_combustible = distancia*consumo;
        float costo = cantidad_combustible * precio_combustible;
        System.out.println("El costo del viaje es: " + costo);
    }
}
