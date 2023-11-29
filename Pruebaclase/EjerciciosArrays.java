/*Dados. Escriba un programa que genere la tirada de 2 dados (de 6 lados) y genere tiradas
aleatorias y vaya sumando sus resultados hasta que ambos saquen un 6. Se deben
mostrar todas las tiradas, el número de tiradas realizadas y la suma de ambos dados
hasta que sacaron ambos un 6. Escribe después una función llamada double[]
estadisticas(int n) que lance un dado aleatoriamente un número n de veces recibido
como parámetro y debes retornar el porcentaje de apariciones de cada número del
dado en las n tiradas (double[]). Pruébalo con n = 100 y n = 1000*/
import java.util.Arrays;
public class EjerciciosArrays {
            //Función para generar números aleatorios
            public static int generarNumero(int maximo, int minimo){
                return (int) ((Math.random()*(maximo - minimo + 1) + minimo));
            }
            public static double[] generarEstadisticas(int n){

                int dado = 0;
                int contador1 = 0;
                int contador2 = 0;
                int contador3 = 0;
                int contador4 = 0;
                int contador5 = 0;
                int contador6 = 0;

                    for (int i = 0; i <= n; i++){
                        dado = generarNumero(6, 1);

                        if (dado == 1) {
                            contador1++;
                        }
                        if (dado == 2) {
                            contador2++;
                        }
                        if (dado == 3) {
                            contador3++;
                        }
                        if (dado == 4) {
                            contador4++;
                        }
                        if (dado == 5) {
                            contador5++;
                        }
                        if (dado == 6) {
                            contador6++;
                        }
                    }

                    double estadisticas[] = {(double)contador1 / n * 100, (double)contador2 / n * 100, (double)contador3 / n * 100, (double)contador4 / n * 100, (double)contador5 / n * 100, (double)contador6 / n * 100}; 

                return estadisticas;
            }

    public static void main(String[] args) {
        
        int dado1 = 0;
        int dado2 = 0;
        int suma1 = 0;
        int suma2 = 0;
        int tiradas = 0;

        try {
            //Bucle mientras "dado1" y "dado2" no sean iguales a "6"
            while (dado1 != 6 || dado2 != 6) {
                dado1 = generarNumero(6, 1); //Generamos tiradas
                dado2 = generarNumero(6, 1);
                tiradas++; //Contamos el número de veces que reorremos el bucle para determinar el número de tiradas

                System.out.println("Dado 1: " + dado1 + " /" + " Dado 2: " + dado2);
                //Generamos 2 variables para ir sumando los puntos de cada dado y tirada
                suma1 += dado1;
                suma2 += dado2;
            }
            //Imprimimos por pantalla
            System.out.println("La suma de dado 1 es: " + suma1);
            System.out.println("La suma de dado 2 es: " + suma2);
            System.out.println("Número de tiradas: " + tiradas);

            generarEstadisticas(100);
            System.out.println(Arrays.toString(generarEstadisticas(100)));

            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
