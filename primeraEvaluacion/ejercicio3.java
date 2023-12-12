package primeraEvaluacion;
import java.util.Arrays;
public class ejercicio3 {
    public static char obtenerCaracterMorse(String morse) {
        char[] normalAlphabet = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
        };
        String[] morseAlphabet = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----",
                ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."
            };

        for (int i = 0; i < morseAlphabet.length; i++) {
            if (morse.equals(morseAlphabet[i])) {
                return normalAlphabet[i];
            }
        }

        return ' ';
    }
    public static String convertirDeMorse(String morse) {
        StringBuilder texto = new StringBuilder();
        String[] palabras = morse.split("#");

        for (String palabra : palabras) {
            String[] letras = palabra.trim().split(" ");
            for (String letra : letras) {
                char character = obtenerCaracterMorse(letra);
                texto.append(character);
            }
            texto.append(" ");
        }

        return texto.toString().trim();
    }

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
        String texto = "Hola mundo";
        System.out.println("texto convertido a morse: " + convertirMorse(texto));
        System.out.println("texto convertido de morse: " + convertirDeMorse(texto));

        
    }
    
}
