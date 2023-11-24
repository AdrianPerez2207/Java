import java.util.Arrays;
public class ArraysYMatrices17 {
    public static void ordenarFilas(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            Arrays.sort(matriz[i]);
        }
    }
    public static void ordenarColumnas(int matriz[][]){
        int columna[] = new int[matriz.length];

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                columna[j] = matriz[j][i];
            }
            Arrays.sort(columna);
            for (int j = 0; j < matriz.length; j++) {
                matriz[j][i] = columna[j];
            }
        }
        

    }

    public static int generarNumeros(){
        //Generar números del 1 al 500
        int numeros = (int) (Math.random() * 500) + 1;
        return numeros;
    }
    public static void main(String[] args) {
    
        int matriz[][] = new int[50][50];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = generarNumeros(); 
            }
        }
        ordenarFilas(matriz);
        System.out.println("Orden de las filas: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        System.out.println();
        
        ordenarColumnas(matriz);
        System.out.println("Orden de las columnas: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }

    }
    
}
