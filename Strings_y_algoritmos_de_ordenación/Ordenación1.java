package Strings_y_algoritmos_de_ordenación;
import java.util.Arrays;
public class Ordenación1 {
    //Función para generar números aleatorios
    public static int generarNumero(int maximo, int minimo){
        return (int) ((Math.random()*(maximo - minimo + 1) + minimo));
    }
    //Función método de la burbuja
    public static void metodoBurbuja(int array[]){
        int temporal; //Generamos una variable para guardar el valor de j + 1 temporalmente
        //Recorremos el array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) { //Segundo "for" para ordenar números de 2 en 2
                if (array[j] > array[j + 1]) {
                    temporal = array[j + 1]; //Guardamos el valor
                    array[j + 1] = array[j];
                    array[j] = temporal; //Lo devolvemos a "j" para que no desaparezca ese valor
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = new int[50];
        //Llenamos el Array de números aleatorios entre 1 y 100
        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumero(1, 100);
        }
        //Llamamos a la función y pintamos
        metodoBurbuja(array);
        System.out.println(Arrays.toString(array));
        
    }
    
}
