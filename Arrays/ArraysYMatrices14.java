package Arrays;

import java.util.Arrays;
public class ArraysYMatrices14 {

    public static double generarMedia(int array[][]){ //Fución para calcular la media
        int suma = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                suma += array[i][j];   
            }
        }
        double media = suma / 15;
        return media;
    }
    public static int encontrarMayor(int array[][]){ //Función para calcular el mayor
        int mayor = array[0][0]; //A mayor le damos el valor del array en la posición 0
        for (int i = 0; i < array.length; i++){//Recorremos todo el array para ver que números son mayores
            for (int j = 0; j < array[i].length; j++) { //Guardamos el mayor en la variable "Mayor"
                if (array[i][j] > mayor) {
                mayor = array[i][j]; 
                }
            }
        }
        return mayor;
    }
    public static int encontrarMenor(int array[][]){ //Función para calcular el menor
        int menor = array[0][0]; //A menor le damos el valor del array en la posición 0
        for (int i = 0; i < array.length; i++){ //Recorremos todo el array para ver que números son menores
            for (int j = 0; j < array[i].length; j++) { //Guardamos el menor en la variable "Menor"
                if (array[i][j] < menor){
                    menor = array[i][j];
                }
            }    
        }
        return menor;
    }

    public static int generarNumeros(){
        //Generar números del 1 al 50
        int numeros = (int) (Math.random() * 50) + 1;
        return numeros;
    }

    public static void main(String[] args) {

        int matriz[][] = new int[5][3];
        //Rellenamos el array aleatoriamente
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = generarNumeros();
            }
        }
        //Imprimimos el array
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        //Recorremos el array e implementamos la función de "media"
        double media = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                media = generarMedia(matriz);
            }
        }
        //Recorremos el array e implementamos la función de "mayor"
        int mayor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                mayor = encontrarMayor(matriz);
            }
        }
        //Recorremos el array e implementamos la función de "menor"
        int menor = 100;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                menor = encontrarMenor(matriz);
            }
        }
        System.out.println("La media es: " + media);
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
    }
    
}
