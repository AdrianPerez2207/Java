package Arrays;

import java.util.Arrays;

public class ArraysYMatrices6 {

    public static int generarNumeros(){
        //Generar números del 1 al 50
        int numeros = (int) (Math.random() * 50) + 1;
        return numeros;
    }

    public static void main(String[] args) {
        
        int numeros[] = new int[10];
        //Generamos números aleatorios y rellenamos el Array
        for (int i = 0; i < numeros.length; i++ ){
            numeros[i] = generarNumeros();
        }
        System.out.println(Arrays.toString(numeros));
        //Intercambiamos los números creando 2 variables, dándole a la primera, la posición 0 y a la otra la última posición
        int posición1 = 0;
        int posición2 = numeros.length - 1;
        int array[] = new int[numeros.length];

        for (int i = 0; i < array.length; i+=2){
            array[i] = numeros[posición1];
            array[i + 1] = numeros[posición2];
            posición1++;
            posición2--;
        }
        System.out.println(Arrays.toString(array));
    }
    
}
 