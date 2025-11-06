import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 100;
        int numBuscar = MIN + new Random().nextInt(MAX - MIN + 1);
        int counter = 0;

        try (Scanner sc = new Scanner(System.in)) {
            int n;
            do {
                System.out.print("Tu intento: ");
                String number = sc.nextLine();
                n = Integer.parseInt(number);

                if (n >= MIN && n <= MAX) {
                    if (n > numBuscar) {
                        System.out.println("Mayor");
                    } else if (n < numBuscar) {
                        System.out.println("Menor");
                    }
                    counter++;
                    continue;
                }
                // Comentado en la imagen:
                // else {
                // System.out.println("Número no válido");
                // }
            } while (n != numBuscar);

            System.out.printf("¡Acertaste en %d intentos!", counter);
        } catch (Exception e) {
            System.out.println("Dato no válido");
        }
    }
}