import java.util.Scanner;

class LoopMaster {

    public static void contarHastaN(int n) {
    // Imprime una sola línea: 1 2 3 … n (un espacio entre números
    // sin espacio final).

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Imprime: Suma = X (X es 1+2+…+n)
    public static void imprimirSumaHastaN(int n) {

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
            
        }
        
        System.out.println("Suma " + suma);
    }

    public static void imprimirTablaMultiplicar(int n) {
    // Imprime 10 líneas: n x i = resultado para i = 1..10, en orden.
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }

    public static void main(String[] args) {
        // S
        Scanner sc = new Scanner(System.in);
        // contarHastaN(1);
        contarHastaN(3);
        imprimirSumaHastaN(10);
        imprimirTablaMultiplicar(10);

    }

}
