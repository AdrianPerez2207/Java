package Strings_y_algoritmos_de_ordenación;
import java.util.Arrays;
public class String8 {

    public static void main(String[] args) {
        String cadena = "http://www.iesjaroso.es/noticias";
        //Método split para partir la cadena por el carácter(palabra) específico
        System.out.println(Arrays.toString(cadena.split("/")));
    }
    
}
