import java.util.Scanner;

public class EstructurasBasicasDeControl1 {

    public static int numEnteros (int a, int b, int c) {
        int mayor = a;
        if (b > mayor){
            mayor = b;
        }
        if (c > mayor){
            mayor = c;
        }
        
        return mayor;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa 3 números enteros.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int resultado = numEnteros(a, b, c);
        
        System.out.println("El mayor es: " + resultado);
        sc.close();

    }
    
}
