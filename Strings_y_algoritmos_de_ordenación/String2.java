package Strings_y_algoritmos_de_ordenación;
import java.util.Scanner;
public class String2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena;

        try {
            System.out.println("Escribe una frase");
            cadena = sc.nextLine();

            String cadenaInvertida = "";

            for (int i = cadena.length() - 1; i >= 0; i--) {
                cadenaInvertida += cadena.charAt(i);
            }
            System.out.println(cadena + cadenaInvertida.substring(1));
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
    
}
