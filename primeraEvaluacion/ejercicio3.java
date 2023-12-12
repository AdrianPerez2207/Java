package primeraEvaluacion;
import java.util.Arrays;
public class ejercicio3 {

    public static String convertirAMorse(char morseConvertido){
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char letras[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int i = 0; i < letras.length; i++) {
            if (Character.toUpperCase(morseConvertido) == letras[i]) {
                return morse[i];
            }
        }

        return "";
    }
    public static void main(String[] args) {
        String texto = "hola mnundo";

        
    }
    
}
