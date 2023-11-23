import java.util.Arrays;
public class ArraysYMatrices10 {
        //Función para generar números aleatorios
        public static int generarNumero(int maximo, int minimo)throws Exception{
            //Si min > max, lanzamos Exception "min debe ser menor que max"
            if (minimo > maximo) {
                throw new Exception("El valor mínimo no puede ser mayor que el máximo");
            }
            return (int) ((Math.random()*(maximo - minimo + 1) + minimo));
        }
        //Función para comparar númerosy que nos devuelva true o false, y que no guarde ese número
        public static boolean compararNumeros(int num, int array[]){
            for (int i = 0; i < array.length; i++){
                if (array[i] == num){
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args){
        
        int loteria[] = new int[6];
        int numero;
        try {
            //Recorremos el array y hacemos un do-while para rellenar y comparar los números
            for (int i = 0; i < loteria.length; i++){
                do{
                    //Generamos números aleatorios y lo guardamos en una variable
                    numero = generarNumero(49, 1);
                    System.out.println(numero);
                    //Comparamos si el número está repetido, y rellenamos el array (números que no están repetidos)
                } while (compararNumeros(numero, loteria));
                loteria[i] = numero;
            }
            System.out.println(Arrays.toString(loteria));
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
