import java.util.Arrays;
public class ArraysYMatrices12 {

    public static void main(String[] args) {

        int marco[][] = new int[8][6];

        for (int i = 0; i < marco.length; i++){
            for (int j = 0; j < marco[i].length; j++){
                if (j == 0 || i == 0 || j == 5 || i == 7) {
                    marco[i][j] = 1;
                } 
            }
        }
        for (int i = 0; i < marco.length; i++){
            System.out.println(Arrays.toString(marco[i]));
        }
    }
    
}
