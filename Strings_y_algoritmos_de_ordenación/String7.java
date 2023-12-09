package Strings_y_algoritmos_de_ordenación;

public class String7 {

    public static void main(String[] args) {
        
        String cadena = "Me gusta programar en Java los sábados por la mañana";
        int contadorVocales = 0;
        //Bucle para contar las vocales del texto
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'){
                contadorVocales++;
            }
        }
        System.out.println("Número de vocales: " + contadorVocales);
    }
    
}
