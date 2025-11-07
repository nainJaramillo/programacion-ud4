import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MenuInteractivo {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int opcion ;
        
        do{
            System.out.println("-- MENU --");
            System.out.println("1. Hola");
            System.out.println("2. Hora");
            System.out.println("3. Eco");
            System.out.println("4. Salir");

            opcion = sc.nextInt();
            sc.nextLine();
            
             switch (opcion) {
                case 1:
                    System.out.print("Hola");
                    break;
                case 2: 
                    System.out.print("Hora");
                    break;
                case 3: 
                    System.out.print("Eco");
                    break;
                case 4: System.out.print("Salir");
                break;

                default:
                    System.out.print("Opción no válida");
             }   
        }while(opcion != 4);
        
        
        sc.close();

    }
}
