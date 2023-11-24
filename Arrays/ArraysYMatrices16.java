import java.util.Arrays;
public class ArraysYMatrices16 {

    public static int generarNumeros(){
        //Generar números del 1 al 50
        int numeros = (int) (Math.random() * 50) + 1;
        return numeros;
    }
    //Función para comparar números y que nos devuelva true o false, y que no guarde ese número
    public static boolean compararNumeros(int num, int array[][]){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == num){
                return true;
                }      
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        int matriz[][] = new int[3][6];
        int numero;
        try {
            //Recorremos el array y hacemos un do-while para rellenar y comparar los números
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    do {
                        //Generamos números aleatorios y lo guardamos en una variable "numero"
                        numero = generarNumeros();
                        System.out.println(numero);
                        //Comparamos si el número está repetido, y rellenamos el array (números que no están repetidos)
                    } while (compararNumeros(numero, matriz));
                    matriz[i][j] = numero;
                    
                }
            }
            for (int i = 0; i < matriz.length; i++) {
                System.out.println(Arrays.toString(matriz[i]));   
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}
