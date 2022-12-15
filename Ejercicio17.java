

/*
Ejercicio 17:
Crear una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.

*/
import java.util.Scanner;  

public class Ejercicio17 {
  public static void main(String[] args) {
     
    Scanner day = new Scanner(System.in);

    //  ingrese un día de la semana
    System.out.print("Ingrese un día de la semana: ");
    String diaLaboral = day.nextLine();

   

    switch (diaLaboral) {
      case "lunes":
      case "martes":
      case "miércoles":
      case "jueves":
      case "viernes":
        System.out.println(diaLaboral + " es un día laboral.");
        break;
      case "sabado":
      case "domingo":
        System.out.println(diaLaboral + " no es un día laboral.");
        break;
      default:
        System.out.println("No reconozco ese día.");
    }
  }
}
