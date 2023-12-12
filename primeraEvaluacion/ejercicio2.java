/*Craps. Es un juego de dados muy facil, y consiste en arrojar la suma de 2 dados,
y su suma es 7 u 11 ganas la partida. En cambio, si sacas un 2, 3 o 12 pierdes. Con cualquier
otro numero que saques, debes guardar ese número y tirar los dados repetidamente hasta
volver a sacar ese dado (ganas) o sacar el 7 (pierdes). Realiza el juego para dos jugadores
simulando las tiradas de forma aleatoria y que jueguen 10 partidas, indica cuántas partidas
gana jugador1 y cuántas jugador2. Ahora simula 1000 partidas e indica las partidas que
gana cada uno.*/
package primeraEvaluacion;

public class ejercicio2 {
    //Función para generar números aleatorios
    public static int generarNumero(int minimo, int maximo){
        return (int) ((Math.random()*(maximo - minimo + 1) + minimo));
    }

    public static void main(String[] args) {
        int dado1 = 0;
        int dado2 = 0;
        int tirada1J1 = 0;
        int tirada2J2 = 0;
        int tirada1J2 = 0;
        int tirada2J1 = 0;
        int numeroAnterior1 = 0;
        int numeroAnterior2 = 0;
        int ganadas1 = 0;
        int ganadas2 = 0;
        int perdidas1 = 0;
        int perdidas2 = 0;
        //Generamos un bucle para generar las rondas que queramos
        for (int i = 0; i < 10; i++) {
            //Generamos la tirada del jugador 1 y la pintamos por pantalla
            tirada1J1 = generarNumero(1, 6);
            tirada2J1 = generarNumero(1, 6);
            dado1 = tirada1J1 + tirada2J1;
            System.out.println("Resultado jugador 1: " + dado1);

            if (dado1 == 7 || dado1 == 11) { //Si la tiradas es igual que 7 u 11, gana roda y le sumamos 1 al contador de rondas ganadas
                System.out.println("Ganas ronda!!");
                ganadas1++;
            } else if (dado1 == 2 || dado1 == 3 || dado1 == 12) { //Si el dado es igual a 2, 3 o 12, pierde ronda y le sumamos 1 a rondas perdidas
                System.out.println("Pierdes ronda..");
                perdidas1++;
            } else {
                numeroAnterior1 = dado1; //Guardamos la tirada del dado en una variable
                while (dado1 != 7) { //Hacemos otro bucle para generar tiradas repetidamente hasta que vuelva a sacar el número del dado anterior o un 7
                    tirada1J1 = generarNumero(1, 6);
                    tirada2J1 = generarNumero(1, 6);
                    dado1 = tirada1J1 + tirada2J1;
                    System.out.println("Nuevo resultado de jugador 1:" + dado1);
                    if (dado1 == numeroAnterior1) { //Si el resultado de la nueva tirada es igual al resulado de la anterior, gana ronda
                        System.out.println("Ganas ronda!!");
                        ganadas1++;
                        break;
                    } else if (dado1 == 7) { //Si es igual a 7, pierde ronda
                        System.out.println("Pierdes ronda");
                        perdidas1++;
                        break;
                    }
                }
                numeroAnterior1 = 0; //Volvemos a poner la variable a 0 para seguir la siguiente ronda
            }
            //Hacemos lo mismo con el jugador 2
            tirada1J2 = generarNumero(1, 6);
            tirada2J2 = generarNumero(1, 6);
            dado2 = tirada1J2 + tirada2J2;
            System.out.println("Resultado jugador 2: " + dado2);
            if (dado2 == 7 || dado2 == 11) {
                System.out.println("Ganas ronda!!");
                ganadas2++;
            } else if (dado2 == 2 || dado2 == 3 || dado2 == 12) {
                System.out.println("Pierdes ronda..");
                perdidas2++;
            } else {
                numeroAnterior2 = dado2;
                while (dado2 != 7) {
                    tirada1J2 = generarNumero(1, 6);
                    tirada2J2 = generarNumero(1, 6);
                    dado2 = tirada1J2 + tirada2J2;
                    System.out.println("Nuevo resultado de jugador 2:" + dado2);
                    if (dado2 == numeroAnterior2) {
                        System.out.println("Ganas ronda!!");
                        ganadas2++;
                        break;
                    } else if (dado2 == 7) {
                        System.out.println("Pierdes ronda");
                        perdidas2++;
                        break;
                    }
                }
                numeroAnterior2 = 0;
            }
        }
        //Pintamos jugadas ganadas y perdidas por pantalla
        System.out.println();
        System.out.println("Partidas ganadas de jugador 1: " + ganadas1);
        System.out.println("Partidas perdidas de jugador 1: " + perdidas1);
        System.out.println("Partidas ganadas de jugador 2: " + ganadas2);
        System.out.println("Partidas perdidas de jugador 2: " + perdidas2);
        System.out.println();
        //Generamos condiciones para determinar al ganador
        if (ganadas1 > ganadas2) { 
            System.out.println("HA GANADO EL JUGADOR 1!!");
        } else if (ganadas2 > ganadas1) {
            System.out.println("HA GANADO EL JUGADOR 2!!");
        } else {
            System.out.println("EMPATE!!!");
        }
    }
    
}
