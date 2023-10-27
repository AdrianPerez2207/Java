import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        
        // Pedir tiempo en segundos
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en segundos: ");
        int t = sc.nextInt();

        // Calcular horas, minutos y segundos
        int horas = t / 3600;
        int minutos = (t % 3600) / 60;
        int segundos = t % 60;

        // Imprimir el resultado
        System.out.println("Tiempo en formato HH:MM:SS -> " + horas + ":" + minutos + ":" + segundos);
    }
}
