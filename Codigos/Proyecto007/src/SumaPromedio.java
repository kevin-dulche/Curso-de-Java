import java.util.Scanner;

public class SumaPromedio {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3, num4, suma, promedio;
        System.out.print("Ingrese el primer valor: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        num2 = teclado.nextInt();
        System.out.print("Ingrese el tercer valor: ");
        num3 = teclado.nextInt();
        System.out.print("Ingrese el cuarto valor: ");
        num4 = teclado.nextInt();
        suma = num1 + num2 + num3 + num4;
        promedio = suma / 4;
        System.out.print("La suma de los cuatro valores es: ");
        System.out.println(suma);
        System.out.print("El promedio de los cuatro valores es: ");
        System.out.println(promedio);
    }
}