package Pruebaclase;
import java.util.Arrays;
public class domino {

    public static void main(String[] args) {
        
        int fichas[][] = new int[28][2];
        int contador = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                 fichas[contador][0] = i;
                 fichas[contador][1] = j;
                 contador++;
            }
        }

        for (int i = 0; i < fichas.length; i++) {
            System.out.println(Arrays.toString(fichas[i]));
        }


    }
    
}
