import java.util.Arrays;
import java.util.Scanner;
public class Arrays3 {
    //Función para generar números aleatorios
    public static int generarNumero(int maximo, int minimo)throws Exception{
        //Si min > max, lanzamos Exception "min debe ser menor que max"
        if (minimo > maximo) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }
        return (int) ((Math.random()*(maximo - minimo + 1) + minimo));
    }

    public static void main(String[] args) {

        //Declaramos variables
        Scanner sc = new Scanner(System.in);
        int longitud = 0;
        int digito;

        //Pedimos la longitud y el dígito por teclado, generamos los números aleatoriamente
        try {
            System.out.println("Ingresa el la longitud del Array");
            longitud = Integer.parseInt(sc.nextLine());
            System.out.println("Dime el dígito que quieres que aparezca");
            digito = Integer.parseInt(sc.nextLine());
            int numeros[] = new int[longitud];

            for (int i = 0; i < numeros.length; i++){
                numeros[i] = generarNumero(300, 1);
            }
            System.out.println(Arrays.toString(numeros));
            //Creamos 2 nuevas variables, una de ellas array
            int numerosAcabados[] = new int[longitud];
            int posicion = 0;
            //Generamos un for para recorrer el array inicial, y hacemos una condición
            //Con esa condición queremos encontrar el número acabado en nuestro dígito
             for (int i = 0; i < numeros.length; i++){
                if (numeros[i] % 10 == digito){
                    numerosAcabados[posicion] = numeros[i];
                    posicion++;
                }
             }
             System.out.println(Arrays.toString(numerosAcabados));

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        sc.close();
    }
    
}
