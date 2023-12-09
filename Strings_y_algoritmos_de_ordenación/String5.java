package Strings_y_algoritmos_de_ordenación;
import java.util.Scanner;
public class String5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;

        try {
            //Pedimos una cadena por teclado
            System.out.println("Ingresa una cadena de caracteres");
            cadena = sc.nextLine();
            //Generamos contadores para contar vocales, consonantes y espacios
            int contadorVocales = 0;
            int contadorConsonantes = 0;
            int contadorEspacios = 0;
            //Generamos un bucle para recorrer cada caracter de la cadena y comprobar que sea vocal, consonante o espacio
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == ' '){ //Condicion para contar espacios, vocal y consonantes
                    contadorEspacios++;
                } else if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u')  {
                    contadorVocales++;
                } else {
                    contadorConsonantes++;
                }
            }
            System.out.println("Vocales: " + contadorVocales);
            System.out.println("Consonantes: " + contadorConsonantes);
            System.out.println("Espacios: " + contadorEspacios);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
    
}
