public class Arrays2 {
    //Función para intercambiar los extremos de un Array
    public static int[] intercambio(int cadena[]){
        if (cadena.length >= 2){
            int temp = cadena[0];
            cadena[0] = cadena[cadena.length -1];
            cadena[cadena.length -1] = temp;
        }

        return cadena;

    }
    public static void main(String[] args) {
        //Declaramos un Array con los números enteros
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Llamamos a la función
        intercambio(numeros);

        //Imprimimos el resultado
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] + " ");
        }
    }
    
}
