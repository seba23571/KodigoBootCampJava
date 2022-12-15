

/*
Ejercicio 23:
Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos
los meses de 30 días.
NOTA PARA MEES ACTUAL DICIEMBRE funciona bien la suposicion que todos los meses tienen 30 dias.
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio23 {

    private LocalDate fecha1Date, fecha2Date;

    public static void main(String[] args) {
        Ejercicio23 e = new Ejercicio23();
        e.calcularDifernciaDias();
    }

    void calcularDifernciaDias() {
        Scanner scanner = new Scanner(System.in);
        // Pedimos las dos fechas al usuario
        System.out.print("Ingrese la primera fecha (dd-mm-yyyy): "); // 12-02-2022   14-12-2022
        String fecha1 = scanner.nextLine();
        // Parseamos las fechas ingresadas por el usuario
        try {
            fecha1Date = LocalDate.parse(fecha1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            int dayOfMonth = fecha1Date.getDayOfMonth();
            if (dayOfMonth > 30) {
                suponerTreintaDay(dayOfMonth);
            }

            System.out.println("dia del mes es " + dayOfMonth);
        } catch (Exception e) {

            System.out.println(" ha ingresado un Incorrecto formato de fecha " + e.getMessage()); //+e.getMessage()
            return;
        }
        System.out.print("Ingrese la segunda fecha (dd-mm-yyyy): ");
        String fecha2 = scanner.nextLine();
        // Parseamos las fechas ingresadas por el usuario
        try {
            fecha2Date = LocalDate.parse(fecha2, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            int dayOfMonth = fecha2Date.getDayOfMonth();
              if (dayOfMonth > 30) {
                suponerTreintaDay(dayOfMonth);
            }
        } catch (Exception e) {
            System.out.println(" ha ingresado un Incorrecto formato de fecha "); //+e.getMessage()
            return;
        }
        // Calculamos la diferencia entre las dos fechas en días
        long diff = Math.abs(fecha1Date.toEpochDay() - fecha2Date.toEpochDay());
        // Mostramos la diferencia en días
        System.out.println("Hay " + diff + " días de diferencia entre las dos fechas.");
    }

    private void suponerTreintaDay(int dayOfMonth) {
        System.out.println(" la aplicacion supone 30 dias nada mas ");
        System.exit(0);

    }

}
