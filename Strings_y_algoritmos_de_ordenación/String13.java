package Strings_y_algoritmos_de_ordenación;

public class String13 {

    public static void main(String[] args) {
        
        String cadena = "No se me ocurre ninguna frase larga";
        // Inicializamos la palabra más larga con una cadena vacía
        String palabraLarga = "";
        // Dividimos el texto en palabras
        String palabras[] = cadena.split(" ");
        //Recorremos el array y comparamos si la longitud de "palabras" es mayor a la longitud de "palabraLarga"
        for (int i = 0; i < palabras.length; i++) {
            if (palabras.length > palabraLarga.length()) {
                palabraLarga = palabras[i]; //Si la longitud es mayor, la palabra se guarda en nuestra cadena vacía
                                            //Si la siguiente palabra es más larga, se sustituye
            }
        }
        System.out.println("La palabra más larga es: " + palabraLarga);
    }
    
}
