import java.util.Scanner;;
class Calificacion {

    public String obtenerCalificacion(double valor) {
        if (valor >= 0 && valor <= 4){
            return "Insuficiente";
        }else if(valor >= 5 && valor <=5.9){
            return "Aprobado";
        }else if(valor >= 6 && valor <=6.9){
            return "Bien";
        }else if (valor >= 7 && valor <= 8) {
            return "Notable";
        }else if (valor >= 9 && valor <= 10) {
            return "Sobresaliente";
        }
        return "Nota inválida";
    }

    public static void main(String[] args) {
        Calificacion programa = new Calificacion();
        Scanner sc=new Scanner(System.in);
        // Pedir nota por pantalla
        System.out.print("Introduce la nota (decimal): ");
        double nota = sc.nextDouble();
        String calificacion = programa.obtenerCalificacion(nota);
        // Mostrar calificacion
        System.out.println("Calificación: " + calificacion);
    }
}