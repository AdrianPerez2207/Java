public class Ejercicio12 {

    public static void main(String[] args) {
        // Definir las variables a y b
        int a = 9;
        int b = 7;

        System.out.println("Antes del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Intercambiar los valores de a y b
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Después del intercambio:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    
}
