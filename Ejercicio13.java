 

 

/*
Crear un Array que almacene los siguientes valores A,G,H,B,J,I,R,Y,C,H,O,P,G,Z,H,I,D,S  y
los ordene de menor a mayor.
*/
import java.util.Arrays;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        // Array a ordenar
        String[] valoresArr = {"A", "G", "H", "B", "J", "I", "R", "Y", "C", "H", "O", "P", "G", "Z", "H", "I", "D", "S"};

        // Ordenar el array de menor a mayor
        Arrays.sort(valoresArr);

        // resultado array ordenado
        for (String valorOrdenados : valoresArr) {
            System.out.println(valorOrdenados);
        }
    }
    
}
