 


 /*
Ejercicio 10:
Realizar una aplicación que nos pida un número de ventas a introducir, después nos
pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final
mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no
*/
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    //  Número de ventas que quiere introducir
    Scanner scanner = new Scanner(System.in);
    System.out.print(" Introducir  número de ventas: ");
    int  cantidadVentas = scanner.nextInt();
    //  suma de  las ventas
    float sumaVentas = 0;
   
    for (int i = 0; i < cantidadVentas; i++) {
      System.out.print("Introduzca la venta número " + (i + 1) + ": ");
      float venta = scanner.nextFloat();

      // Acumulamos la venta en la variable sumaVentas
      sumaVentas += venta;
    }

    // Mostramos la suma de todas las ventas
    System.out.println("Total de las ventas es: " + sumaVentas);
  }
}
