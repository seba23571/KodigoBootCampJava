

/*
Ejercicio 22:
Escribe un programa que lea números enteros y los guarde en un ArrayList hasta que se
lea un 0 y muestra los números leídos, su suma y su media.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        ArrayList<Integer> arrNumeros = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        int num;
        do {
            System.out.println("Ingrese un número entero (0 para terminar y mostrar suma):");
            num = scanner.nextInt();
            if (num != 0) {
                arrNumeros.add(num);
            }
        } while (num != 0);

        System.out.println("Números leídos:");
        for (int n : arrNumeros) {
            System.out.println(n);
        }

        int suma = 0;
        for (int n : arrNumeros) {
            suma += n;
        }
        double media = (double) suma / arrNumeros.size();

        System.out.println("Suma: " + suma);
        System.out.println("promedio: " + media);
    }
}
