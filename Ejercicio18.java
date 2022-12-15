
/*

Ejercicio 18:
Pide por teclado dos números y genera 10 números aleatorios entre esos números. 
Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).

*/
import java.util.Scanner;   

public class Ejercicio18 {
  public static void main(String[] args) {
   
    Scanner numeroSc = new Scanner(System.in);

   
    System.out.print("Ingrese un número: ");
    int num1 = Integer.parseInt(numeroSc.nextLine());
    System.out.print("Ingrese otro número: ");
    int num2 = Integer.parseInt(numeroSc.nextLine());

    
    System.out.println("Los 10 números aleatorios son:");
    for (int i = 0; i < 10; i++) {    
      int numAleatorio = (int) (Math.random() * (num2 - num1 + 1)) + num1;   
      System.out.println(numAleatorio);
    }
  }
}
