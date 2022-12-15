 


import java.util.Arrays;

 /*
Crear   un   Array   que   almacene   los   siguientes   valores
100,8,5,20,15,63,6,9,2,1,5,3,4,7,9,102,88,64 y los ordene de menor a mayor
*/
public class Ejercicio14 {
    public static void main(String[] args) {
         // Array a ordenar
        int[] valoresArr = {100, 8, 5, 20, 15, 63, 6, 9, 2, 1, 5, 3, 4, 7, 9, 102, 88, 64};

      
        Arrays.sort(valoresArr);

       
        for (int valor : valoresArr) {
            System.out.println(valor);
        }
    }
}
