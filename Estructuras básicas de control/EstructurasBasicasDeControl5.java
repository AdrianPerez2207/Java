import java.util.Scanner;

public class EstructurasBasicasDeControl5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //variables
        int numero = 0;

        //Pedir número por teclado
        System.out.println("Escribe un número");


        //Bucle
        while (numero < 1 && numero >10){
            numero = sc.nextInt();
            System.out.println("Sigue intentando");
            if (numero > 1 && numero > 10){
                break;
            }
        }
        System.out.println("Acertaste");
        sc.close();
    }
    
}
