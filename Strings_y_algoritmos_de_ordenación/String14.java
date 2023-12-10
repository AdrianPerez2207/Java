package Strings_y_algoritmos_de_ordenación;
import java.util.Scanner;
public class String14 {
    //Función de encriptado
    public static String encriptado(String cadena, int clave){
        StringBuffer cadenaEncriptada = new StringBuffer(); //Generamos "StringBuffer" para poder modificarlo
        //Recorremos nuestra cadena
        for (int i = 0; i < cadena.length(); i++) {
            //Sumamos la clave a los caracteres de cadena y lo pasamos a carácter (char)
            cadenaEncriptada.append((char) (cadena.charAt(i) + clave)); //Lo metemos todo en la variable "cadenaEncriptada"
        }                                                               
        return cadenaEncriptada.toString();

    }
    //Función para desencriptar
    public static String desencriptar(String cadenaEncriptada, int clave){
        StringBuffer cadenaDesencriptada = new StringBuffer(); //Generamos "StringBuffer" para poder modificarlo
        //Recorremos nuestra cadena ya encriptada anteriormente
        for (int i = 0; i < cadenaEncriptada.length(); i++) {
            //Restamos la clave a los caracteres de la cadena encriptada y lo pasamos a carácter (char)
            cadenaDesencriptada.append((char) (cadenaEncriptada.charAt(i) - clave)); //Lo metemos todo en la variable "cadenaDesencriptada"
        }
        return cadenaDesencriptada.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int clave;

        try {
            //Pedimos cadena y clave por teclado
            System.out.println("Ingresa una cadena de caracteres");
            cadena = sc.nextLine();
            System.out.println("Ingresa la clave numérica");
            clave = Integer.parseInt(sc.nextLine());

            System.out.println("Cadena Encriptada: " + encriptado(cadena, clave));
            String cadenaEncriptada = encriptado(cadena, clave); //Nueva función para guardar la cadena encriptada y poder desencriptar
            System.out.println("Cadena Desencriptada: " + desencriptar(cadenaEncriptada, clave));
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
