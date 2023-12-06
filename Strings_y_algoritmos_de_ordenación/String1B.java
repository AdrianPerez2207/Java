package Strings_y_algoritmos_de_ordenación;
import java.util.Scanner;
public class String1B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String caracteres;
        try {
            System.out.println("Ingresa una cadena de caracteres");
            caracteres = sc.nextLine();

            StringBuffer caracteresBuffer = new StringBuffer(caracteres);
            caracteresBuffer.reverse();
            String caracteresAlReves = caracteresBuffer.toString();

            System.out.println("Cadena invertida con (StringBuffer): " + caracteresAlReves);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
    
}
