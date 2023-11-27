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
        int nuevoArray[][] = new int[5][6]; //Este array tiene una posición mas para llenarlo con las sumas
        int suma1 = 0;
        int sumaFilas[] = new int[4];
        int suma2 = 0;
        int sumaColumnas[] = new int[5];
        int sumaTotal = 0;
        try {
            //Recorremos el Array y lo llenamos de números aleatorios
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = generarNumero(9, 0);
                }
            }
            //Recorremos el array lleno y sumamos los numeros del array fila por fila
            for (int i = 0; i < array.length; i++) {
                suma1 = 0; //Ponemos el valor de suma en "0" para sumar otra fila
                for (int j = 0; j < array[i].length; j++) {
                    suma1 = suma1 + array[i][j]; //Sumamos los elementos de la fila
                }
                sumaFilas[i] = suma1; //Lo guardamos en un aray simple
            }
            System.out.println(Arrays.toString(sumaFilas));

            //Recorremos el array lleno y sumamos los numeros del array columna por columna
            for (int i = 0; i < array[0].length; i++) {
                suma2 = 0; //Ponemos el valor de suma en "0" para sumar otra columna
                for (int j = 0; j < array.length; j++) {
                    suma2 = suma2 + array[j][i]; //Sumamos los elementos de la columna
                }
                sumaColumnas[i] = suma2; //Lo guardamos en un aray simple
            }
            System.out.println(Arrays.toString(sumaColumnas));

            //Recorremos el array simple para sumar las sumas de las columnas/filas
            for (int i = 0; i < sumaColumnas.length; i++){
                sumaTotal += sumaColumnas[i];
            }
            System.out.println(sumaTotal);

            //Recorremos el nuevoArray para guardar las sumas totales/filas/columnas
            for (int i = 0; i < nuevoArray.length; i++) {
                for (int j = 0; j < nuevoArray[i].length; j++) {
                    if (i == 4 && j == 5) { //Condición para guardar en esa posición los resultados
                        nuevoArray[i][j] = sumaTotal;
                    }
                    if (j == 5 && i < 4){ //Ponemos un tamaño menor en la "i" o "j" porque la "i" de suma viene del viejo array
                        nuevoArray[i][j] = sumaFilas[i];
                    }
                    if (i == 4 && j < 5){
                        nuevoArray[i][j] =  sumaColumnas[j];
                    }
                }
            }
            //Generamos otro bucle que llegue hasta la longitud del array viejo para llenar el nuevo que es mas grande
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    nuevoArray[i][j] = array[i][j];
                }
            }

            for (int i = 0; i < sumaColumnas.length; i++) {
                System.out.println(Arrays.toString(nuevoArray[i]));
            }           
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
