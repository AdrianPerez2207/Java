/*Nos piden crear una matriz 20×20 de números enteros que inicialmente
rellenamos de valores aleatorios (1-100), nos piden hacer un menú con estas opciones:
1. Intercambiar fila. Te pedirá dos números de fila e intercambiará los valores de la
primera por los valores de la segunda.
2. Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
3. Sumar la diagonal principal y la diagonal inversa, y mostrar las dos sumas **
4. Pintar las coordenadas i,j donde se encuentra el mayor elemento de la matriz.
5. Pinta la matriz traspuesta
6. Muestra la matriz con las filas ordenadas de mayor a menor
7. Salir*/

package primeraEvaluacion;
import java.util.Arrays;
import java.util.Scanner;
public class ejercicio1 {
    //Función para ordenar filas
    public static int[][] matrizOrdenada(int matriz[][]){
        int ordenada[][] = new int[20][20];
        //Recorremos las filas de la matriz y las ordenamos con el metodo Arrays.sort
        for (int i = 0; i < matriz.length; i++) {
            Arrays.sort(matriz[i]);
        }
        //Guardamosla matriz ordenada en una nueva variable
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                ordenada[i][j] = matriz[i][j];
            }
        }
        return ordenada;
    }

    public static void matrizTraspuesta(int matriz[][]){
        int tempI[][] = new int[matriz.length][matriz.length];
        int tempJ[] = new int[matriz.length * matriz.length];
        int traspuesta[][] = new int[20][20];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                tempJ[j] = matriz[j][i];
            }
        }
        System.out.println(Arrays.toString(tempJ));
    }
    public static int sumaDiagonal(int matriz[][]) {
        int suma = 0;
        //Recoremos la matriz y sumamos los números de la diagonal (si la posición de i y la posición de j son iguales)
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j){
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }
    public static int sumaInversa(int matriz[][]){
        int suma = 0;
        //Recoremos la matriz y sumamos los números de la diagonal inversa
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (j == (19 - i)){ //La diagonal inversa sería la posición inial de i = 0 y la j la última posición "19", le restamos "i" para generar la posición inversa
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }

    //Función para umar columnas
    public static int sumaColumas(int matriz[][], int columna) throws Exception {
        int suma = 0;
        //Comprobamos que la columna es válida
        if (columna > matriz.length) {
            throw new Exception("No es una columna válida");
        }
        if (columna > matriz[0].length) {
            throw new Exception("No es una columna válida");
        }
        if (columna < 0) {
            throw new Exception("No es una columna válida");
        }
        //Generamos una variable y le damos el valor de la fila
        int aux[] = new int[matriz[0].length];
        //Recorremos las columnas de la matriz y las guardamos la nueva variable generada
        for (int j = 0; j < matriz.length; j++) {
            aux[j] = matriz[j][columna];
        }
        //Recorremos esa variable y sumamos todos los valores
        for (int i = 0; i < aux.length; i++) {
            suma += aux[i];
        }

        
        return suma;


    }

    //Función para generar números aleatorios
    public static int generarNumero(int minimo, int maximo){
        return (int) ((Math.random()*(maximo - minimo + 1) + minimo));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[20][20];
        int opcion;
        int columna;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = generarNumero(1, 100); 
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        try {
            do {
            //Pintamos por teclado todas las opciones a elegir
            System.out.println("Elige la opción que quieras realizar");
            System.out.println("1: Intercambiar fila");
            System.out.println("2: Suma de una columna");
            System.out.println("3: Sumar diagonal principal y diagonal inversa");
            System.out.println("4: Pintar las coordenadas i,j donde se encuentra el mayor elemento de la matriz.");
            System.out.println("5. Pintar la matriz traspuesta");
            System.out.println("6. Muestra la matriz con las filas ordenadas de mayor a menor");
            System.out.println("7. salir");
            //Pedimos todas las opciones por teclado
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    System.out.println("Elige una columna");
                    columna = Integer.parseInt(sc.nextLine());
                    System.out.println("La suma de la columna es: " + sumaColumas(matriz, columna));
                    break;
                case 3:
                    System.out.println("La suma de la diagonal es: " + sumaDiagonal(matriz));
                    System.out.println("La suma de la diagonal inversa es: " + sumaInversa(matriz));
                    break;
                case 4:
                    
                    break;
                case 5:
                    matrizTraspuesta(matriz);
                    break;
                case 6:
                    matrizOrdenada(matriz);
                    for (int i = 0; i < matriz.length; i++) {
                        System.out.println(Arrays.toString(matriz[i]));   
                    }
                    break;
                case 7:
                    System.out.println("Gracias por su colaboración. ¡ADIÓS!");
                    break;
                default:
                    break;
            }
            System.out.println();
            } while (opcion != 7);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
    
}
