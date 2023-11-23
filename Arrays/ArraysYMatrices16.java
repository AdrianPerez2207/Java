import java.util.Arrays;
public class ArraysYMatrices16 {

    public static int generarNumeros(){
        //Generar números del 1 al 50
        int numeros = (int) (Math.random() * 50) + 1;
        return numeros;
    }
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
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    do {
                        numero = generarNumeros();
                        System.out.println(numero);
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
