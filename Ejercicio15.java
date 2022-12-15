 


import java.util.Scanner;

 /*
Lee un número por teclado y comprueba que este número es mayor o igual que cero, si
no lo es lo volverá a pedir (do while), después muestra ese número por consola.
*/
public class Ejercicio15 {
       public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int numero;
         do {
            System.out.print("Ingresa un número mayor o igual que cero: ");
            numero = scanner.nextInt();
        } while (numero < 0);

         System.out.println("El número es: " + numero);
    }
}
