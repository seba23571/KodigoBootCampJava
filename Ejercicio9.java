

/*
Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle
que desees.
*/

public class Ejercicio9 {

    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            if (num % 2 == 0 && num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}
