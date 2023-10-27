import java.util.Scanner;
//Ejercicio: Calculadora de Operaciones Básicas

//Escribe un programa en Java que realice operaciones básicas de suma, resta, multiplicación y división.
// El programa debe pedir al usuario que ingrese dos números y luego le permita elegir la operación que desea realizar.

//El programa debe mostrar el resultado de la operación y preguntar al usuario si desea realizar otra operación.
// Si el usuario elige continuar, se le pedirá que ingrese nuevamente dos números y seleccione una operación.
// Si elige salir, el programa debe mostrar un mensaje de despedida.

//Requisitos:

//Debes usar funciones separadas para cada operación (suma, resta, multiplicación y división).

//Debes manejar la división por cero. Si el usuario intenta dividir entre cero, el programa debe mostrar un mensaje de error y permitirle intentar nuevamente.
//El programa debe ser capaz de manejar números decimales.
public class CalculadoraOperacionesBásicas {

    //Generamos funciones.
    public static double suma(double num1, double num2){
        double resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }
    
    public static double resta(double num1, double num2){
        double resultado = num1 - num2;
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }

    public static double multiplicacion(double num1, double num2){
        double resultado = num1 * num2;
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }

    public static double division(double num1, double num2){
        if (num2 != 0){
        double resultado = num1 / num2;
        System.out.println("El resultado es: " + resultado);
        return resultado;
        } else {
            System.out.println("Error, no se puede dividir por 0.");
            return Double.NaN; //NaN representa "Not a number".
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Vamos a pedir 2 números por teclado
        System.out.println("Ingresa el primer número");
        double num1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresa el segundo número");
        double num2 = sc.nextDouble();
        sc.nextLine();

        String respuesta;
        do {
            System.out.println("Elige la operación");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");

            int opción = sc.nextInt();
            sc.nextLine();
            switch (opción){
                case 1:
                    suma(num1, num2);
                    break;
                case 2:
                    resta(num1, num2);
                    break;
                case 3:
                    multiplicacion(num1, num2);
                    break;
                case 4:
                    division(num1, num2);
                    break;
                    default:
                    System.out.println("Operación no valida");
                }
            
            //Preguntar si quieren volver a realizar otra operación
            System.out.println("¿Desean realizar otra operación? (s/n)");
            respuesta = sc.nextLine();
            }while (respuesta.equalsIgnoreCase("s")); 
                //Mensaje de despedida
                System.out.println("Hasta luego.");
                sc.close();

        }
    }
