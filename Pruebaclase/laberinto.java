package Pruebaclase;
import java.util.Arrays;
import java.util.Scanner;

public class laberinto {
    //Función para pintar la matriz
    public static void pintarMatriz(String matriz[][]) {
        for(int i=0; i<matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
    //Función para rellenar el Laberinto
    public static void rellenarLaberinto(String laberinto[][], int salida[], int posicion[]){

        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {

                laberinto[i][j] = ".";

                if ((i == 0 && j != 0) || (i == 19)){
                    laberinto[i][j] = "-";
                }
                if ((j == 0) || (j == 19)){
                    laberinto[i][j] = "|";
                }
                if (i != 0 && j != 0) {
                }
                if (salida[0] == i && salida[1] == j){
                    laberinto[i][j] = "#";
                }
                if (posicion[0] == i && posicion[1] == j) {
                    laberinto[i][j] = "@";
                } 
            }
        }
    }
    //Función para generar menú
    public static int menu(){

        System.out.println("Elige la opción para mover al jugador");
        System.out.println("1: Derecha");
        System.out.println("2: Izquierda");
        System.out.println("3: Abajo");
        System.out.println("4: Arriba");

        int opcion = Integer.parseInt(System.console().readLine());

        return opcion;
    }

    //Función para generar números aleatorios
    public static int generarNumero(int minimo, int maximo){
        return (int) ((Math.random()*(maximo - minimo + 1) + minimo));
    }

    //Función para generar una salida aleatoriamente
    public static int[] generarSalida(){
        int salida[] = new int[2];
        salida[0] = generarNumero(0, 19);
        if (salida[0] == 0){
            salida[1] = generarNumero(1, 19);
        } else if (salida[0] == 19){
            salida[1] = generarNumero(0, 19);
        } else {
            int numAleatorio = generarNumero(1, 2);
            if (numAleatorio == 1){
                salida[1] = 0;
            } else {
                salida[1] = 19;
            }
        }
        return salida;
    }

    //Función para generar la posición de la bomba
    public static int[] generarBomba(int[] salida){
        int bomba[] = new int[2];
        bomba[0] = generarNumero(1, 18);
        bomba[1] = generarNumero(1, 18);

        return bomba;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String laberinto[][] = new String[20][20];

        //Creamos un nuevo array y llamamos a la función para generar la salida
        int salida[] = generarSalida();

        //Array para generar la posición de la bomba
        int bomba[] = generarBomba(salida);

        //Salida del jugador
        int posicion[] = {0, 0};

        rellenarLaberinto(laberinto, salida, posicion);

        //Bucle para mover la figura y jugar al laberinto
        do {
            System.out.println(Arrays.toString(bomba)); //Pintamos la bomba para saber dónde está y probar que funciona
            pintarMatriz(laberinto); //Pintamos el tablero
            switch (menu()) { //Switch para elegir cada opción del menú
            case 1:
                posicion[1]++;                   
                break;
            case 2:
                posicion[1]--;                  
                break;
            case 3:
                posicion[0]++;
                break;
            case 4:
                posicion[0]--;
                break; 
            default:
                break;
            }
            if (Arrays.equals(posicion, salida)) { //Comparamos que la posición y la salida son las mismas para parar el juego
                System.out.println("Enhorabuena!! Has encontrado la salida");
                break;
            }
            if (Arrays.equals(posicion, bomba)) { //Comprobamos que hemos encontrado la bomba
                System.out.println("BOOOM!! Has encontrtado la bomba");
                break;
            }
            if ((posicion[0] < 0 || posicion[0] > 19) || (posicion[1] < 0 || posicion[1] > 19)){ //Comprobamos que no nos salimos del tablero
                System.out.println("Error!!! Te has salido del tablero");
                break;
            }
            rellenarLaberinto(laberinto, salida, posicion);

            
        } while ((!Arrays.equals(posicion, bomba)) || (!Arrays.equals(posicion, salida))); //Mientras que la posición no sea igual a bomba y salida


    }
    
}
