
/*
Ejercicio 6:
Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.

*/
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Ingresa número: ");  
        int num = sc.nextInt(); 
        if (num % 2 == 0) {  
            System.out.println(num + " es divisible entre 2");  
        } else {
            System.out.println(num + " no es divisible entre 2");  
        }

    }

}
