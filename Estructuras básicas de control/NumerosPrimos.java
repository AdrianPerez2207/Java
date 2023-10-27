//Ejercicio: Números Primos

//Escribe un programa en Java que verifique si un número ingresado por el usuario es primo o no.
// El programa deberá realizar las siguientes funciones:

//*Implementar una función llamada esPrimo que tome un número entero como argumento y devuelva true si el número es primo y false si no lo es.
//*En el programa principal, solicitar al usuario que ingrese un número entero positivo mayor que 1.
//Utilizar la función esPrimo para determinar si el número ingresado por el usuario es primo o no.
//Mostrar un mensaje indicando si el número es primo o no.
//Asegúrate de cumplir con los siguientes requisitos:

//La función esPrimo debe implementar un algoritmo eficiente para verificar si un número es primo.

//Si el usuario ingresa un número menor o igual a 1, el programa deberá mostrar un mensaje de error y solicitar un nuevo número.
//Utiliza bucles y condicionales para realizar las verificaciones necesarias.
import java.util.Scanner;

public class NumerosPrimos {

    public static boolean esPrimo (int numero2) {
        if (numero2 < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero2); i++){
            if (numero2 % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Pedimos que el usuario ingrese un número
        System.out.println("Ingresa un número mayor que 1.");
        int numero = sc.nextInt();

        //
        }
    }
