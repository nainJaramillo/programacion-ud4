import java.util.Scanner;
public class SumaMientrasEsPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        do {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();

            if (numero >= 0 && numero != -1) {
                suma += numero;
            }

        } while (numero >= 0);

        System.out.println("La suma es: " + suma);
        scanner.close();
    }
}