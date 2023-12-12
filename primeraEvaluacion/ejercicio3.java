package primeraEvaluacion;
import java.util.Arrays;
public class ejercicio3 {

    public static String obtenerCodigoMorse(char caracter){
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char letras[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int i = 0; i < letras.length; i++) {
            if (Character.toUpperCase(caracter) == letras[i]) {
                return morse[i];
            }
        }

        return "";
    }
    public static String convertirMorse(String texto){
        StringBuilder morse = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char character = texto.charAt(i);

            if (character == ' ') {
                morse.append("# ");
                continue;
            }

            String morseCode = obtenerCodigoMorse(character);
            if (!morseCode.equals("")) {
                morse.append(morseCode).append(" ");
            }
        }



        return morse.toString().trim();
    }
    public static void main(String[] args) {
        String texto = "hola mundo";
        System.out.println(convertirMorse(texto));

        
    }
    
}
