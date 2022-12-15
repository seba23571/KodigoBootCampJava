
/*
Ejercicio 19:
Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo pida y mostraremos el resultado por pantalla.

*/
import java.util.Scanner; 

public class Ejercicio19 {
  public static void main(String[] args) {
  
    Scanner entrada = new Scanner(System.in);

     System.out.print("Ingrese una frase: ");
    String frase = entrada.nextLine();

     System.out.print("¿Desea convertir la frase a mayúsculas o minúsculas? Use may o min Respectivamente..: ");
    String opcion = entrada.nextLine();

     if (opcion.equals("may")) {
      frase = frase.toUpperCase();
    } else if (opcion.equals("min")) {
      frase = frase.toLowerCase();
    }

     System.out.println("La frase convertida es: " + frase);
  }
}
