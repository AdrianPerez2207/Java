import java.util.Arrays;
public class ArraysYMatrices17 {
    //Función para ordenar las filas de un array
    public static void ordenarFilas(int matriz[][]){
        //Recorremos solamente las filas y ordenamos con "Arrays.sort"
        for (int i = 0; i < matriz.length; i++) {
            Arrays.sort(matriz[i]);
        }
    }
    //Función para ordenar las columnas de un array
    public static void ordenarColumnas(int matriz[][]){
        //Creamos una variable "Array" simple
        int columna[] = new int[matriz.length];
        //Recorremos la "Matriz" y guardamos en la variable los elementos de las columnas
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                columna[j] = matriz[j][i];
            }
            Arrays.sort(columna); //Ordenamos las columnas
            //Devolvemos los elementos a la "Matriz" ya ordenados(columnas)
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

        //Llenamos la Matriz con números aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = generarNumeros(); 
            }
        }
        //Llamamos a la función para ordenar filas y las imprimimos mediante un "for"
        ordenarFilas(matriz);
        System.out.println("Orden de las filas: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        //Pintamos "sout" para separar las matrices
        System.out.println();
        
        //Llamamos a la función para ordenar columnas y las imprimimos mediante un "for"
        ordenarColumnas(matriz);
        System.out.println("Orden de las columnas: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }

    }
    
}
