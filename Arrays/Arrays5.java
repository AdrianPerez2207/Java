import java.util.Scanner;

public class Arrays5 {

    public static double generarMedia(int array[]){ //Fución para calcular la media
        int suma = 0;
        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
        double media = suma / array.length;
        return media;
    }

    public static int encontrarMayor(int array[]){ //Función para calcular el mayor
        int mayor = array[0]; //A mayor le damos el valor del array en la posición 0
        for (int i = 0; i < array.length; i++){//Recorremos todo el array para ver que números son mayores y guardamos el mayor en la variable "Mayor"
            if (array[i] > mayor) {
               mayor = array[i]; 
            }
        }
        return mayor;
    }

    public static int encontrarMenor(int array[]){ //Función para calcular el menor
        int menor = array[0]; //A menor le damos el valor del array en la posición 0
        for (int i = 0; i < array.length; i++){//Recorremos todo el array para ver que números son menores y guardamos el mayor en la variable "Menor"
            if (array[i] < menor){
                menor = array[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[10];

        try {
            System.out.println("Escribe 10 números enteros"); //Pedimos los números por teclado
            for (int i = 0; i < 10; i++){
                System.out.println("Número " + (i + 1));
                numeros[i] = Integer.parseInt(sc.nextLine());
            }
            //Generamos nuevas variables y llamamos a las funciones
            double media = generarMedia(numeros);
            int mayor = encontrarMayor(numeros);
            int menor = encontrarMenor(numeros);

            //Imprimimos resultados por teclado
            System.out.println("La media de los números es: " + media);
            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        sc.close();
    }
    
}
