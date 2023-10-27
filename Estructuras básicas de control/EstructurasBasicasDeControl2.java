import java.util.Scanner;

public class EstructurasBasicasDeControl2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Pedir número por teclado
        System.out.println("Escribe un número");
        int numero = sc.nextInt();

        //Indicar si es múltiplo de 2, 3, 5 o 7
        if (numero % 2 == 0){
            System.out.println("Es múltiplo de 2");
        } else if (numero % 3 == 0){
            System.out.println("Es múltiplo de 3");
        } else if (numero % 5 == 0){
            System.out.println("Es múltiplo de 5");
        } else if (numero % 7 == 0){
            System.out.println("Es múltiplo de 7");
        }
        sc.close();
    
    }
}
