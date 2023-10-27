public class EstructurasBasicasDeControl6 {

    public static void main(String[] args) {
        
        int numero = 1;
        int contador = 0;
        int suma = 0;

        while (contador < 100) {
            if (numero % 2 != 0){
                suma += numero;
                contador++;
            }
            numero++;
        }
        System.out.println("La suma de los 100 primeros números impares es: " + numero);
    }
    
}
