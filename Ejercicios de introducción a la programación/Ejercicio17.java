import java.util.Random;

public class Ejercicio17 {

    public static void main(String[] args) {
        
         // a. Crear un número entero positivo aleatorio entre 1 y 49.
         int a = (int) (Math.random() * 49) + 1;
         System.out.println(a);

        // b. Generar un número aleatorio positivo par.
        int n = (int) (Math.random() * (100 - 1)) + 1;
        System.out.println(n * 2);

         // c. Generar un número real aleatorio entre 1 y 10.
         double c = Math.random() * 9 + 1;
         System.out.println(c);
 
         // d. Crear un número entero negativo entre -50 y -150.
         int d = -((int) (Math.random() * 100 + 1)) - 50;
         System.out.println(d);
 
         // e. Crear un número entero entre -100 y 100.
         int e = (int) (Math.random() * 200 + 1) - (-100);
         System.out.println(e);
 
         // f. Generar un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77
         n = (int) (Math.random() * (6 - 1)) + 1;
         switch (n){
            case 1:
            System.out.println("5");
            break;
            case 2:
            System.out.println("7");
            break;
            case 3:
            System.out.println("33");
            break;
            case 4:
            System.out.println("125");
            break;
            case 5:
            System.out.println("77");
            break;
            default:
            break;
         }
 
         // g. Crea un generador aleatorio de uno de los meses del año
         n = (int) (Math.random() * (13 - 1)) + 1;
         switch (n){
            case 1:
            System.out.println("Enero");
            break;
            case 2:
            System.out.println("Febrero");
            break;
            case 3:
            System.out.println("Marzo");
            break;
            case 4:
            System.out.println("Abril");
            break;
            case 5:
            System.out.println("Mayo");
            break;
            case 6:
            System.out.println("Junio");
            break;
            case 7:
            System.out.println("Julio");
            break;
            case 8:
            System.out.println("Agosto");
            break;
            case 9:
            System.out.println("Septiembre");
            break;
            case 10:
            System.out.println("Octubre");
            break;
            case 11:
            System.out.println("Noviembre");
            break;
            case 12:
            System.out.println("Diciembre");
            break;
         }
         }
      }