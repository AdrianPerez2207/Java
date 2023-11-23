import java.util.Arrays;
import java.util.Scanner;
public class ArraysYMatrices9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double tiempos[] = new double[10];
        try {
            //Pedir los tiempos de los corredores por teclado
            for (int i = 0; i < tiempos.length; i++){
                System.out.println("Ingresa el tiempo del corredor " + (i + 1) + ":");
                tiempos[i] = sc.nextDouble();
            }
            //Ordenamos lo tiempos de los corredores
            Arrays.sort(tiempos);
            System.out.println("Tiempos ordenados: " + Arrays.toString(tiempos));
            //Imprimimos el primer, segundo, tercero y último puesto
            System.out.println("El primer puesto: " + tiempos[0]);
            System.out.println("Segundo puesto: " + tiempos[1]);
            System.out.println("Tercer puesto: " + tiempos[2]);
            System.out.println("Último puesto: " + (tiempos[tiempos.length - 1]));
            //Recorremos el array y sumamos todos los tiempos
            double sumaTiempos = 0;
            for (int i = 0; i < tiempos.length; i++){
                sumaTiempos += tiempos[i];
            }
            //Sacamos e imprimimos el tiempo medio
            double tiempoMedio = 0;
            tiempoMedio = sumaTiempos / 10;
            System.out.println("El tiempo medio de la carrera es: " + tiempoMedio);

            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        } 
        sc.close();
    }
    
}
