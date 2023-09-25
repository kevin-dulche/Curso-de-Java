import java.util.Scanner;

public class PagaImpuestos {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        float sueldo;
        System.out.print("Ingrese el sueldo: ");
        sueldo = teclado.nextFloat();
        if (sueldo > 3000) {
            System.out.print("Esta persona debe abonar impuestos");
        }

    }
}