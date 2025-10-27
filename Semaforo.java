import java.util.Scanner;

public class Semaforo {

    public String accionSemaforoIf(String color){
        if (color.equalsIgnoreCase("rojo")) {
            return "detente";
        }else if (color.equalsIgnoreCase("amarillo")) {
            return "atento";
        }else if (color.equalsIgnoreCase("verde")) {
            return "avanza";
        } else{
            return "Color no reconocido";

        }
    }

    public String accionSemaforoSwitch(String color){
        switch (color.toLowerCase()) { //TolowerCase se usa para minisculas
            case "rojo":
                return "detente";
            case "amarillo":
                return "atento";
            case "verde":
                return "avanza";
            default: // Se usa cuando no entra ninguna de los anteriores casos.
            return "Color mas reconocido";
        }
       
    }

    public static void main(String[] args){
        Semaforo semaforo=new Semaforo();
        // Pedir color al usuario usando Scanner
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un color: ");
        String color= sc.nextLine();
        // Llamar a método accionSemaforoIf
        String resultadoIf= semaforo.accionSemaforoIf(color);
        // Mostrar por pantalla (System.out) el resultado
         System.out.println("Usando if: " + resultadoIf); 
        // Llamar a método accionSemaforoSwitch
        String resultadoSwitch= semaforo.accionSemaforoSwitch(color);
        // Mostrar por pantalla (System.out) el resultado
        System.out.println("Usando switch: " + resultadoSwitch); 

    }
}