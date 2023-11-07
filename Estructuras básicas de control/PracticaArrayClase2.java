import java.util.Scanner;

public class PracticaArrayClase2 {

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Creamos Array
        int pares[] = new int[50];
        int impares[] = new int[50];
        int numeros[] = new int[100];
        int contadorPares = 0;
        int contadorImpares = 0;
        //For para mostrar todos los números del 1 al 100
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;
        }
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        //Creamos un bucle y una nueva variable "contador", verificamos que el número sea par, y lo guardamos en el nuevo Array, que le damos el valor del contador.
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                pares[contadorPares] = numeros[i];
                contadorPares++;
            }
        }
        for(int i = 0; i < pares.length; i++){
            System.out.println(pares[i]);
        }
        //Lo mismo para los impares
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 != 0){
                impares[contadorImpares] = numeros[i];
                contadorImpares++;
            }
        }
        for(int i = 0; i < pares.length; i++){
            System.out.println(impares[i]);
        }
    }
    
}