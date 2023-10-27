import java.util.Scanner;

public class EstructurasBasicasDeControl8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número del 1 al 10.");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + "x" + i + ":" + (numero * i));
        }

        }
    }
