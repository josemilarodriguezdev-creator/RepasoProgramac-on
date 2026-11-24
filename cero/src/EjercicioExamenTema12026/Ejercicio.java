package EjercicioExamenTema12026;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        //Variables

        String nombre;
        int vueltas = 0;
        double tiempoObjetivo = 0;
        double tiemporPorVuelta = 0;
        double suma = 0;
        double mejorTiempo = Double.MAX_VALUE;
        int mejorVuelta = 0;
        int mejoresVueltas = 0;
        double media = 0;


        //Parte 1

        System.out.println("Introduce el nombre del piloto: ");
         nombre = teclado.nextLine();

        do {
            System.out.println("¿Cuantas vueltas va a realizar?: ");
            vueltas = Integer.parseInt(teclado.nextLine());
        }while (vueltas < 3 || vueltas > 10);

        do {
            System.out.println("¿Cual es el tiempo objetivo?: ");
            tiempoObjetivo = Double.parseDouble(teclado.nextLine());
        }while (tiempoObjetivo < 0);


        //Parte 2

        for (int i = 0; i < vueltas; i++) {
            System.out.println("Tiempo de la vuelta "+ (i+1));
            do {
                System.out.println("¿Cual es el tiempo por vuelta?: ");
                tiemporPorVuelta = Double.parseDouble(teclado.nextLine());
                suma += tiemporPorVuelta;
                if (mejorTiempo > tiemporPorVuelta){
                    mejorTiempo = tiemporPorVuelta;
                    mejorVuelta = i+1;
                } if (tiemporPorVuelta < tiempoObjetivo) {
                    mejoresVueltas ++;
                }

            }while (tiemporPorVuelta <=0);
            
            if (tiemporPorVuelta < tiempoObjetivo){
                System.out.println("Objetivo mejorado");
            } else if (tiemporPorVuelta == tiempoObjetivo) {
                System.out.println("Objetivo igualado");
            }else {
                System.out.println("Por encima del objetivo");
            }

        }

        media = suma / vueltas;
        //Parte 3

        System.out.println("----Informe----");
        System.out.println("Piloto: " + nombre);
        System.out.println("tiempo total de la tanda: " + suma + " segundos");
        System.out.printf("El tiempo medio por vuelta es: %.2f segundos%n", media);
        System.out.println("El mejor tiempo conseguido es: " + mejorTiempo + " segundos y lo consiguio en la vuelta " + mejorVuelta);
        System.out.println("las vueltas que mejoraron al tiempo objetivo fueron: " + mejoresVueltas);

        //Parte 4

        if (media <= tiempoObjetivo && vueltas <= 2 * mejoresVueltas ){

            System.out.println("El piloto esta preparado para correr");

        }else {
            System.out.println("Necesita otra tanda de entrenamiento");
        }


    }
}
