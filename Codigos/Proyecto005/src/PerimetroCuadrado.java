import java.util.Scanner;

public class PerimetroCuadrado {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int lado, perimetro;
        System.out.print("Ingrese el valor del lado: ");
        lado = teclado.nextInt();
        perimetro = lado * 4;
        System.out.print("El perimetro es: ");
        System.out.print(perimetro);
    }
}
