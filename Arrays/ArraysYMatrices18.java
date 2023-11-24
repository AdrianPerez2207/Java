import java.util.Arrays;
public class ArraysYMatrices18 {
    //Función para generar números aleatorios
    public static int generarNumero(int maximo, int minimo)throws Exception{
        //Si min > max, lanzamos Exception "min debe ser menor que max"
        if (minimo > maximo) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }
        return (int) ((Math.random()*(maximo - minimo + 1) + minimo));
    }
    public static void main(String[] args) {
        
        int array[][] = new int[4][5];
        int nuevoArray[][] = new int[5][6];
        int suma1 = 0;
        int sumaFilas[] = new int[4];
        int suma2 = 0;
        int sumaColumnas[] = new int[5];
        int sumaTotal = 0;
        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = generarNumero(9, 0);
                }
            }
            for (int i = 0; i < array.length; i++) {
                suma1 = 0;
                for (int j = 0; j < array[i].length; j++) {
                    suma1 = suma1 + array[i][j];
                }
                sumaFilas[i] = suma1;
            }
            System.out.println(Arrays.toString(sumaFilas));

            for (int i = 0; i < array[0].length; i++) {
                suma2 = 0;
                for (int j = 0; j < array.length; j++) {
                    suma2 = suma2 + array[j][i];
                }
                sumaColumnas[i] = suma2;
            }
            System.out.println(Arrays.toString(sumaColumnas));

            for (int i = 0; i < sumaColumnas.length; i++){
                sumaTotal += sumaColumnas[i];
            }
            System.out.println(sumaTotal);

            for (int i = 0; i < nuevoArray.length; i++) {
                for (int j = 0; j < nuevoArray[i].length; j++) {
                    if (i == 4 && j == 5) {
                        nuevoArray[i][j] = sumaTotal;
                    } else if (i == 4 || j == 5) { // Cambiar a '||' en lugar de '&&'
                        if (i == 4) {
                        nuevoArray[i][j] = sumaFilas[j];
                        } else {
                        nuevoArray[i][j] = sumaColumnas[i];
                        }
                    }
                }
            }            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
