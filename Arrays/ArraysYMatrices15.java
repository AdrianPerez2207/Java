import java.util.Arrays;
public class ArraysYMatrices15 {

    public static int generarNumeros(){
        //Generar números del 1 al 50
        int numeros = (int) (Math.random() * 50) + 1;
        return numeros;
    }

    public static void main(String[] args) {
        
        int array1[][] = new int[3][3];
        int array2[][] = new int[3][3];
        int suma[][] = new int[3][3];

        //Rellenamos los Arrays con números aleatorios
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = generarNumeros();
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = generarNumeros();
            }
        }
        //Imprimimos los 2 Arrays para comprobar
        for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]));
        }
        //Hacemos un sout para separar las matrices
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }
        //Otro sout para separar de la matriz "suma"
        System.out.println();

        //Recorremos nuestra matriz "Suma" y le sumamos los valores de "array1" y "array2"
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                suma[i][j] = array1[i][j] + array2[i][j];
            }
        }
        //Imprimimos el array "suma"
        for (int i = 0; i < suma.length; i++) {
            System.out.println(Arrays.toString(suma[i]));
        }
    }
    
}
