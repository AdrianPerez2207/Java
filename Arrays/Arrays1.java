public class Arrays1 {
    //Función para generar un número entre mínimo y máximo
    public static int generarNumero(int maximo, int minimo){

        return (int) ((Math.random()*(maximo - minimo + 1) + minimo));
    }

    public static void main(String[] args) {
        
        int numeros[] = new int[20];
        int contadorPositivo = 0;
        int contadorNegativo = 0;


        for (int i = 0; i < numeros.length; i++){
            numeros[i] = generarNumero(100, (-100));
        }
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > 0) {
                contadorPositivo++;
            }
            if (numeros[i] < 0){
                contadorNegativo++;
            }
        }
            System.out.println("Números positivos: " + contadorPositivo);
            System.out.println("Números negativos: " + contadorNegativo);
    }
    
}
