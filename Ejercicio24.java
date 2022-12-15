

import java.util.Scanner;

/*
Ejercicio 24:
Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por
consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar
valores y otro para mostrar
 */
public class Ejercicio24 {

    public static void main(String[] args) {
      
        Ejercicio24 e = new Ejercicio24();
        e.crearArray();
    }

    void crearArray() {
         int[] numeros = new int[10];

         almacenarArray(numeros);

         mostrarValoresIndices(numeros);
    }

    void almacenarArray(int[] numeros) {
         for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el valor para la posición " + i + ": ");
            Scanner scanner = new Scanner(System.in);
            numeros[i] = scanner.nextInt(); // Asume que existe un Scanner llamado "scan"
        }

    }

    void mostrarValoresIndices(int[] numeros) {
        for (int i = 0; i < 10; i++) {
            System.out.println("El índice " + i + " tiene el valor " + numeros[i]);
        }
    }


 
}
