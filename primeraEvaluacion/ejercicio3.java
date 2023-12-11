package primeraEvaluacion;
import java.util.Arrays;
public class ejercicio3 {

    public static void convertirAMorse(String texto){
        String convertido = "";
        String palabras[] = new String[texto.length()];
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String letras[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        int posicion = -1;
        palabras = texto.split(convertido);

        for (int i = 0; i < palabras.length; i++) {
            if (letras[i] == palabras[i]) {
                posicion = i;
                break;
            }
        }
        System.out.println(Arrays.toString(palabras));
    }
    public static void main(String[] args) {
        String texto = "teclado";
        convertirAMorse(texto);
        
    }
    
}
