package Strings_y_algoritmos_de_ordenación;

public class String9 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("uno");
        StringBuilder sb2 = new StringBuilder("dos");
        StringBuilder sb3 = new StringBuilder("tres");
        //Guardamos la cadena resultante en una nueva variable
        StringBuilder sbtotal = new StringBuilder();
        sbtotal.append(sb1); //Añadimos las cadenas una a una
        sbtotal.append(sb2);
        sbtotal.append(sb3);

        System.out.println(sbtotal); //Pintamos por teclado
    }
    
}
