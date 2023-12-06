package Strings_y_algoritmos_de_ordenación;
import java.util.Scanner;
public class String2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = "";

        try {
            System.out.println("Escribe una frase");
            cadena = sc.nextLine();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
