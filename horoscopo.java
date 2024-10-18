/*Ejercicio 1: Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.*/

import java.util.Scanner;
public class horoscopo {
        static String Aries = ("Aproveche su energía para concretar proyectos. No se enfoque en los errores, ya habrá tiempo de corregir.");
        static String Tauro = ("El descanso es importante para usted. Tome unas vacaciones en familia, disfrute del aire libre");
        static String Geminis = ("Continúe por el camino del aprendizaje, su energía disponible necesita nuevos conocimientos para estar en equilibrio");
        static String Cancer = ("Disfrute de su tiempo en familia, pronto vendrán días de mucha agitación, necesitará apoyarse en los más cercanos.");
        static String Leo = ("El trabajo será su mayor ocupación en los próximos meses, no olvide cuidar su imagen y salud.");
        static String Virgo = ("Préparese para encontrar el amor en donde menos lo imagina. Manténgase abierto y dispuesto a conocer nuevas personas.");
        static String Libra = ("Deje de lado los prejuicios y continúe con aquello que lo hace feliz. La opinión de los demás no debe estar por sobre sus deseos.");
        static String Escorpio = ("Manténgase activo y aproveche su tiempo libre para ejercitarse. Su cuerpo necesita liberar tensiones.");
        static String Sagitario = ("Es momento de seguir ese impulso y viajar cuanto antes. No hace falta que sea lejos, pero sí debería salir de su rutina cuanto antes.");
        static String Capricornio = ("Pronto encontrará solución al problema que lo aqueja. Continúe con su trabajo cotidiano y verá los frutos de su esfuerzo");
        static String Acuario = ("Su mejor momento está por llegar, no deje que los imprevistos nublen su optimismo. Su creatividad lo llevará por grandes caminos");
        static String Piscis = ("Llegó el momento de reflexionar y pensar en su futuro. No todo es sentimientos, debe planificar lo que quiere hacer.");

        public static void fecha(int dia, int mes){
            if ((dia >= 21 && dia <= 31 && mes == 3) || dia > 0 && dia <= 20 && mes == 4 ){
                System.out.println("Aries: " + Aries);
            }
            else if ((dia >= 21 && dia <= 30 && mes == 4) || dia > 0 && dia <= 21 && mes == 5 ){
                System.out.println("Tauro: " + Tauro);
            }
            else if ((dia >= 22 && dia <= 31 && mes == 5) || dia > 0 && dia <= 21 && mes == 6 ){
                System.out.println("Geminis: " + Geminis);
            }
            else if ((dia >= 22 && dia <= 30 && mes == 6) || dia > 0 && dia <= 23 && mes == 7 ){
                System.out.println("Cancer: " + Cancer);
            }
            else if ((dia >= 24 && dia <= 31 && mes == 7) || dia > 0 && dia <= 23 && mes == 8 ){
                System.out.println("Leo: " + Leo);
            }
            else if ((dia >= 24 && dia <= 31 && mes == 8) || dia > 0 && dia <= 23 && mes == 9 ){
                System.out.println("Virgo: " + Virgo);
            }
            else if ((dia >= 24 && dia <= 30 && mes == 9) || dia > 0 && dia <= 23 && mes == 10 ){
                System.out.println("Libra: " + Libra);
            }
            else if ((dia >= 24 && dia <= 31 && mes == 10) || dia > 0 && dia <= 22 && mes == 11 ){
                System.out.println("Escorpio: " + Escorpio);
            }
            else if ((dia >= 23 && dia <= 30 && mes == 11) || dia > 0 && dia <= 22 && mes == 12 ){
                System.out.println("Sagitario: " + Sagitario);
            }
            else if ((dia >= 23 && dia <= 31 && mes == 12) || dia > 0 && dia <= 20 && mes == 1 ){
                System.out.println("Capricornio: " + Capricornio);
            }
            else if ((dia >= 21 && dia <= 31 && mes == 1) || dia > 0 && dia <= 19 && mes == 2 ){
                System.out.println("Acuario: " + Acuario);
            }
            else if ((dia >= 20 && dia <= 28 && mes == 2) || dia > 0 && dia <= 20 && mes == 3 ){
                System.out.println("Piscis: " + Piscis);
            }
            else System.out.println("Fecha invalida.");
        }
        public static void main(String[] args) {
            int dia = 0;
            int mes = 0;
            int ano = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese su fecha de nacimiento en formato DD/MM/AAAA: ");
            String fecha = sc.nextLine();
            try{
                dia = Integer.parseInt((fecha.split("/")[0]));
                mes = Integer.parseInt((fecha.split("/")[1]));
                ano = Integer.parseInt((fecha.split("/")[2]));
            } catch (Exception e){
                System.out.println("Formato invalido, error: " + e);
            }
            if (dia > 0 && dia <= 31){
                if (mes > 0 && mes <= 12){
                    if (ano > 0){
                        fecha(dia, mes);
                    } else System.out.println("Año invalido");
                } else System.out.println("Mes invalido");
            } else System.out.println("Dia invalido");
        }
    }

