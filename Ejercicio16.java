

import java.util.Scanner;

/*
Ejercicio 16:
Escribe una aplicación con un String que contenga una contraseña cualquiera. 
Después se te pedirá que introduzcas la contraseña, con 3 intentos. 
Cuando aciertes ya no pedirá más la contraseña y mostrará un mensaje diciendo «Enhorabuena».
 Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).

 */
public class Ejercicio16 {

    public static void main(String[] args) {
        String password = "K0d1g020";
        Scanner leer = new Scanner(System.in);

        // variables para verificar los intentos y los aciertos dentro de la variable acierto controlar (TRUE/FALSE)
        final int intentos = 3;
        boolean aciertos = false;

        // Estructura FOR es un bucle complejo que recorrera los 3 intentos
        for (int i = 1; i <= intentos && !aciertos; i++) {
            System.out.println("Digite la password:");
            String pass = leer.nextLine();

            //Condicionar que la password sea la misma que lo ingresado por el teclado / pass
            if (password.equals(pass)) {
                System.out.println("Enhorabuena , acertaste.... Bienvenido a tu cuenta");
                aciertos = true;
            } else {
                System.out.println("intenta nuevamente , intento n# " + i);
            }
        }
    }
}
