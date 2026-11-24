package Arrays;

public class Ejercicio1 {
    static void main(String[] args) {
        int suma = 0;
        int[] array1= {10,5,8,9,3};
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0){
                suma += array1[i];
            }
        }

        System.out.println(suma);
    }
}
