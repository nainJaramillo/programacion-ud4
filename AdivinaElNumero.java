import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int MIN=0;
        int MAX=100;
        int secreto = MIN + new Random().nextInt(MAX - MIN + 1);
        System.out.println(secreto);
        
        
        while (true) {
            
            System.out.print("Tu intento: ");
            int valor= sc.nextInt();

            if (secreto > 0) {
                System.out.print("Mayor");
            }
            
            break;





            
        }
    }
}
