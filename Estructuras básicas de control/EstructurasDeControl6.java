public class EstructurasDeControl6 {

    public static void main(String[] args) {

        //Variables
        int numero = 0;
        int suma = 0;
        int contador = 0;

        //Hacemos un bucle para sumar los 100 primeros números impares
        while (contador < 100){
            if ( numero % 2 !=0){
                suma = suma + numero;
                contador++;
            }
            numero++;
        }
        
        //Imprimimos resultado
        System.out.println("La suma de los 100 primeros números impares es: " + numero);



    }
    
}
