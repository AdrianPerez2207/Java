package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysYMatrices7 {

    public static int generarNumeros(){
        //Generar números del 1 al 50
        int numeros = (int) (Math.random() * 50) + 1;
        return numeros;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Generamos y rellenamos el array
        int tabla[] = new int[5];
        for (int i = 0; i < tabla.length; i++){
            tabla[i] = generarNumeros();
        }
        System.out.println(Arrays.toString(tabla));
        //Desplazamos 1 posición a la derecha con un "for", guardamos el ultimo valor en una variable
        try {

            System.out.println("Escribe el número de movimientos");
            int nVeces = Integer.parseInt(sc.nextLine());

            for (int j = 0; j < nVeces; j++){ //Generamos otro for para recorrer las veces introducidas por teclado
                int ultimo = tabla[tabla.length - 1];
                for (int i = tabla.length - 1; i > 0; i--){ //Recorremos el for hacia atrás restandole posiciones a la "i"
                    tabla[i] = tabla[i - 1];
                }
                tabla[0] = ultimo; //Devolvemos el últimos valor a la posición 0
            }
            System.out.println(Arrays.toString(tabla));
        } catch (Exception e) {
        // TODO: handle exception
            System.out.println(e.getMessage());
        }
        sc.close();
    }
    
}
