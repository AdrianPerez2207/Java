package Strings_y_algoritmos_de_ordenación;
import java.util.Scanner;
public class String3 {

    public static int buscarCadenas(String buscar, String buscada){
        int contador = 0;
        //Variable inicio para cambiar el valor donde se inicia la búsqueda
        int inicio = 0;
        //Mientras la palabra buscada este en buscar en la siguiente posición de la anterior
        while (buscar.indexOf(buscada, inicio) != - 1) {
            buscar.indexOf(buscada, inicio);
            inicio = buscar.indexOf(buscada, inicio) + 1;
            contador++;
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String buscar;
        String buscada;

        try {
            System.out.println("Ingresa una cadena que será buscada");
            buscar = sc.nextLine();

            System.out.println("Ingresa la segunda cadena que será la buscada");
            buscada = sc.nextLine();
            
            buscarCadenas(buscar, buscada);
            System.out.println("Aparece: " + buscarCadenas(buscar, buscada));
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
    
}
