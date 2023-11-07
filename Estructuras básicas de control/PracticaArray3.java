import java.util.Scanner;

public class PracticaArray3 {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

       int meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       String mesesCadena[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", "Enero"};

       try {
        System.out.println("Escribe un número de mes del 1 al 12");
        int mes = Integer.parseInt(sc.nextLine());
        System.out.println("El mes " + mesesCadena[mes - 1] + " tiene " + meses[mes - 1] + " días");
        
       } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
       }
    }
    
}
