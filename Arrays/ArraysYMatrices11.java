import java.util.Arrays;
public class ArraysYMatrices11 {

    public static void main(String[] args) {
        
        int tabla[][] = new int[5][5];

        for (int i = 0; i < tabla.length; i++){
            for (int j = 0; j < tabla[i].length; j++){
                if (i == j){
                    tabla[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < tabla.length; i++){
            System.out.println(Arrays.toString(tabla[i]));
        }
    }
    
}
