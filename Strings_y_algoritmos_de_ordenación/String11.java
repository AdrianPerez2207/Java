package Strings_y_algoritmos_de_ordenación;
import java.util.Scanner;
public class String11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        try {
            //Pedimos cadena por teclado
            System.out.println("Ingresa una cadena de caracteres");
            cadena = sc.nextLine();
            //Método para reemplazar caracteres "replaceAll". Reemplazamos los espacios por nada.
            System.out.println(cadena.replaceAll(" ", ""));
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
    
}
