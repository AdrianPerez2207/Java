package primeraEvaluacion;
import java.util.Arrays;
import java.util.Scanner;
public class ejercicio4 {
    //Función para pintar la matriz
    public static void pintarMatriz(String matriz[][]) {
        for(int i=0; i<matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
    public static String colocarBarco(int x, int y, String direccion, int longitudBarco, String letra, String matriz[][]){
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matriz[][] = new String[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = "a";
            }
        }
        pintarMatriz(matriz);
    }
    
}
