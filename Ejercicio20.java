
/*
Ejercicio 20:
Crear un Hash Map que permita mostrar la lista de 5 países y sus respectivas capitales.

*/
import java.util.HashMap;

public class Ejercicio20 {
    public static void main(String[] args) {
        HashMap<String, String> paisesCapitales = new HashMap<String, String>();

        paisesCapitales.put("Colombia", "Bogotá");
        paisesCapitales.put("Argentina", "Buenos Aires");
        paisesCapitales.put("Peru", "Lima");
        paisesCapitales.put("Chile", "Santiago");
        
        paisesCapitales.put("Uruguay", "Montevideo");

        for (String pais : paisesCapitales.keySet()) {
            System.out.println("La capital de " + pais + " es " + paisesCapitales.get(pais));
        }
    }
}
