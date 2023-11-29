package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class ArraysYMatrices13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[][] = new int[3][4];
        int suma = 0;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Esccribe el número " + (i + 1) + "/" + (j + 1));
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                suma += array[i][j];
            }
            System.out.println(suma);
            suma = 0;
        }
        sc.close();
    }
    
}
