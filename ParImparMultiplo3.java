import java.util.Scanner;

public class ParImparMultiplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int numero = sc.nextInt();

        boolean esPar = (numero % 2 == 0);
        boolean esMultiploDe3 = (numero % 3 == 0);
        /**
        if (esPar){
          if (esMultiploDe3){
              System.out.println("El número es par y múltiplo de 3.");
          }else{
              System.out.println("El número es par.");
          }
        }else {
            if (esMultiploDe3){
                System.out.println("El número es impar y múltiplo de 3.");
            }else{
                System.out.println("El número es impar.");
            }
        }
         **/
        StringBuilder sb = new StringBuilder();
        if (esPar) {
            sb.append("El número es par");
        } else {
            sb.append("El número es impar");
        }
        if(esMultiploDe3) {
            sb.append(" y es múltiplo de 3.");
        }
        System.out.println(sb);

        sc.close();
    }
}