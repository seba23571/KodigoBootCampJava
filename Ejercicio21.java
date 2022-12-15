

/*
Ejercicio 21:
Crear un Hash Map que permita listar todas las selecciones mundialistas de Qatar con el mejor jugador de cada selección.

 */
import java.util.HashMap;

public class Ejercicio21 {

    public static void main(String[] args) {

        HashMap<String, String> seleccionQatarJugadores = new HashMap<String, String>();

        seleccionQatarJugadores.put("Argentina", "Messi");
        seleccionQatarJugadores.put("croatia ", "Luka Modrić");
        seleccionQatarJugadores.put("Brasil", "Neymar");
        seleccionQatarJugadores.put("Francia", "mape");
        seleccionQatarJugadores.put("Uruguay", "suarez");

        for (String mejorJugadores : seleccionQatarJugadores.keySet()) {
            System.out.println("El mejor jugador de " + mejorJugadores + " en Qatar  es : " + seleccionQatarJugadores.get(mejorJugadores));
        }
    }
}
