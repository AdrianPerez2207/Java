package Strings_y_algoritmos_de_ordenación;
import java.util.Scanner;
public class String12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        try {
            System.out.println("Ingresa una cadena de caracteres");
            cadena = sc.nextLine();
            //Con el método "substring" podemos devolver una subcadena desde el inicio que queramos hasta donde queramos
            System.out.println(cadena.substring(0, cadena.length() / 2));
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
    
}
