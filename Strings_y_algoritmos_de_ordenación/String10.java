package Strings_y_algoritmos_de_ordenación;

public class String10 {

    public static void main(String[] args) {
        String cadena1 = "Esta tarde no voy";
        String cadena2 = "esta tarde no VOY";
        //Comparamos las cadenas ignorando mayúsculas y minúsculas
        cadena1.equalsIgnoreCase(cadena2);
        //Pintamos por teclado
        System.out.println(cadena1.equalsIgnoreCase(cadena2));
    }
}

