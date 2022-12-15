
/*
Ejercicio 5: 
Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado Usa la constante PI y el método pow de Math.

*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        double R = 0, area = 0;
        Scanner leer = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.00");
        System.out.println("Ingrese el Radio del circulo:");
        R = leer.nextDouble();
        area = Math.PI * Math.pow(R, 2);

        System.out.println("El valor de la area caluculada es de: " + formato.format(area));
    }

}
