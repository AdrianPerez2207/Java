import java.util.Scanner;

public class EstructurasBasicasDeControl3 {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        //Pedir número por teclado
        System.out.println("Escribe un número de un dígito");
        int numero = sc.nextInt();

        //Imprimir el número en dígito
        switch (numero){
            case 1: 
            if (numero == 1){
                System.out.println("Uno");
            } break;
            case 2: 
            if (numero == 2){
                System.out.println("Dos");
            } break;
            case 3: 
            if (numero == 3){
                System.out.println("Tres");
            } break;
             case 4: 
            if (numero == 4){
                System.out.println("Cuatro");
            } break;
             case 5: 
            if (numero == 5){
                System.out.println("Cinco");
            } break;
             case 6: 
            if (numero == 6){
                System.out.println("Seis");
            } break;
             case 7: 
            if (numero == 7){
                System.out.println("Siete");
            } break;
             case 8: 
            if (numero == 8){
                System.out.println("Ocho");
            } break;
             case 9: 
            if (numero == 9){
                System.out.println("Nueve");
            } break;
             default: 
                System.out.println("Error. No es un número de un dígito");

            }
            sc.close();
    }
        
}

