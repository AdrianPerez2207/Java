package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysYMatrices8 {
    public static int generarNumeros(){
        //Generar números del 1 al 50
        int numeros = (int) (Math.random() * 50) + 1;
        return numeros;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Generamos y rellenamos el array
        int tabla[] = new int[10];
        for (int i = 0; i < tabla.length; i++){
            tabla[i] = generarNumeros();
        }
       System.out.println(Arrays.toString(tabla)); 
       
       try {
        System.out.println("Escribe una posición entre 0 y 9.");
        int posicion = Integer.parseInt(sc.nextLine());
        int tablaNueva[] = new int[9];
        for (int i = 0; i < tablaNueva.length; i++){
            
        }
        
       } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
       }
    }
}
