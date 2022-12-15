

import java.util.Scanner;

/*

Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida
por consola. Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando»
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String nombre = "Fernando";
        System.out.println("Bienvenido " + nombre);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String miNombre = entrada.nextLine();

        System.out.println("Bienvenido " + miNombre);
    }

}
