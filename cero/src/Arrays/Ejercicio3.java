package Arrays;

import chetos.Cheats;

public class Ejercicio3 {
    static void main(String[] args) {

        int contador = 0;
        double sumaTotal = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        double media = 0;
        int cantidadElementos = Cheats.leerEntero("Cuantos elementos quieres que tenga el array");

        int [] array1 = new  int[cantidadElementos];
        for (int i = 0; i < array1.length; i++) {

            array1[i] = Cheats.leerEntero("Introduce el numero " + (i+1));



            sumaTotal += array1[i];

            if (array1[i] > mayor){
                mayor = array1[i];

            }
            if (array1[i] < menor){
                menor = array1[i];
            }
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == mayor){
                contador++;
            }
        }

        media = sumaTotal / cantidadElementos;

        System.out.printf("El mayor numero introducido es %d y se repite %d veces",mayor,contador);
        System.out.println();
        System.out.println("El menor numero introducido es " + menor);
        System.out.println("La media de los numeros es " + media);


    }
}
