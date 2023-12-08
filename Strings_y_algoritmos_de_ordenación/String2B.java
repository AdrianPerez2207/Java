package Strings_y_algoritmos_de_ordenación;
import java.util.Scanner;
public class String2B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;

        try {
            System.out.println("Ingresa una cadena de caracteres");
            cadena = sc.nextLine();

            StringBuffer cadenaBuffer = new StringBuffer(cadena);
            cadenaBuffer.reverse();

            String cadenaTotal = cadena + cadenaBuffer.substring(1);

            System.out.println(cadenaTotal);


        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
    
}
