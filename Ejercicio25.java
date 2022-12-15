

/*
Ejercicio 25:
Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.

 */
public class Ejercicio25 {

    public static void main(String[] args) {
        Ejercicio25 ejercicio25 = new Ejercicio25();
        ejercicio25.sumAndAverage();
    }

    public void sumAndAverage() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / array.length;

        // Mostramos la suma y la media 
        System.out.println("La suma de todos los elementos del array es: " + sum);
        System.out.println("La media de todos los elementos es: " + average);
    }

}
