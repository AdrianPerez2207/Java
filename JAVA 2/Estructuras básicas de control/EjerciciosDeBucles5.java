import java.util.Scanner;

public class EjerciciosDeBucles5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //variables
        int numero;

        //Pedir número por teclado
        System.out.println("Escribe un número");
        numero = sc.nextInt();
        //Bucle
        while (numero < 1 || numero >10){
            System.out.println("Sigue intentando");
            if (numero > 1 || numero < 10){
                break;
            } System.out.println("Acertaste");
        }
    

        sc.close();
    }
    
}
