package Pruebaclase;

import java.util.Arrays;
public class EjercicioMatrices {

    public static void main(String[] args) {
        
        String tablero[][] = new String[8][8];

        //Recorremos el array bidimensional 
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if ((i % 2 == 0) && (j % 2 != 0)){ //Generamos condiciones para rellenarlo con blancos y negros
                    tablero[i][j] = "B";
                }  
                if ((i % 2 == 0) && (j % 2 == 0)){
                    tablero[i][j] = "W";
                }
                if ((i % 2 != 0) && (j % 2 == 0)){
                    tablero[i][j] = "B";
                } 
                if ((i % 2 != 0) && (j % 2 != 0)){
                    tablero[i][j] = "W";
                }
            }
        }
        for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i])); //IMprimimos el array para asegurarnos de que se rellene bien   
        }
        //Volvemos a recorrer el array para incrementarle las piezas del ajedrez
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                //Generamos condiciones: en esas posiciones ponemos las fichas
                if (i == 1) {
                    tablero[i][j] = "IN"; //Peón
                }
                if (i == 6) {
                    tablero[i][j] = "IB";
                }
                if ((i == 0 && j == 0) || (i == 0 && j == 7)) {
                    tablero[i][j] = "TN"; //Torre
                }
                if ((i == 7 && j == 0) || (i == 7 && j == 7)){
                    tablero[i][j] = "TB";
                }
                if ((i == 0 && j == 1) || (i == 0 && j == 6)) {
                    tablero[i][j] = "XN"; //Alfil
                }
                if ((i == 7 && j == 1) || (i == 7 && j == 6)) {
                    tablero[i][j] = "XB";
                }
                if ((i == 0 && j == 2) || (i == 0 && j == 5)) {
                    tablero[i][j] = "LN"; //Caballo
                }
                if ((i == 7 && j == 2) || (i == 7 && j == 5)) {
                    tablero[i][j] = "LB";
                }
                if (i == 0 && j == 4){
                    tablero[i][j] = "ON"; //Reina
                }
                if (i == 7 && j == 4) {
                    tablero[i][j] = "OB";
                }
                if (i == 0 && j == 3){
                    tablero[i][j] = "+N"; //Rey
                }
                if (i == 7 && j == 3) {
                    tablero[i][j] = "+B";
                }
            }
        }
        System.out.println(); //Separamos los Arrays

        //Pintamos los Arrays
        for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }
    }
    
}
