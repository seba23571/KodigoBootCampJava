package segregacion.interfaces;

import java.util.Scanner;

/*
Ejercicio 4: 
Modificar el ejercicio anterior, para que nos pida el nombre que queremos introducir


 */
public class Ejercicio4 {

    public static void main(String[] args) {
       // String nombre = "Sebastian ";
       // System.out.println("Bienvenido " + nombre);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String miNombre = entrada.nextLine();

        System.out.println("Bienvenido " + miNombre);

    }

}
