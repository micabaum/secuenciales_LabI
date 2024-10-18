/*Ejercicio 4: Generador de Listas de Reproducción
Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
genere una lista de reproducción con canciones sugeridas para ese estado de ánimo.*/

import java.util.Scanner;
public class ListaDeReproduccion {
    int ánimo = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Ingrese su estado de ánimo. \n 1. Feliz \n 2. Triste \n 3. Enérgico \n 4. Relajado\n");
            int ánimo = sc.nextInt();
            if (ánimo == 1){
                System.out.print (" Don't Stop Me Now - Queen \n Happy - Pharrell Williams\n I Gotta Feeling - Black Eyed Peas \n Walking on Sunshine - Katrina and the Waves\n Good Vibrations - The Beach Boys");
            }
            else if (ánimo == 2) {
                System.out.print (" Someone Like You - Adele\n Yesterday - The Beatles\n Hallelujah - Leonard Cohen\n Mad World - Gary Jules\n Creep - Radiohead");
            } else if (ánimo== 3) {
                System.out.print(" Can't Stop the Feeling! - Justin Timberlake\n Thunderstruck - AC/DC\n Eye of the Tiger - Survivor\n Pumped Up Kicks - Foster the People\n Seven Nation Army - The White Stripes");
            } else if (ánimo == 4) {
                System.out.print(" Let It Be - The Beatles\n Wonderwall - Oasis\n Here Comes the Sun - The Beatles\n Relax - Frankie Goes to Hollywood\n River Flows in You - Yiruma\n");
            } else  {
            System.out.print(" La opción ingresada no es correcta.");
            }

        }
        }
    }