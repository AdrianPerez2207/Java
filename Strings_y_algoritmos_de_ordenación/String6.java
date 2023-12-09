package Strings_y_algoritmos_de_ordenación;
import java.util.Scanner;
public class String6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingresa una cadena de caracteres"); //Pedimos caracteres por teclado
            String cadena = sc.nextLine();

            StringBuffer alReves = new StringBuffer(cadena); //Lo metemos en un Buffer y le damos la vuelta
            alReves.reverse();
            System.out.println(alReves);

            //Generamos condiciones para comprobar que las palabras son iguales (si son palíndromos son iguales)
            if (cadena.equals(alReves.toString())) {
                System.out.println("Si son palíndromos");
            } else {
                System.out.println("Lo siento, no son palíndromos");
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
    
}
