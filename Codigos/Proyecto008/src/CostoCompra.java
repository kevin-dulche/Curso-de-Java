import java.util.Scanner;

public class CostoCompra {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        float precio, importe;
        int cantidad;

        System.out.print("Ingrese el precio: ");
        precio = teclado.nextFloat();
        System.out.print("Ingrese la cantidad: ");
        cantidad = teclado.nextInt();
        importe = precio * cantidad;
        System.out.print("El importe a pagar es: ");
        System.out.print(importe);
    }
}