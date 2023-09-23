import java.util.Scanner;

public class SueldoOperario {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        
        int horasTrabajadas;
        float costoHora;
        float sueldo;

        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = teclado.nextInt();
        System.out.print("Costo por hora: ");
        costoHora = teclado.nextFloat();
        sueldo = horasTrabajadas * costoHora;
        System.out.print("Sueldo del operario: ");
        System.out.println(sueldo);
    }
}
