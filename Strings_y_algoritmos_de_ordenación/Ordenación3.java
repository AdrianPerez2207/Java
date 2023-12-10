package Strings_y_algoritmos_de_ordenación;
import java.util.Arrays;
public class Ordenación3 {
    //Función para generar números aleatorios
    public static int generarNumero(int maximo, int minimo){
        return (int) ((Math.random()*(maximo - minimo + 1) + minimo));
    }
    public static int[] juntarArrays(int array[], int array2[]){
        //Inicializamos la variable con la suma de las longitudes de cada uno de los arrays
        int arrayJuntado[] = new int[array.length + array2.length];
        //Recorremos el array 1 a 1 y se lo añadimos al total
        for (int i = 0; i < array.length; i++) {
            arrayJuntado[i] = array[i]; 
        }
        for (int i = 0; i < array2.length; i++) {
            //El valor de nuestro array total sera a partir del la longitud del array1 más la i
            arrayJuntado[array.length + i] = array2[i];
        }
        return arrayJuntado;
    }
    //Función método de la burbuja
    public static void metodoBurbuja(int array[]){
        int temporal; //Generamos una variable para guardar el valor de j + 1 temporalmente
        int contador = 0; //Contador para contar el nº de veces que ordenamos el array
        //Recorremos el array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) { //Segundo "for" para ordenar números de 2 en 2
                if (array[j] > array[j + 1]) {
                    temporal = array[j + 1]; //Guardamos el valor
                    array[j + 1] = array[j];
                    array[j] = temporal; //Lo devolvemos a "j" para que no desaparezca ese valor
                    contador++;
                }
            }
            if (contador == 0) { //Si copntador es igual a 0 el array está ordenado y para
                break;
            }else { //Si no para el contador vuelve a 0
                contador = 0;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = new int[10];
        int array2[] = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumero(1, 30);
        }
        
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array2.length; i++) {
            array2[i] = generarNumero(1, 30);
        }
        System.out.println(Arrays.toString(array2));

        int arrayJuntada[] = juntarArrays(array, array2);
        metodoBurbuja(arrayJuntada);
        System.out.println(Arrays.toString(arrayJuntada));
        
    }
    
}
