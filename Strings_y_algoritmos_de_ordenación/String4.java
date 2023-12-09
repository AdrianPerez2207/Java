package Strings_y_algoritmos_de_ordenación;
import java.util.Scanner;
public class String4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingresa una cadena de caracteres");
            StringBuffer cadena1 = new StringBuffer(sc.nextLine()); //Cadena a modificar

            System.out.println("Ingresa una segunda cadena de caracteres");
            String cadena2 = sc.nextLine(); //Cadena para buscar

            int posicion = 0; //Posición para empezar a buscar
        do {
            posicion = cadena1.indexOf(cadena2, posicion); //Inicializamos la variable posición 
            //Reemplazamos la cadena 2 a Mayúsculas y la guardamos en cadena1
            cadena1.replace(posicion, posicion + cadena2.length(), cadena2.toUpperCase());
            
        } while (cadena1.indexOf(cadena2, posicion) != -1);

        System.out.println(cadena1);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
    
}
