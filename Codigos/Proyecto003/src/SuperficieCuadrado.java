import java.util.Scanner;

public class SuperficieCuadrado {
    //Public Static vod //Errores sintanticos
    public static void main(String[] args) throws Exception {
        // scanner // Errores
        Scanner teclado = new Scanner(System.in);
        //INT // Error
        int lado;
        int superficie;
        System.out.print("Ingrese el lado: ");
        lado = teclado.nextInt();
        superficie = lado * lado; // superficie = lado * lado * lado; // Errores logicos
        System.out.print("La superficie es: ");
        System.out.print(superficie);
    }
}