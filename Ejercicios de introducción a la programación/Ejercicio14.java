import java.util.Random;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        //Crear objeto de clase ramdon
        Random random = new Random();

        //Generar un número aleatorio entrre 1 y 6
        int resultado;
        resultado = random.nextInt(6) + 1;

        //Imprimimos resultado
        System.out.println("El resultado es " + resultado);

    }
    
}
