import java.util.Arrays;
public class ArraysYMatrices16 {

    public static int generarNumeros(){
        //Generar números del 1 al 50
        int numeros = (int) (Math.random() * 50) + 1;
        return numeros;
    }
    
    public static void main(String[] args) {
        
        int matriz[][] = new int[3][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = generarNumeros();
            }
            
        }
    }
}
