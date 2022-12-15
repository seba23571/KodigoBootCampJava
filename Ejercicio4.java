

import java.util.Scanner;

/*
Para resolver este problema en Java, 
puedes utilizar el operador módulo % para determinar si un número es divisible entre dos. Por ejemplo:

 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " es divisible entre 2");
        } else {
            System.out.println(num + " no es divisible entre 2");
        }

    }

}
